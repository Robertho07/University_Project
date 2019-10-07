package com.company;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class University {
    private ArrayList<Student> studentList;
    private ArrayList<Professor> faculty;


    public Optional findStudent(int studentID, Scanner inputReader){
        System.out.println("What is the Student ID you are looking for?: ");
        Student foundStudent = null;
        var iD = inputReader.nextInt();
        for (var student : studentList)
            if (student.getStudentID() == iD) {
                studentList.add(foundStudent);
                return Optional.of(foundStudent);
            }
        return Optional.empty();


    }

    public University(){

    }

    public boolean hireProfessor(ArrayList<Professor> faculty){
        var newProf = new Professor();
        var newProfessor = faculty.add(newProf);
    }
    public boolean admitStudent(ArrayList<Student> studentList){
        var newStudent = new Student();
        var newKid = studentList.add(newStudent);
        return newKid;
    }
    public University graduatedStudent(ArrayList<Student> studentList, Scanner inputReader){
        var graduatedKid = new Student();
        System.out.println("What is the Stuent's gpa:");
        var gpa = inputReader.nextFloat();
        System.out.println("How many credits did the student earn?;");
        var numCredits = inputReader.nextInt();
        for (graduatedKid: studentList){
            if (gpa >=3.7){
                System.out.println(" Congrats Student graduated with high honors");
                studentList.remove(graduatedKid);
            }
            if (gpa >=3.3, +gpa < 3.7){
                System.out.println("Congrats Student graduated with honors");
                studentList.remove(graduatedKid);
            }
            System.out.println("Congratulations student has graduated");
            studentList.remove(graduatedKid);
        }

    }
    public runUniversity(Scanner inputReader){
        var newStudent = new Student();
        System.out.println("What is the Stuent's gpa:");
        var gpa = inputReader.nextFloat();
        System.out.println("How many credits did the student earn?;");
        var numCredits = inputReader.nextInt();
        admitStudent();
        var newPofessor = new Professor();
        hireProfessor(faculty);

        graduatedStudent();
        System.out.println("What is the Student ID;");
        var stuID = inputReader.nextInt();
        findStudent(, Scanner inputReader);
    }

}
