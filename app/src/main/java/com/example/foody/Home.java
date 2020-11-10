package com.example.foody;

import android.app.Person;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
    Button btnsave,btnhome,btnlist,btnnotification,btnperson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent intent = this.getIntent();
        btnsave = (Button) findViewById(R.id.tab_save);
        btnhome = (Button) findViewById(R.id.tab_home);
        btnlist = (Button) findViewById(R.id.tab_list);
        btnperson = (Button) findViewById(R.id.tab_person);
        btnnotification = (Button) findViewById(R.id.tab_notification);


        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xml_home();
            }
        });
        btnnotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xml_notification();
            }
        });

    }
    void xml_home(){
        Intent intent = new Intent(this,Home.class);
        this.startActivity(intent);
    }
    void xml_notification(){
        Intent intent = new Intent(this,Notification.class);
        this.startActivity(intent);
    }


}