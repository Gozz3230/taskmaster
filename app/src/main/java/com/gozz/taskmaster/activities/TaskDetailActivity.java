package com.gozz.taskmaster.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.gozz.taskmaster.MainActivity;
import com.gozz.taskmaster.R;

public class TaskDetailActivity extends AppCompatActivity {
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_task_detail);
  
    Toolbar toolbar = findViewById(R.id.toolbar5);
    setSupportActionBar(toolbar);
  
    setupTaskTitleTextView();
  }
  
  void setupTaskTitleTextView() {
    Intent callingIntent = getIntent();
    String taskTitleString = null;
    if(callingIntent != null) {
      taskTitleString = callingIntent.getStringExtra(MainActivity.TASK_TITLE_EXTRA_TAG);
    }
    
    TextView taskTitleTextView = (TextView) findViewById(R.id.taskDetailActivitySelectedTasksTitle);
    if(taskTitleString != null && !taskTitleString.equals("")) {
      taskTitleTextView.setText(taskTitleString);
    } else {
      taskTitleTextView.setText(R.string.no_task_name);
    }
  }
}