package com.example.hacathon.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hacathon.model.Document

class DocumentViewModel : ViewModel() {
//    private val repository = DocumentRepository()
//
//    val documents: LiveData<List<Document>> = repository.getDocuments()
//
//    fun addDocument(document: Document) {
//        repository.addDocument(document)
//    }

    // Создаём список фиктивных документов
    private val _documents = MutableLiveData<List<Document>>().apply {
        value = listOf(
            Document(1, "Contract.pdf", "/documents/contract.pdf", "2023-10-01"),
            Document(2, "Invoice.pdf", "/documents/invoice.pdf", "2023-10-02"),
            Document(3, "Report.docx", "/documents/report.docx", "2023-10-03"),
            Document(4, "Presentation.pptx", "/documents/presentation.pptx", "2023-10-04")
        )
    }

    val documents: LiveData<List<Document>> = _documents
}
