package com.demo.storage;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.storage.controllers.DocumentController;

@SpringBootTest
class StorageApplicationTests {
  
  @Autowired
  private DocumentController docController;

	@Test
	void contextLoads() throws Exception {
	  assertThat(docController).isNotNull();
	}

}
