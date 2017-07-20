package com.umg.gt.umgapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TeacherActivity extends AppCompatActivity {

    private EditText et1;
    private ListView lv1;
    private List<String> list;
    private ArrayAdapter<String> adapter;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        et1 = (EditText) findViewById(R.id.et3);
        lv1 = (ListView) findViewById(R.id.lv1);
        btn = (Button) findViewById(R.id.btnx);
        list = new ArrayList<>();
        list.add("Kevin");
        list.add("Rolando");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        lv1.setAdapter(adapter);
    }

    public void agregar(View view) {
        String nombre = et1.getText().toString();
        list.add(nombre);
        adapter.notifyDataSetChanged();

    }
}
