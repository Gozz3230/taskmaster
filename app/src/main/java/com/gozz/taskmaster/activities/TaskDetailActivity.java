package com.gozz.taskmaster.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.gozz.taskmaster.R;

public class TaskDetailActivity extends AppCompatActivity {
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_task_detail);
  
    Toolbar toolbar = findViewById(R.id.toolbar5);
    setSupportActionBar(toolbar);
  }
}