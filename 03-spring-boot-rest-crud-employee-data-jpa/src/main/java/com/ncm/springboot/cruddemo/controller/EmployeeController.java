package com.ncm.springboot.cruddemo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncm.springboot.cruddemo.entity.Employee;
import com.ncm.springboot.cruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/employees")
public class EmployeeController {
    
    private EmployeeService employeeService; 

    public EmployeeController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model theModel){
        // adding this for debugging
        System.out.println("Fetching employees from the database... ");
        
        // we need to get the employees from the db
        List<Employee> theEmployees = employeeService.findAll();

        // add employees to the spring model
        theModel.addAttribute("employees", theEmployees);

        return "employees/list-employees";

    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){

        // lets create a new model attribute
        Employee theEmployee = new Employee();

        theModel.addAttribute("employee", theEmployee);

        return "employees/employee-form";
    }

    // add a mapping for when the user clicks update 
    @GetMapping("showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") int theId,Model theModel){
        
        // first lets grab the employee 
        Employee theEmployee = employeeService.findById(theId);

        // add the employee to the model 
        theModel.addAttribute("employee", theEmployee);

        return "employees/employee-form";
    }

    // Now we need to add a mapping for DELETE 
    @GetMapping("/delete")
    public String delete(@RequestParam("employeeId")int theId){

        // lets get the employee and delete it 
       employeeService.deleteById(theId);

       return "redirect:/employees/list";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee){
        
        //save the employee
        employeeService.save(theEmployee);

        return "redirect:/employees/list";
    }

    
}
