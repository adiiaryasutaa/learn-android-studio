package com.ceceply.learnlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.annotation.Inherited;

public class SayActivity extends AppCompatActivity {

  private TextView theTextView;
  private Button backButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_say);

    this.theTextView = (TextView) findViewById(R.id.theTextView);
    this.backButton  = (Button)   findViewById(R.id.backButton);

    this.theTextView.setText(getIntent().getExtras().get("text").toString());

    Intent i = new Intent(this, MainActivity.class);

    this.backButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        startActivity(i);
      }
    });

  }
}