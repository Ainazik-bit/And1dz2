package com.example.and1dz2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private ArrayList<TaskModel> list = new ArrayList<>();

    public void addList(ArrayList<TaskModel> list) {
        this.list.addAll(list);
    }
    public void addItem(TaskModel taskModel){
        this.list.add(taskModel);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {

        private TextView title, description, id, data;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.text_view);
            description = itemView.findViewById(R.id.text_vw);
            id = itemView.findViewById(R.id.text_number);
            data = itemView.findViewById(R.id.text_data);
        }

        public void onBind(TaskModel taskModel) {
            title.setText(taskModel.getTitle());
            description.setText(taskModel.getDescription());
            id.setText(String.valueOf(getAdapterPosition()+1));
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm yyyy/MM/dd");
            Date date = new Date(taskModel.getData());
            data.setText(formatter.format(date));
        }
    }
}
