package com.training.telkom;

public class Motor extends Kendaraan {

    @Override
    public Integer jumlahRoda() {
        roda = 2;
        return roda;
    }

    public Integer jumlahRoda(Integer roda) {
        return roda;
    }

    public Integer jumlahRoda(Integer roda, String nama) {
        return roda;
    }

    public Integer jumlahRoda(String nama, Integer roda) {
        return roda;
    }

}
