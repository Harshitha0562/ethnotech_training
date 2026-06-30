package org.example;

import jakarta.persistence.*;

@Entity //aarks class as db table
@Table(name="Students") //specifies the table name
public class Students {

    @Id //this nnotation marks the primary key column
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-generates id
    private int id;
    private String name;
    private int marks;
    public Students()
    {

    }

    public Students (String name,int marks)
    {
        this.name=name;
        this.marks=marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
