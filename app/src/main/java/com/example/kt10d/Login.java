package com.example.kt10d;


import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.os.Bundle;

public class Login extends AppCompatActivity {
    EditText edtuser , edtpass;
    Button btndangky, btndangnhap;
    String ten,mk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Anhxa();

        Intent i= getIntent();

        final String user= i.getStringExtra("user");
        final String pass =i.getStringExtra("pass");
        edtuser.setText(user);
        edtpass.setText(pass);
//        btndangnhap.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (edtuser.getText().length()!=0&& edtpass.getText().length()!=0){
//                    if (edtuser.getText().toString().equals())
//                }
//            }
//        });
//        btndangky.setOnClickListener((new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                final Dialog dialog = new Dialog(Login.this);
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
//                        edtuser.setText(ten);
//                        edtpass.setText(mk);
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
        btndangky.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Signup.class);
                startActivity(intent);
            }

        }));
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                ten=edtuser.getText().toString().trim();
                mk=edtpass.getText().toString().trim();
                if (edtuser.getText().length()!=0&& edtpass.getText().length()!=0) {
                    if (edtuser.getText().toString().equals(ten) && edtpass.getText().toString().equals(mk)) {
                        Toast.makeText(Login.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this, profile.class);
                        startActivity(intent);
                    }else
                    if (edtuser.getText().toString().equals("quan") && edtpass.getText().toString().equals("021000")) {
                        Toast.makeText(Login.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this, profile.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(Login.this, "Sai mật khẩu", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(Login.this, "Hảy điền thông tin ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void Anhxa() {

        edtuser =(EditText) findViewById(R.id.edittextuser);
        edtpass =(EditText) findViewById(R.id.edittextpass);
        btndangky=(Button) findViewById(R.id.buttondangky);
        btndangnhap=(Button) findViewById(R.id.buttondangnhap);
    }
}