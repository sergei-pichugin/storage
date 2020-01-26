package com.demo.storage.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.storage.data.DocumentRepository;
import com.demo.storage.domain.Document;

@Service
public class DocumentService {
  
  private static final String template = "Sample document";
  private static final List<Long> templateIds = Arrays.asList(1l, 2l, 3l, 4l, 5l);
  
  @Autowired
  private DocumentRepository docRepo;

  public Document getDocument(long id) {
    if (id < 0) return null;
    return docRepo.findById(id).get();
  }

  public List<Long> getIds() {
    return templateIds;
  }
}
