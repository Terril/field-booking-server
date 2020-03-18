package com.fieldBooking.apiRequest

import com.fieldBooking.apiRequest.extensions.filterNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.info.BuildProperties
import org.springframework.boot.info.GitProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger.web.*
import springfox.documentation.swagger2.annotations.EnableSwagger2
import java.util.*

@Configuration
@EnableSwagger2
class SwaggerConfig {
    @Autowired
    lateinit var build: Optional<BuildProperties>
    @Autowired
    lateinit var git: Optional<GitProperties>
    @Bean
    fun api(): Docket {
        var version = "1.0"
        if (build.isPresent && git.isPresent) {
            val buildInfo = build.get()
            val gitInfo = git.get()
            version = "${buildInfo.version}-${gitInfo.shortCommitId}-${gitInfo.branch}"
        }
        return Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo(version))
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths{ it?.contains("/sports").filterNull() }
                .build()
                .useDefaultResponseMessages(false)
                .forCodeGeneration(true)
    }
    @Bean
    fun uiConfig(): UiConfiguration {
        return UiConfiguration(true, false, 1, 1, ModelRendering.MODEL,
                java.lang.Boolean.FALSE, DocExpansion.LIST, false, null, OperationsSorter.ALPHA, false, TagsSorter.ALPHA,
                UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS, null)
    }
    private fun apiInfo(version: String): ApiInfo {
        return ApiInfoBuilder()
                .title("API - Field Booking Services")
                .description("Field  Booking API's")
                .version(version)
                .build()
    }
}