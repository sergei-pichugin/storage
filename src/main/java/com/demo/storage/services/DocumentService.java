package com.demo.storage.services;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.demo.storage.data.DocumentRepository;
import com.demo.storage.domain.Document;

@Service
public class DocumentService {
  
  private static final String template = "Sample document";
  
  private DocumentRepository docRepo;

  public DocumentService(DocumentRepository docRepo) {
    this.docRepo = docRepo;
  }

  public Document getDocument(long id) {
    if (id < 0) return null;
    return docRepo.findById(id).get();
  }

  public List<Long> getIds() {
    List<Document> docs = docRepo.findAll();
    if (docs.isEmpty()) return Collections.emptyList();
    return docs.stream().map(Document::getId).collect(Collectors.toList());
  }
}
