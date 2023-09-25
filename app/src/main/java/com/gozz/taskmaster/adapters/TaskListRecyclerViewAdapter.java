package com.gozz.taskmaster.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gozz.taskmaster.R;

// TODO: Make a custom RecyclerViewAdapter class which extends RecyclerView.Adapter
public class TaskListRecyclerViewAdapter extends RecyclerView.Adapter {
  
  @NonNull
  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    // Inflate the fragment(add fragment to viewHolder)
    View productFragment = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_task_list, parent, false);
    return null;
  }
  
  @Override
  public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
  
  }
  
  @Override
  public int getItemCount() {
    return 0;
  }
}
