package com.training.telkom;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BelajarJava {

    public static void main(String[] args) {
        byte bil1 = -128;
        Byte bil2 = 0;
        System.out.println(
                "nilai dari bil1 = " +
                        bil1 +
                        ", nilai dari bil2 = " +
                        bil2);

        char huruf = 'a';
        Character hurufClass = 'A';
        System.out.println(
                "Nilai huruf = " +
                        huruf +
                        ", nilai hurufClass = " +
                        hurufClass);

        String namaLengkap = "Dimas Maryanto";
        System.out.println("tapilkan nama lengkap " + namaLengkap);

        Timestamp milisecond = new Timestamp(1566793407536l);
        LocalDateTime date = milisecond.toLocalDateTime();
        System.out.println("nilai dari milisecond to date " + date.toString());
        LocalDateTime tanggalSekarang = LocalDateTime.now();
        System.out.println("nilai tanggal sekarang = "+ tanggalSekarang.toEpochSecond(ZoneOffset.UTC));
    }
}
