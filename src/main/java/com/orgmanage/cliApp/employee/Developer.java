package com.orgmanage.cliApp.employee;

public class Developer extends Employee {
  private Team team;

  public Developer(String name, Employee manager, Team team) {
    super(name, manager);
    this.team = team;
  }

  @Override
  public String toString() {
    return String.format("%s: %s developer(%s)", name, team.toString(), id);
  }
}
