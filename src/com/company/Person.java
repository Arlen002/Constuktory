package com.company;

public class Person {
    private String fullname;
    private int age;

    public Person(){
    }
    public Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    void move(){
        System.out.println(getFullname()+" чуркап журот.");
    }
    String talk(){
        String suilo = getFullname()+ " salam aittu";
        return suilo;
    }
}
