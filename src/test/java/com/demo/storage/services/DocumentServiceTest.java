package com.demo.storage.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DocumentServiceTest {
  
  @Autowired
  private DocumentService docService;

  @Test
  void testGetDocument_returnNullIfIdBelowZero() {
    assertNull(docService.getDocument(-1));
  }

}
