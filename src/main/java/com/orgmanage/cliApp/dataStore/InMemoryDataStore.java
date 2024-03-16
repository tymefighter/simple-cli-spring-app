package com.orgmanage.cliApp.dataStore;

import com.orgmanage.cliApp.employee.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryDataStore implements DataStore {
  private ArrayList<Employee> employees;

  public InMemoryDataStore() {
    this.employees = new ArrayList<Employee>();
  }

  public List<Employee> getEmployees() {
    return employees;
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
  }

  public Employee getEmployeeById(String id) {
    return employees.stream().filter(
        employee -> employee.getId().equals(id)
    ).findFirst().get();
  }
}
