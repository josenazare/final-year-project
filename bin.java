package com.example.josenazare.proj_10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bin extends AppCompatActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bin);
        b=(Button)findViewById(R.id.b4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(bin.this, startpage.class);
                startActivity(i);

            }});
    }
}
