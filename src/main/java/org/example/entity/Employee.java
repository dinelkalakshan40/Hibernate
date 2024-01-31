package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.example.embeddable.FullName;

@Entity
public class Employee {

    @Id
    private int id;
    private FullName name;

    private String address;

    private double salary;

    public Employee(int id, FullName name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name=" + name +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}


