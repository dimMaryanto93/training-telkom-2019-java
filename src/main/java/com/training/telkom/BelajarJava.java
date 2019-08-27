package com.training.telkom;

public class BelajarJava {

    public static void main(String[] args) {
        Kendaraan honda = new Mobil();
        honda.setNama("CRV");

        System.out.println("nama mobil adalah " + honda.getNama());
        System.out.println("jumlah roda motor " + honda.jumlahRoda());
    }

}
