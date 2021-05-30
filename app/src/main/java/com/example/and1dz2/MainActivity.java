package com.example.and1dz2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MainAdapter mainAdapter;
    private ArrayList<TaskModel> list;
    private Button button;
    private String title, description;
    private EditText titleED, descriptionED;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecycler();
        addItemToRecycler();
    }

    private void addItemToRecycler() {
       titleED = findViewById(R.id.edit_text);
       descriptionED = findViewById(R.id.edit_tx);
       title = titleED.getText().toString();
       description = descriptionED.getText().toString();
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainAdapter.addItem(new TaskModel(titleED.getText().toString(), descriptionED.getText().toString(), System.currentTimeMillis()));
                Toast.makeText(getApplicationContext(),"title"+ title,Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initRecycler() {
        recyclerView = findViewById(R.id.recycler_v);
        mainAdapter = new MainAdapter();
        recyclerView.setAdapter(mainAdapter);

    }

    private void createList() {
        list = new ArrayList<TaskModel>();
        TaskModel taskModel1 = new TaskModel("Title1", "Description", System.currentTimeMillis());
        TaskModel taskModel2 = new TaskModel("Title2", "Description", System.currentTimeMillis());
        TaskModel taskModel3 = new TaskModel("Title3", "Description", System.currentTimeMillis());
        TaskModel taskModel4 = new TaskModel("Title4", "Description", System.currentTimeMillis());
        TaskModel taskModel5 = new TaskModel("Title5", "Description", System.currentTimeMillis());
        TaskModel taskModel6 = new TaskModel("Title6", "Description", System.currentTimeMillis());
        list.add(taskModel1);
        list.add(taskModel2);
        list.add(taskModel3);
        list.add(taskModel4);
        list.add(taskModel5);
        list.add(taskModel6);
    }
}