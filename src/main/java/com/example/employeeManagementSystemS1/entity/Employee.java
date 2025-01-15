package com.example.employeeManagementSystemS1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //For a class annotated with @Entity, ensure you also have the necessary JPA configuration for it to be scanned and managed. -> bean class
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

    // Getter for empID
    public int getEmpID() {
        return empID;
    }

    // Setter for empID
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    // Getter for empName
    public String getEmpName() {
        return empName;
    }

    // Setter for empName
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    // Getter for empAddress
    public String getEmpAddress() {
        return empAddress;
    }

    // Setter for empAddress
    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    // Getter for empMNumber
    public String getEmpMNumber() {
        return empMNumber;
    }

    // Setter for empMNumber
    public void setEmpMNumber(String empMNumber) {
        this.empMNumber = empMNumber;
    }
}

