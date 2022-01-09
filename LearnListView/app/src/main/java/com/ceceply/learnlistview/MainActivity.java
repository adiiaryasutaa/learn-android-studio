package com.ceceply.learnlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

  private ArrayList<Student> studentList;
  private ListView studentListView;
  private ArrayAdapter<Student> studentListAdapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    this.studentListView = (ListView) findViewById(R.id.studentList);
    this.studentList = new ArrayList<>();

    this.studentList.addAll(Arrays.asList(
      new Student("Adi Aryasuta", "XI RPL 1", 7),
      new Student("Iqbal Faturohim", "XI RPL 1", 22),
      new Student("Sulton Akbar", "XI RPL 1", 29),
      new Student("Abed Ganteng", "Mars", 100)
    ));

    this.studentListAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, studentList);

    this.studentListView.setAdapter(this.studentListAdapter);

    this.studentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(MainActivity.this, studentList.get(i).toString(), Toast.LENGTH_SHORT).show();
      }
    });

  }
}