package com.company;

public class Rectangle {
    private int a;
    private int b;

public Rectangle(){

}

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    void  areaget(){
    System.out.println(" A = "+getA()+ ", B = " +getB());
    }
    void area(){
        System.out.println( " Тик бурчтуктун аянты: "+a*b);

    }
}
