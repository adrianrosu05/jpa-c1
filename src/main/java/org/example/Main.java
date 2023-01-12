package org.example;

import entities.Produs;
import entities.Student;
import services.ProdusService;
import services.StudentService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student student = new Student();
        student.setNume("Rosu");
        student.setPrenume("Adriana");

        StudentService studentService = new StudentService();
        studentService.createStudent(student);

        Produs produs = new Produs();
        produs.setPret(150.0);
        produs.setNume("laptop");
        produs.setStoc(4);
        produs.setDataExpirare(new java.util.Date());
        ProdusService produsService = new ProdusService();
        produsService.createProdus(produs);
    }
}