package com.example.kt10d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Listview extends AppCompatActivity {
    private ListView lvContact;
    ImageView imback;
    private List<ContactModel> listContact = new ArrayList<>();
    //Khi làm việc với ListView thường sẽ có 3 bước chính
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        anhxa();
        //Bước 1: Tạo data
        initData();

        //Bước 2: Tạo adapter ở ví dụ này chúng ta tự tạo một Adapter không phụ thuộc vào Adapter có sẵn
        ContactAdapter adapter = new ContactAdapter(listContact, this);

        //Bước 3: Tạo ListView Sét adapter vào ListView
        lvContact = (ListView) findViewById(R.id.lv_contact);
        lvContact.setAdapter(adapter);

        //Bắt sự kiện click vào ListView  dòng bao nhiêu nhận biết thông qua position
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ContactModel contactModel = listContact.get(position);
                Toast.makeText(Listview.this, contactModel.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        imback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Listview.this,profile.class);
                startActivity(intent);
            }


        });

    }
    private void anhxa() {

        imback=(ImageView)findViewById(R.id.imageback);

    }
    public void initData() {
        listContact.add(new ContactModel("Lặng", "Hà Nhi","13.5k", R.drawable.i1, R.drawable.i9));
        listContact.add(new ContactModel("Bất Chấp", "WHEE!","10k", R.drawable.i2, R.drawable.i9));
        listContact.add(new ContactModel("Xóa Hết", "Quang Đăng Trần","9.1k", R.drawable.i3, R.drawable.i9));
        listContact.add(new ContactModel("BERVER 2", "Andiez, T.R.I","14k", R.drawable.i4, R.drawable.i9));
        listContact.add(new ContactModel("Thanh Xuân Đã Từng", "NQP","7.5k", R.drawable.i5, R.drawable.i9));
        listContact.add(new ContactModel("Nước Mắt Của Em", "Ngọc Kayla","1.5k", R.drawable.i6, R.drawable.i9));
        listContact.add(new ContactModel("Chỉ Vì Khi Ấy", "Min Min","70.7k", R.drawable.i7, R.drawable.i9));
        listContact.add(new ContactModel("Sợ Em Quên Anh", "Khánh Đơn","6.9k", R.drawable.i8, R.drawable.i9));
        listContact.add(new ContactModel("Lặng", "Hà Nhi","13.5k", R.drawable.i1, R.drawable.i9));
        listContact.add(new ContactModel("Bất Chấp", "WHEE!","10k", R.drawable.i2, R.drawable.i9));
        listContact.add(new ContactModel("Xóa Hết", "Quang Đăng Trần","9.1k", R.drawable.i3, R.drawable.i9));
        listContact.add(new ContactModel("BERVER 2", "Andiez, T.R.I","14k", R.drawable.i4, R.drawable.i9));
        listContact.add(new ContactModel("Thanh Xuân Đã Từng", "NQP","7.5k", R.drawable.i5, R.drawable.i9));
        listContact.add(new ContactModel("Nước Mắt Của Em", "Ngọc Kayla","1.5k", R.drawable.i6, R.drawable.i9));
        listContact.add(new ContactModel("Chỉ Vì Khi Ấy", "Min Min","70.7k", R.drawable.i7, R.drawable.i9));
        listContact.add(new ContactModel("Sợ Em Quên Anh", "Khánh Đơn","6.9k", R.drawable.i8, R.drawable.i9));
    }

}