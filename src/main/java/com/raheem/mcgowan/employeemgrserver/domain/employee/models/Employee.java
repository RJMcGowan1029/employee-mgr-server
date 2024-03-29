package com.raheem.mcgowan.employeemgrserver.domain.employee.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // For JPA to save to database
@NoArgsConstructor // Generate our non argument constructor
@RequiredArgsConstructor
@Data // Generate our getters and setters
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @NonNull
    private String email;

    public String toString(){
       return String.format("%d %s %s %s", id, firstName, lastName, email);
    }

}
