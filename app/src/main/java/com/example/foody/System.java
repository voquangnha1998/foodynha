package com.example.foody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class System extends AppCompatActivity {
    Button btnsave,btnhome,btnlist,btnnotification,btnperson;
    ImageButton btnimgback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system);
        btnimgback = findViewById(R.id.btnimgback);
        Intent intent = this.getIntent();
        btnsave = (Button) findViewById(R.id.tab_save);
        btnhome = (Button) findViewById(R.id.tab_home);
        btnlist = (Button) findViewById(R.id.tab_list);
        btnperson = (Button) findViewById(R.id.tab_person);
        btnnotification = (Button) findViewById(R.id.tab_notification);



        btnimgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xml_back();
            }
        });
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
        //thêm vào
    }
    void xml_back(){
        Intent intent = new Intent(System.this,Notification.class);
        this.startActivity(intent);
    }
    void xml_home(){
        Intent intent = new Intent(this,Home.class);
        this.startActivity(intent);
    }
    void xml_notification(){
        Intent intent = new Intent(this,Notification.class);
        this.startActivity(intent);
    }
    //thêm các trang vào đây
}