 package com.abhi.spingBoot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.spingBoot.execption.ResouraceNotFoundExecption;
import com.abhi.springboot.model.Employee;
import com.abhi.springboot.repository.Employeerepository;


@RestController
@RequestMapping("/api/vi/")
public class EmployeeController {
	
	@Autowired
	private Employeerepository employeerepository;
	
	//get employee
	
	@GetMapping("employee")
	public List<Employee> getallEmployee(){
		return this.employeerepository.findAll();
		
	}
	// get employee by id
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeebyId(@PathVariable(value = "id") Long employeeId)
		throws ResouraceNotFoundExecption{
		
		Employee employee = employeerepository.findById(employeeId)
				.orElseThrow(() -> new ResouraceNotFoundExecption("Employee id not found in this id :: " + employeeId  ));
				return ResponseEntity.ok().body(employee);
			
	}
	// update employee
	@PutMapping("employee/{id}")
	public ResponseEntity<Employee> updateemployee(@PathVariable(value= "id") Long employeeId,
	   @Validated @RequestBody Employee employeeDetails) throws ResouraceNotFoundExecption{
	
	Employee employee = employeerepository.findById(employeeId)
			.orElseThrow(() -> new ResouraceNotFoundExecption("Employee id not found in this id ::"+employeeId));
			
	employee.setFirstname(employeeDetails.getFirstname());
	employee.setLastname(employeeDetails.getLastname());
	employee.setSdate(employeeDetails.getSdate());
	employee.setGender(employeeDetails.getGender());
	employee.setBloodgroup(employeeDetails.getBloodgroup());
	employee.setReportingmanager(employeeDetails.getReportingmanager());
	employee.setAdress(employeeDetails.getAdress());
	
	return ResponseEntity.ok(this.employeerepository.save(employee));
	}
	
	//save employee
	@PostMapping("employee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return this.employeerepository.save(employee);
		
	}
	//detete employee
	
	public Map<String, Boolean > deleteemployee(@PathVariable(value = "id") Long employeeId) throws ResouraceNotFoundExecption {
		
		Employee employee = employeerepository.findById(employeeId)
				.orElseThrow(() -> new ResouraceNotFoundExecption("Employee id not found in this id ::"+employeeId));
				
		this.employeerepository.delete(employee);
		
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		
		return response;
		
	}
	
	

}
