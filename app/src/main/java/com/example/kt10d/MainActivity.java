package com.example.kt10d;



import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvdangnhap , tvprofile;
    Button btdangky, btdangnhap;
    String ten,mk;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();

        btdangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Signup.class);

                startActivity(intent);
            }

        });
        tvdangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Login.class);

                startActivity(intent);
            }

        });
//        btdangky.setOnClickListener((new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                final Dialog dialog = new Dialog(MainActivity.this);
//                dialog.setTitle("HỘP THỌA XỬ LÍ");
//                dialog.setCancelable(false);
//                dialog.setContentView(R.layout.activity_signup);
//                final EditText edttk=(EditText) dialog.findViewById(R.id.edttk);
//                final EditText edtmk=(EditText) dialog.findViewById(R.id.edtmk);
//                ImageView imback=(ImageView) dialog.findViewById(R.id.imageback);
//                Button btndongy=(Button) dialog.findViewById(R.id.btndongy);
//                btndongy.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ten=edttk.getText().toString().trim();
//                        mk=edtmk.getText().toString().trim();
//                        edttk.setText(ten);
//                        edtmk.setText(mk);
//                        dialog.cancel();
//                    }
//                });
//                imback.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        dialog.cancel();
//                    }
//                });
//                dialog.show();
//            }
//        }));
        tvprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, nhapmk.class);

                startActivity(intent);
            }

        });


    }
    private void Anhxa() {
        tvdangnhap =(TextView) findViewById(R.id.textviewdangnhap);
        tvprofile =(TextView) findViewById(R.id.textviewprofile);
        btdangky=(Button) findViewById(R.id.buttondangky);

    }
}