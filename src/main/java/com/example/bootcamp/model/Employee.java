package com.example.bootcamp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Employee {
    private @Id @GeneratedValue @Getter @Setter
    Long id;
    private @Getter @Setter String name;
    private @Getter @Setter String role;
//    private @Getter @Setter String name;


    public Employee() {

    }

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }

        if(!(o instanceof Employee e)) {
            return false;
        }

        return Objects.equals(this.id, e.id)
                && Objects.equals(this.name, e.name)
                && Objects.equals(this.role, e.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.role);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.role
                + '\'' + '}';
    }
}
