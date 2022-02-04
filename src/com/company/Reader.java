package com.company;

public class Reader {
    private String fullname;
    private int nombilet;
    private String faculty;
    private String tkunu;
    private String tel;

    public Reader(){
    }

    public Reader(String fullname, int nombilet, String faculty, String tkunu, String tel) {
        this.fullname = fullname;
        this.nombilet = nombilet;
        this.faculty = faculty;
        this.tkunu = tkunu;
        this.tel = tel;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public int getNombilet() {
        return nombilet;
    }
    public void setNombilet(int nombilet) {
        this.nombilet = nombilet;
    }
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public String getTkunu() {
        return tkunu;
    }
    public void setTkunu(String tkunu) {
        this.tkunu = tkunu;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    void takeBook(){
        System.out.println(getFullname()+" 3 китеп алды.");
    }
}
