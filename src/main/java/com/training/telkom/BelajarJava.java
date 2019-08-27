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


        Timestamp milisecond = new Timestamp(1566793407536l);
        LocalDateTime date = milisecond.toLocalDateTime();
        System.out.println("nilai dari milisecond to date " + date.toString());
        LocalDateTime tanggalSekarang = LocalDateTime.now();
        System.out.println("nilai tanggal sekarang = " + tanggalSekarang.toEpochSecond(ZoneOffset.UTC));

        String namaLengkap = "Dimas Maryanto";
        System.out.println("tapilkan nama lengkap " + namaLengkap);

        if (namaLengkap.equalsIgnoreCase("dimas maryanto")) {
            System.out.println("equals ignore case");
        }

        if (namaLengkap.equals("dimas maryanto")) {
            System.out.println("equals");
        }

        switch (namaLengkap) {
            case "Dimas Maryanto":
                System.out.println("b");
                break;
            case "dimas maryanto":
                System.out.println("c");
                break;
            case "a":
                System.out.println("a");
                break;
        }

//    i++ =>  i = i + 1;

        /**
         * komentar multi baris
         * alskdfjlkdsajfadsf
         * asfdklsadjfklasdf
         * asdflkjasdflkjdsf
         */

        // [0][1][][][][][][][][][10]
        for (int i = 0; i <= 10; i++) {
//            System.out.println("ini perlulangan ke " + i);
        }

        int i = 0;
        do {
            i++;
//            System.out.println("ini perulangan ke " + i);
        } while (i <= 10);

        int y = 0;
        while (y < 10) {
            y++;
//            System.out.println("ini perulangan ke " + y);
        }
    }
}
