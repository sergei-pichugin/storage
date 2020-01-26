package com.demo.storage.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.demo.storage.data.DocumentRepository;

@SpringBootTest
class DocumentServiceTest {
  
  @Mock
  private DocumentRepository docRepo;
  
  @InjectMocks
  private DocumentService docService = new DocumentService(docRepo);

  @Test
  void testGetDocument_returnNullIfIdBelowZero() {
    assertNull(docService.getDocument(-1));
  }
  
  @Test
  void testGetIds_returnEmptyListForEmptyStorage() {
    when(docRepo.findAll()).thenReturn(Collections.emptyList());
    List<Long> ids = docService.getIds();
    assertNotNull(ids);
    assertEquals(0, ids.size());
  }

}
