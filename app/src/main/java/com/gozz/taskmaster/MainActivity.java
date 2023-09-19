package com.gozz.taskmaster;

import static com.gozz.taskmaster.activities.SettingsActivity.USERNAME_TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.gozz.taskmaster.activities.AddTaskActivity;
import com.gozz.taskmaster.activities.AllTasksActivity;
import com.gozz.taskmaster.activities.SettingsActivity;

public class MainActivity extends AppCompatActivity {
  private final String TAG = "MainActivity";
  public static final String PRODUCT_NAME_EXTRA_TAG = "productName";
  SharedPreferences preferences;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  
    Toolbar toolbar = findViewById(R.id.toolbar2);
    setSupportActionBar(toolbar);
    
    preferences = PreferenceManager.getDefaultSharedPreferences(this);
  
    setupSettingsImage();
    setupAddTaskFormButton();
    setupAllTasksButton();
  }
  
  @Override
  protected void onResume() {
    super.onResume();
    setupUsernameTextView();
  }
  
  void setupSettingsImage() {
    ((ImageView) findViewById(R.id.MainActivitySettingsImage)).setOnClickListener(v -> {
      System.out.println("Settings image was pressed");
  
      Log.v(TAG, "I'm a VERBOSE log!");
      Log.d(TAG, "I'm a DEBUG log");
      Log.i(TAG, "I'm an INFO log");
      Log.w(TAG, "I'm a WARNING log");
      Log.e(TAG, "I'm an ERROR log");
      Log.wtf(TAG, "WHAT A TERRIBLE FAILURE");
      
      Intent goToSettingsIntent = new Intent(MainActivity.this, SettingsActivity.class);
      startActivity(goToSettingsIntent);
    });
  }
  
  void setupUsernameTextView() {
    String userName = preferences.getString(USERNAME_TAG, "No Username");
    ((TextView)findViewById(R.id.MainActivityUsernameTextView)).setText(userName);
  }
  void setupAddTaskFormButton() {
    // grab UI element, add onClickListener, do things in the callback method
    Button addTaskButton = findViewById(R.id.MainActivityAddTaskButton);
    addTaskButton.setOnClickListener(v -> {
      System.out.println("add task button was pressed");
    
      // better way to sout/log
      Log.v(TAG, "I'm a VERBOSE log!");
      Log.d(TAG, "I'm a DEBUG log");
      Log.i(TAG, "I'm an INFO log");
      Log.w(TAG, "I'm a WARNING log");
      Log.e(TAG, "I'm an ERROR log");
      Log.wtf(TAG, "WHAT A TERRIBLE FAILURE");
    
      // create and trigger intent
      Intent goToAddTaskFormIntent = new Intent(MainActivity.this, AddTaskActivity.class);
    
      startActivity(goToAddTaskFormIntent);
    });
  }
  
    void setupAllTasksButton() {
      Button allTasksButton = findViewById(R.id.MainActivityAllTasksButton);
      allTasksButton.setOnClickListener(v -> {
        System.out.println("All Tasks button was pressed");
        
        Log.v(TAG, "I'm a VERBOSE log!");
        Log.d(TAG, "I'm a DEBUG log");
        Log.i(TAG, "I'm an INFO log");
        Log.w(TAG, "I'm a WARNING log");
        Log.e(TAG, "I'm an ERROR log");
        Log.wtf(TAG, "WHAT A TERRIBLE FAILURE");
        
        Intent goToAllTasksFormIntent = new Intent(MainActivity.this, AllTasksActivity.class);
      
        startActivity(goToAllTasksFormIntent);
      });
  }
}