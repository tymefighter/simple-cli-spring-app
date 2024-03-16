package com.orgmanage.cliApp.employee;

public class CTO extends Employee {
  public CTO(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return String.format("%s: CTO(%s)", name, id);
  }
}
