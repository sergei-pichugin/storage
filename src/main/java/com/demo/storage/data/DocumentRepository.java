package com.demo.storage.data;

import org.springframework.data.repository.CrudRepository;

import com.demo.storage.domain.Document;

public interface DocumentRepository extends CrudRepository<Document, Long> {

}
