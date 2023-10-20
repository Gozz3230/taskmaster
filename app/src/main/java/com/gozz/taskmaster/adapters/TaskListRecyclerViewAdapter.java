package com.gozz.taskmaster.adapters;

import static com.gozz.taskmaster.MainActivity.TASK_TITLE_EXTRA_TAG;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gozz.taskmaster.R;
import com.gozz.taskmaster.activities.TaskDetailActivity;
import com.gozz.taskmaster.models.Task;

import java.util.List;

// TODO: Make a custom RecyclerViewAdapter class which extends RecyclerView.Adapter
public class TaskListRecyclerViewAdapter extends RecyclerView.Adapter<TaskListRecyclerViewAdapter.TaskListViewHolder> {
  List<Task> tasks;
  
  Context callingActivity;
  
  public TaskListRecyclerViewAdapter(List<Task> tasks, Context callingActivity) {
    this.tasks = tasks;
    this.callingActivity = callingActivity;
  }
  
  @NonNull
  @Override
  public TaskListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    // Inflate the fragment(add fragment to viewHolder)
    View taskFragment = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_task_list, parent, false);
    return new TaskListViewHolder(taskFragment);
  }
  
  @Override
  public void onBindViewHolder(@NonNull TaskListViewHolder holder, int position) {
    TextView taskFragmentTextView = (TextView) holder.itemView.findViewById(R.id.taskFragmentTextView);
    String taskFragmentText = (position+1) + ". " + tasks.get(position).getName();
    taskFragmentTextView.setText(taskFragmentText);
    
    View taskViewHolder = holder.itemView;
    taskViewHolder.setOnClickListener(v -> {
      Intent goToTaskDetailIntent = new Intent(callingActivity, TaskDetailActivity.class);
      goToTaskDetailIntent.putExtra(TASK_TITLE_EXTRA_TAG, tasks.get(position).getName());
      callingActivity.startActivity(goToTaskDetailIntent);
    });
  }
  
  @Override
  public int getItemCount() {
    return tasks.size();
//    return 10;
  }
  
  public static class TaskListViewHolder extends RecyclerView.ViewHolder {
  
    public TaskListViewHolder(@NonNull View itemView) {
      super(itemView);
    }
  }
}
