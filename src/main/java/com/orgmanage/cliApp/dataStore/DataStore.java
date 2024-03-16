package com.orgmanage.cliApp.dataStore;

import com.orgmanage.cliApp.employee.Employee;

import java.util.List;

public interface DataStore {
  List<Employee> getEmployees();

  void addEmployee(Employee employee);

  Employee getEmployeeById(String id);
}
