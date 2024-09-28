# Employee Management System

This project is a simple **Employee Management System** built with **Spring Boot** and **Thymeleaf**. It allows users to manage employee records, including adding, updating, viewing, and deleting employees.

## Features

- Add new employees with their details (first name, last name, and email)
- View the list of all employees
- Update existing employee details
- Delete employees from the system

## Technologies Used

- **Spring Boot**: Backend framework for creating RESTful APIs
- **Thymeleaf**: Template engine for front-end pages
- **MySQL**: Database for storing employee data
- **Bootstrap**: For front-end styling

## Project Structure

- **EmployeeController.java**: Handles HTTP requests related to employee operations.
- **EmployeeService.java**: Interface that defines the business logic for managing employees.
- **EmployeeServiceImpl.java**: Implements the service interface for employee management.
- **EmployeeRepository.java**: Extends `JpaRepository` to interact with the MySQL database.
- **Employee.java**: The entity class representing an employee record.
- **Templates**:
  - `employee-form.html`: Form for adding or updating employee details.
  - `list-employees.html`: Displays the list of employees in a table.

## Setup Instructions

### Prerequisites

1. **Java 11 or later** installed on your system.
2. **MySQL** installed and running locally.
3. **Maven** installed to manage dependencies.

### Steps to Run

1. **Clone the repository**:

   ```bash
   git clone https://github.com/Neerajthind/employee-management-system.git
