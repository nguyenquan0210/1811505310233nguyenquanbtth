package com.example.kt10d;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lonely on 1/9/2017.
 */

public class ContactAdapter extends BaseAdapter {
    private List<ContactModel> listContact;
    private Activity activity;

    public ContactAdapter(List<ContactModel> listContact, Activity activity) {
        this.listContact = listContact;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return listContact.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = activity.getLayoutInflater();
            convertView = inflater.inflate(R.layout.item_contract, parent, false);
            ViewHolder holder = new ViewHolder();
            holder.tvName = (TextView) convertView.findViewById(R.id.tv_name);
            holder.tvPhone = (TextView) convertView.findViewById(R.id.tv_phone);
            holder.tvflow = (TextView) convertView.findViewById(R.id.tv_theodoi);
            holder.ivAvatar = (ImageView) convertView.findViewById(R.id.iv_avatar);
            holder.ivAvatar1 = (ImageView) convertView.findViewById(R.id.iv_nv);
            convertView.setTag(holder);
        }
        ViewHolder holder = (ViewHolder) convertView.getTag();
        ContactModel model = listContact.get(position);
        holder.tvName.setText(model.getName());
        holder.tvPhone.setText(model.getPhone());
        holder.tvflow.setText(model.getFlow());
        holder.ivAvatar.setImageResource(model.getImage());
        holder.ivAvatar1.setImageResource(model.getImage1());

        return convertView;
    }

    //Tạo một lần duy nhất để tránh việc tạo nhiều lần làm chậm ứng dụng
    static class ViewHolder {
        TextView tvName;
        TextView tvPhone;
        TextView tvflow;
        ImageView ivAvatar;
        ImageView ivAvatar1;
    }
}
