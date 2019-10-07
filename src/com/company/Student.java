package com.company;
import java.util.Scanner;

public class Student {
    private int studentID;
    private int nextID = 2000;
    private float gpa;
    private String name;
    private Professor advisor;
    private int numberOfCredits;

    public Student(Professor initialAdvisor, String studentName){
        var advisor = initialAdvisor;
        var name = studentName;
        studentID = nextID;
        nextID++;
    }

    public Student() {
        gpa = 0.0f;
        numberOfCredits = 0;
    }

    public Student takeClass(int credits, float grade){
        credits = numberOfCredits;
        var reader = new Scanner(System.in);
        System.out.println("How many classes did student attempt;");
        for (var numberofclasses = reader.nextInt()){
            System.out.println("Enter the Student's letter grades for each class in order;");
            var studentGrade = reader.nextLine();
            if (studentGrade == "A"){
                credits = credits + 4;
            }
            numberOfCredits = credits;
        }

        gpa = 0.00f;
    }

    public void changeAdvisor(Professor newAdvisor){
        advisor = newAdvisor;

    }

    public float getGPA(){
        return gpa; // returns the gpa
    }

    public int getCreditHours(){
        return numberOfCredits;

    }

    public int getStudentID(){
        return studentID;
    }

    public String toString(){
        var studentFile = ("Student name: "+ name+ "Student ID: "+studentID +"Student Advisor: "+
                advisor + "Student gpa: "+gpa);
        return studentFile;
    }

    public Professor getAdvisor(){
        return advisor;
    }




}
