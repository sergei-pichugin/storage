package com.demo.storage.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Document {

  @Id
  private final long id;
  
  @Column
  private final String content;
  
  public Document() { 
    id = 0;
    content = null;
  }
  
  public Document(long id, String content) {
    this.id = id;
    this.content = content;
  }
  
  public long getId() {
    return id;
  }
  
  public String getContent() {
    return content;
  }
}
