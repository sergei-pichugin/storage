package com.demo.storage.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.demo.storage.domain.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {

}
