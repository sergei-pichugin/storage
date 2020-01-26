package com.demo.storage.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.storage.domain.Document;
import com.demo.storage.services.DocumentService;

@RestController
@RequestMapping
public class DocumentController {
  
  @Autowired
  private DocumentService docService;
  
  @GetMapping("/document")
  public Document getDocument(@RequestParam(
      value = "id", defaultValue = "1") long id) {
    return docService.getDocument(id);
  }
  
  @GetMapping("/doc_ids")
  public List<Long> getIds() {
    return docService.getIds();
  }

}
