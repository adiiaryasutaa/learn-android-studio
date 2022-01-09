package com.ceceply.learnrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

  private RecyclerView todoListRecyclerView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    this.todoListRecyclerView = (RecyclerView) findViewById(R.id.todoListRecyclerView);

    ArrayList<Todo> todoList = new ArrayList<>();

    todoList.addAll(Arrays.asList(
      new Todo("Mandi", "Jam 06.00 AM"),
      new Todo("Sarapan", "Jam 07.00 AM"),
      new Todo("PKL", "Jam 09.00 AM"),
      new Todo("Mandi", "Jam 06.00 PM"),
      new Todo("Tidur", "Jam 10.00 PM"),
      new Todo("Main Genshin", "Jam 08.00 pM"),
      new Todo("Makan", "Jam 09.00 PM"),
      new Todo("Nyatet Matematika", "Jam 7.00 PM")
    ));

    TodoRecyclerAdapter adapter = new TodoRecyclerAdapter();
    adapter.setTodoList(todoList);

    todoListRecyclerView.setAdapter(adapter);
    todoListRecyclerView.setLayoutManager(new LinearLayoutManager(this));

  }
}