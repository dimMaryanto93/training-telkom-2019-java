package com.training.telkom;

public class Mobil extends Kendaraan {

    private String stering;
    private Integer jumlahKorsi;

    public Integer jumlahRoda() {
        roda = 4;
        return roda;
    }

    public String getStering() {
        return stering;
    }

    public void setStering(String stering) {
        this.stering = stering;
    }

    public Integer getJumlahKorsi() {
        return jumlahKorsi;
    }

    public void setJumlahKorsi(Integer jumlahKorsi) {
        this.jumlahKorsi = jumlahKorsi;
    }
}
