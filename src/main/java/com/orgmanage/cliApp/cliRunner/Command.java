package com.orgmanage.cliApp.cliRunner;

public enum Command {
  ADD,
  GET,
  EXIT;

  public static Command getCommand(String command) {
    switch (command) {
      case "add":
        return ADD;

      case "get":
        return GET;

      case "exit":
        return EXIT;

      default:
        return null;
    }
  }
}
