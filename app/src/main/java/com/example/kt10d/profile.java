package com.example.kt10d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class profile extends AppCompatActivity {
    TextView tv1 , tv2, tv3,tv4, tv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Anhxa();
        tv1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile.this, Listview.class);
                startActivity(intent);
            }

        }));
        tv2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile.this, Listview.class);
                startActivity(intent);
            }

        }));
        tv3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile.this, Listview.class);
                startActivity(intent);
            }

        }));
        tv4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile.this, Listview.class);
                startActivity(intent);
            }

        }));
        tv5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile.this, MainActivity.class);
                startActivity(intent);
            }

        }));
    }
    private void Anhxa() {
        tv1 =(TextView) findViewById(R.id.dsnhac);
        tv2 =(TextView) findViewById(R.id.dsnhac1);
        tv3 =(TextView) findViewById(R.id.dsnhac2);
        tv4 =(TextView) findViewById(R.id.dsnhac3);
        tv5 =(TextView) findViewById(R.id.textLogout);
    }
}