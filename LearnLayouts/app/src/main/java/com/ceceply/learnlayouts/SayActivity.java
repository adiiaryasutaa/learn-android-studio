package com.ceceply.learnlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SayActivity extends AppCompatActivity {

  private TextView theTextView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_say);

    this.theTextView = (TextView) findViewById(R.id.theTextView);

    this.theTextView.setText(getIntent().getExtras().get("text").toString());

  }
}