package com.training.telkom;

public class Kendaraan {

    protected Integer roda = 2;
    private String nama;

    public Integer jumlahRoda() {
        return roda;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }
}
