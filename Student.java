/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

/**
 *
 * @author quach
 */
class Student extends People {

    private String id;
    private int grade;

    public Student(String name, int age, String id, int grade) {
        super(name, age);
        this.id = id;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void showStudent() {
        super.showPeople();
        System.out.println("Ma hoc sinh:" + this.getId());
        System.out.println("Lop:" + this.getGrade());
    }

}
