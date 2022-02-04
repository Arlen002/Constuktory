package com.company;

public class Student {
    private String name;
    private int age;
    private String tuulgankun;
    private Course [] courses;

    public Student() {
    }

    public Student(String name, int age, String tuulgankun) {
        this.name = name;
        this.age = age;
        this.tuulgankun = tuulgankun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTuulgankun() {
        return tuulgankun;
    }

    public void setTuulgankun(String tuulgankun) {
        this.tuulgankun = tuulgankun;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    void  sysCoutse(){
        System.out.println("Аты-жону: "+getName()+", жашы - "+getAge()+", туулган жылы - "+getTuulgankun());
//        for (Course res:getCourses()) {
//            res.courseget();
//        }
    }


    }


