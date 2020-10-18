package com.example.kt10d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Signup extends AppCompatActivity {
    private EditText etuserr,etpass;
    private Button btdk;
    ImageView imback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        anhxa();
        btdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchlayout =new Intent(getApplicationContext(),Login.class);
                switchlayout.putExtra("user",etuserr.getText().toString());
                switchlayout.putExtra("pass", etpass.getText().toString());
                Log.e("n",etuserr.getText()+"."+etpass.getText());
                startActivity(switchlayout);
            }
        });

            imback.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Signup.this,MainActivity.class);
                    startActivity(intent);
                }


                });

    }
    private void anhxa() {
        etuserr= (EditText)findViewById(R.id.edttk);
        etpass= (EditText)findViewById(R.id.edtmk);
        btdk=(Button)findViewById(R.id.btndongy);
        imback=(ImageView)findViewById(R.id.imageback);

    }
}