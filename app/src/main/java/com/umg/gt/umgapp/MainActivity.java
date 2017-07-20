package com.umg.gt.umgapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private Button btn;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
    }

    public void acceder(View view) {
        String mail, pass;
        mail = et1.getText().toString();
        pass = et2.getText().toString();
        if(mail.endsWith("@catedratico.gt")&&pass.equals("posgrado")){
            //Toast notification= Toast.makeText(this,"Bienvenido catedrático",Toast.LENGTH_SHORT);
            //notification.show();
            Intent i = new Intent(this,TeacherActivity.class);
            startActivity(i);
        }else{
            Toast notification= Toast.makeText(this,"Credenciales Inválidas",Toast.LENGTH_SHORT);
            notification.show();
        }
    }
}
