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
class People {

    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void showPeople() {
        System.out.println("Ten:" + this.getName());
        System.out.println("Tuoi:" + this.getAge());
    }

}

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

public class DemoInheritence {

    public static void main(String[] args) {

        
        Student student = new Student("Quach Hong Thu", 18, "123", 12);

        student.showStudent();
    }

}
