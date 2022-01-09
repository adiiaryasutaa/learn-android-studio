package com.ceceply.learnlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AwoActivity extends AppCompatActivity {
  
  private TextView selectedTextView;
  private Button CPPButton;
  private Button javaButton;
  private Button pythonButton;
  private Button javascriptButton;
  private Button showToastButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_awo);
    
    this.selectedTextView = (TextView) findViewById(R.id.selectedText);
    this.CPPButton        = (Button)   findViewById(R.id.CPPButton);
    this.javaButton       = (Button)   findViewById(R.id.JavaButton);
    this.pythonButton     = (Button)   findViewById(R.id.PythonButton);
    this.javascriptButton = (Button)   findViewById(R.id.JavaScriptButton);
    this.showToastButton  = (Button)   findViewById(R.id.showToastButton);
    
    this.CPPButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        addToSelectionTextView("CPP");
      }
    });

    this.javaButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        addToSelectionTextView("Java");
      }
    });

    this.pythonButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        addToSelectionTextView("Python");
      }
    });

    this.javascriptButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        addToSelectionTextView("JavaScript");
      }
    });

    this.showToastButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(
          getApplicationContext(),
          selectedTextView.getText() == "" ? "Please select a text first" : selectedTextView.getText().toString(),
          Toast.LENGTH_LONG)
        .show();
      }
    });
    
  }
  
  public void addToSelectionTextView(String text) {
    this.selectedTextView.setText(this.selectedTextView.getText() == ""
            ? text : this.selectedTextView.getText().toString() + ", " + text);
  }
}