package com.example.letslearninjava;

import java.io.Serializable;

public class DataClass implements Serializable {
    int i = 0;

    public DataClass(int u) {
        i = u;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
