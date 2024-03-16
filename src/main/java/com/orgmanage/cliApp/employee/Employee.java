package com.orgmanage.cliApp.employee;

import java.util.UUID;

public abstract class Employee {
  protected String id;

  protected String name;

  protected Employee manager;

  public Employee(String name, Employee manager) {
    this.id = UUID.randomUUID().toString();
    this.name = name;
    this.manager = manager;
  }

  public Employee(String name) {
    this(name, null);
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Employee getManager() {
    return manager;
  }
}
