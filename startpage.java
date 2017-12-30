package com.example.josenazare.proj_10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class startpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startpage);
       TextView btn,btn2, b3,b4;
        btn=(TextView)findViewById(R.id.Compose);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(startpage.this,compose.class);
                startActivity(i);

            }
        });
        btn2=(TextView)findViewById(R.id.Inbox);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Intent j=new Intent(startpage.this,Inbox.class);
                startActivity(j);

            }
        });
        b3=(TextView)findViewById(R.id.send);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Intent j=new Intent(startpage.this,sent.class);
                startActivity(j);
    }

});

    b4=(TextView)findViewById(R.id.Bin);
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent k=new Intent(startpage.this,bin.class);
                startActivity(k);
            }
        });
    }}
