package com.gozz.taskmaster.daos;

import androidx.room.Dao;
import androidx.room.Insert;

import com.gozz.taskmaster.models.Task;

import java.util.List;

@Dao // like a Spring JPA Repo but have to implement SQL ourselves
public interface TaskDao {
  @Insert
  public void insertAProduct(Task task);
  
  public List<Task> findAll();
  
  public List<Task> findAllSortedByName();
  
  Task findByAnId(long id);
}
