package com.company;

public abstract class Account {
    public int mojodi;
    public Account(int mojodi){
        this.mojodi=mojodi;
    }
    abstract void getmoney(int x) throws getmoneyExp;
    abstract void setmoney(int x) throws setmoneyExp;
    abstract void profit();
}
