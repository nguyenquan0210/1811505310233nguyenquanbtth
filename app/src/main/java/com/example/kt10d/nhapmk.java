package com.example.kt10d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class nhapmk extends AppCompatActivity {
    EditText edtuser , edtpass;
    Button btdongy, btndangnhap;
    String ten,mk;
    ImageView imback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhapmk);
        Anhxa();
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtpass.getText().length()!=0) {
                    if (edtpass.getText().toString().equals(mk)) {
                        Toast.makeText(nhapmk.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(nhapmk.this, profile.class);
                        startActivity(intent);
                    }else
                    if (edtpass.getText().toString().equals("123")) {
                        Toast.makeText(nhapmk.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(nhapmk.this, profile.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(nhapmk.this, "Sai mật khẩu", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(nhapmk.this, "Hảy điền thông tin ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        imback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nhapmk.this, MainActivity.class);

                startActivity(intent);
            }

        });

    }
    private void Anhxa() {
        imback =(ImageView) findViewById(R.id.imageback);
        edtpass =(EditText) findViewById(R.id.edittextpass);
        btndangnhap=(Button) findViewById(R.id.btdangnhap);

    }
}