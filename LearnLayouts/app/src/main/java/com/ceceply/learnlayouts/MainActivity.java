package com.ceceply.learnlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

  private EditText inputNameEditText;
  private Button sayHelloButton;
  private Button sayGoodByeButton;
  private Button sayILoveYouButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    this.inputNameEditText = (EditText) findViewById(R.id.inputNameEditText);
    this.sayHelloButton    = (Button) findViewById(R.id.sayHelloButton);
    this.sayGoodByeButton  = (Button) findViewById(R.id.sayGoodByeButton);
    this.sayILoveYouButton = (Button) findViewById(R.id.sayILoveYouButton);

    this.sayHelloButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        startSayActivity(view, "Hello " + inputNameEditText.getText().toString());
      }
    });

    this.sayGoodByeButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        startSayActivity(view, "Good bye " + inputNameEditText.getText().toString());
      }
    });

    this.sayILoveYouButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        startSayActivity(view, "I love you " + inputNameEditText.getText().toString() + "!!!");
      }
    });
  }

  public void startSayActivity(View view, String text) {
    Intent i = new Intent(this, SayActivity.class);
    i.putExtra("text", text);
    startActivity(i);
  }
}