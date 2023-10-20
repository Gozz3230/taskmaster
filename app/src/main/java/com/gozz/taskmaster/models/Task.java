package com.gozz.taskmaster.models;

// create a data class. seems like a 'schema' to me
public class Task {
  String name;
  
  public Task(String name) {
    
    this.name = name;
  }
  
  public String getName() {
    
    return name;
  }
  
  public void setName(String name) {
    
    this.name = name;
  }
}
