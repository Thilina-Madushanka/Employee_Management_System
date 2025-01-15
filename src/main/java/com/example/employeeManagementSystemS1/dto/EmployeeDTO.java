package com.example.employeeManagementSystemS1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {
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
