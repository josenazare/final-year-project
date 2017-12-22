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
        TextView btn;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startpage);
        btn=(TextView)findViewById(R.id.Compose);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(startpage.this,compose.class);
                startActivity(i);
            }
        });
    }
}
