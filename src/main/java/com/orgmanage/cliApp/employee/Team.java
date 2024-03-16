package com.orgmanage.cliApp.employee;

public enum Team {
  UI("UI"),
  BACKEND("Backend"),
  AI("AI");

  private String label;

  private Team(String label) {
    this.label = label;
  }

  public static Team getTeam(String team) {
    switch (team) {
      case "UI":
        return UI;

      case "Backend":
        return BACKEND;

      case "AI":
        return AI;

      default:
        return null;
    }
  }

  @Override
  public String toString() {
    return label;
  }
}
