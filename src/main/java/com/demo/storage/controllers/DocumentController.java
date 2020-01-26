package com.demo.storage.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.storage.domain.Document;

@RestController
@RequestMapping("/document")
public class DocumentController {
  
  private static final String template = "Sample document";
  
  @GetMapping
  public Document getDocument(@RequestParam(
      value = "id", defaultValue = "1") long id) {
    return new Document(id, template);
  }

}
