package com.example.employeeManagementSystemS1.service;

import com.example.employeeManagementSystemS1.Util.VarList;
import com.example.employeeManagementSystemS1.dto.EmployeeDTO;
import com.example.employeeManagementSystemS1.entity.Employee;
import com.example.employeeManagementSystemS1.repo.EmployeeRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeeService {
    //--------------------------save method---------------
    @Autowired //inject the repository. we check the data from repository.
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper modelMapper;

    public String saveEmployee(EmployeeDTO employeeDTO){ //get data from dto
        if(employeeRepo.existsById(employeeDTO.getEmpID())){
            return VarList.RSP_DUPLICATED;
        }else{
            //dto going with dto type.we use employee type. so we find an error.there for we use to map. to that we use modal mapper.get from maven repository and paste it to dependency
            employeeRepo.save(modelMapper.map(employeeDTO, Employee.class));
            return VarList.RSP_SUCCESS;
        }
    }
}
