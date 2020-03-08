package com.fielldBooking.apiRequest.mongodb.services

import com.fielldBooking.apiRequest.mongodb.BasicCrud
import com.fielldBooking.apiRequest.mongodb.FieldRepository
import com.fielldBooking.apiRequest.mongodb.datamodel.Fields
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*

@Service//declare this class as a Service "Component specialization"
class FieldService(val fieldRepository: FieldRepository) : BasicCrud<String, Fields> {

    override fun getAll(pageable: Pageable): Page<Fields> = fieldRepository.findAll(pageable)

    override fun getById(id: String): Optional<Fields> = fieldRepository.findById(id)

//    override fun insert(obj: Fields): Fields = fieldRepository.insert(obj.apply { this.author = authorDAO.findById(obj.author.id).get() })//re-insert author from db to avoid inconsistency
//
//    @Throws(Exception::class)
//    override fun update(obj: Fields): Fields {
//        return if (fieldRepository.existsById(obj.id)) {//check if book exists because the save method will insert a record if does not exists
//            fieldRepository.save(obj.apply { this.author = authorDAO.findById(obj.author.id).get() })//re-insert author from db to avoid inconsistency
//        } else {
//            throw object : Exception("Book not found") {}
//        }
//    }

    override fun deleteById(id: String): Optional<Fields> {
        return fieldRepository.findById(id).apply {
            this.ifPresent { fieldRepository.delete(it) }
        }
    }
}