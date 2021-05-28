package com.javatechie.model.doctor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {
    @Id
    private int id;
    private String name;
    private String specialist;

    public Doctor() {
    }

    public Doctor(int id, String name, String specialist) {
        this.id = id;
        this.name = name;
        this.specialist = specialist;
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

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
}
