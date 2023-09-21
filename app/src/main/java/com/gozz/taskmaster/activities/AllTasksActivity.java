package com.gozz.taskmaster.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.gozz.taskmaster.MainActivity;
import com.gozz.taskmaster.R;

public class AllTasksActivity extends AppCompatActivity {
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_all_tasks);
  
    Toolbar toolbar = findViewById(R.id.toolbar2);
    setSupportActionBar(toolbar);
  
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    
  }
  
  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    if (item.getItemId() == android.R.id.home) {
      // Handle up navigation back arrow click
      onBackPressed();
      return true;
    }
    return super.onOptionsItemSelected(item);
  }
}