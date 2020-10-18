package com.example.kt10d;

public class ContactModel {
    private String name;
    private String phone;
    private String flow;
    private int image;
    private int image1;

    public ContactModel(String name, String phone, String flow, int image, int image1) {
        this.phone = phone;
        this.image = image;
        this.image1 = image1;
        this.name = name;
        this.flow = flow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getFlow() {
        return flow;
    }

    public void setFlow(String flow) {
        this.flow = flow;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }
}
