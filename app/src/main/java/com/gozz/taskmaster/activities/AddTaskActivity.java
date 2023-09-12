package com.gozz.taskmaster.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.gozz.taskmaster.R;

public class AddTaskActivity extends AppCompatActivity {
  
//  private Button submitButton;
  private TextView submittedLabel;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_add_task);
  
    Toolbar toolbar = findViewById(R.id.toolbar4);
    setSupportActionBar(toolbar);
  
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    
    submittedLabel = findViewById(R.id.submittedLabel);
    submittedLabel.setVisibility(View.GONE);
    
    //Initialize submitButton
    Button submitButton = findViewById(R.id.settingsUsernameSaveButton);
    
    submitButton.setOnClickListener(v -> submittedLabel.setVisibility(View.VISIBLE));
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