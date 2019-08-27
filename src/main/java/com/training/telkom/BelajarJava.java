package com.training.telkom;

public class BelajarJava {

    public static void main(String[] args) {
        String stringValue = new String("asldfkjdsfksdf");
        BelajarJava variable = new BelajarJava();
        variable.ping();

        Integer hitungLuasPersegi = variable.luasPersegi(10, 20);
        System.out.println("luas persegi panjang " + hitungLuasPersegi);
    }

    public void ping() {
        System.out.println("connected to database!");
    }

    public Integer luasPersegi(Integer panjang, Integer lebar) {
        return panjang * lebar;
    }
}
