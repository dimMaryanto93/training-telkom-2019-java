package com.training.telkom;

public class BelajarJava {

    public static void main(String[] args) {
        String stringValue = new String("asldfkjdsfksdf");
        BelajarJava variable = new BelajarJava();
        variable.ping();
    }

    public void ping() {
        System.out.println("connected to database!");
    }

    public Integer luasPersegi(Integer panjang, Integer lebar) {
        return panjang * lebar;
    }
}
