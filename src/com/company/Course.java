package com.company;

public class Course {
    private String name;
    private int nom;
    private String surname;
    private String kbk;



    public Course(){
    }
    public Course(String name, int nom, String surname, String kbk) {
        this.name = name;
        this.nom = nom;
        this.surname = surname;
        this.kbk = kbk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNom() {
        return nom;
    }

    public void setNom(int nom) {
        this.nom = nom;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getKbk() {
        return kbk;
    }

    public void setKbk(String kbk) {
        this.kbk = kbk;
    }
    void courseget(){
        System.out.println("Негиздоочу: "+getSurname()+", курс "+getName()+", номери "+getNom()+", курс башталган кун -"+getKbk());
    }
}
