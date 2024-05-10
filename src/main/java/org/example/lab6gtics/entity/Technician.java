package org.example.lab6gtics.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="technician")
public class Technician {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="technicianid",nullable = false)
    private int technicianId;

    @Column(name="firstname")
    @Size(max=100, message="El campo no puede tener más de 100 caracteres")
    private String firstName;


    @Column(name="lastname")
    @Size(max=100, message="El campo no puede tener más de 100 caracteres")
    private String lastName;

    @Column(name="dni")
    @Size(max=8, message="El campo no puede tener más de 8 caracteres")
    private String dni;

    @Column(name="phone")
    @Size(max=9, message="El campo no puede tener más de 9 caracteres")
    private String phone;

    @Column(name="age")
    private int age;

    public int getTechnicianId() {
        return technicianId;
    }

    public void setTechnicianId(int technicianId) {
        this.technicianId = technicianId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}