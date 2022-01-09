package com.ceceply.learnrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TodoRecyclerAdapter extends RecyclerView.Adapter<TodoRecyclerAdapter.ViewHolder> {

  private ArrayList<Todo> todoList;

  public TodoRecyclerAdapter() {
    this.todoList = new ArrayList<>();
  }

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.todo_list_item, parent, false);
    return new ViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    Todo td = todoList.get(position);
    holder.todoTitleTextView.setText(td.getTitle());
    holder.todoDescTextView.setText(td.getDescription());
  }

  @Override
  public int getItemCount() {
    return todoList.size();
  }

  public void setTodoList(ArrayList<Todo> todoList) {
    this.todoList = todoList;
    notifyDataSetChanged();
  }

  public class ViewHolder extends RecyclerView.ViewHolder {

    private TextView todoTitleTextView;
    private TextView todoDescTextView;

    public ViewHolder(@NonNull View itemView) {
      super(itemView);

      this.todoTitleTextView = (TextView) itemView.findViewById(R.id.todoTitleTextView);
      this.todoDescTextView  = (TextView) itemView.findViewById(R.id.todoDescTextView);

    }
  }

}
