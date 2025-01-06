package com.example.employeeManagementSystemS1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Employee")
public class Employee {
    @Id //make id to primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //primary key need to be unique.id going to auto genarate
    private int empID;
    private String empName;
    private String empAddress;
    private String empMNumber;

}
