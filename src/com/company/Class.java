package com.company;


import java.util.Arrays;

public class Class {
    private int nomer;
    private String soz;
    private int [] array;



    public Class(){
    }
    public Class(int nomer, String soz, int[] array) {
        this.nomer = nomer;
        this.soz = soz;
        this.array = array;

    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        if (nomer < 0) {
            System.out.println("san jazynyz");
        } else {
            this.nomer = nomer;
        }
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        if (soz.matches("[a-z A-Z]*$")) {
            this.soz = soz;
        } else {
            System.out.println("Kata");
        }
    }
    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    void classGet(){
        System.out.println(getNomer()+" "+getSoz()+" "+ Arrays.toString(getArray()));
    }
}
