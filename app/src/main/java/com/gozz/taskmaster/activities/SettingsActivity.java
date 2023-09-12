package com.gozz.taskmaster.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.gozz.taskmaster.MainActivity;
import com.gozz.taskmaster.R;

public class SettingsActivity extends AppCompatActivity {
  public static final String USERNAME_TAG = "userName";
  SharedPreferences preferences; // put at top of class so it can live long enough to be used in onclick listener
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_settings);
  
    Toolbar toolbar = findViewById(R.id.toolbar4);
    setSupportActionBar(toolbar);
    
    preferences = PreferenceManager.getDefaultSharedPreferences(this);
    
    setupUserNameEditText();
    setupSaveButton();
  }
  void setupUserNameEditText() {
    String userName = preferences.getString(USERNAME_TAG, null);
    ((EditText)findViewById(R.id.enterUsername)).setText(userName);
  }
  
  void setupSaveButton() {
    ((Button)findViewById(R.id.settingsUsernameSaveButton)).setOnClickListener(v -> {
      SharedPreferences.Editor preferencesEditor = preferences.edit();
      EditText userNameEditText = (EditText) findViewById(R.id.enterUsername);
      String userNameString = userNameEditText.getText().toString();
      
      preferencesEditor.putString(USERNAME_TAG, userNameString);
      preferencesEditor.apply(); //nothing will save if you forget this line. if using commit instead of apply, it returns a boolean
  
      Toast.makeText(SettingsActivity.this, "Settings Saved!", Toast.LENGTH_SHORT).show();
    });
  }
}