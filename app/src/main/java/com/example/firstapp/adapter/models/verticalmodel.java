package com.example.firstapp.adapter.models;

import java.util.ArrayList;

public class verticalmodel
{
    String title;
    ArrayList<horizontalmodel> arrayList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<horizontalmodel> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<horizontalmodel> arrayList) {
        this.arrayList = arrayList;
    }
}
