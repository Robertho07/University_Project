package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Professor {
    private ArrayList<Student> adviseeList;
    private String name;
    private String department;

    public Professor(String proName, String dept){
        name = proName;
        department = dept;
        var Studentlist = new ArrayList<Student>(adviseeList);
    }
    public boolean addAdvisee(){
        var brand = new Student();
        var newkid = adviseeList.add(brand);
        return newkid;
    }

    public void removeAdvisee(Student formerAdvisee){
        Student graduatedAdvisee = null;
        for (var advisee : adviseeList) {
            if (graduatedAdvisee.toString()== getName()) {
                graduatedAdvisee = advisee;
                break;
            }
        }
        adviseeList.remove(graduatedAdvisee);
    }
    public String getName(){
        return name;
    }
    public String toString(){
        var profFile = ("Professor name: "+name+" Professor's department: "+department);
        return profFile;
    }

}
