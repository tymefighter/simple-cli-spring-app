package com.orgmanage.cliApp.cliRunner;

import com.orgmanage.cliApp.dataStore.DataStore;
import com.orgmanage.cliApp.employee.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
@Order(0)
public class CLIRunner implements CommandLineRunner {
  private final DataStore dataStore;

  public CLIRunner(final DataStore dataStore) {
    this.dataStore = dataStore;
  }

  public void run(String ...args) {
    System.out.println("Organization management application");

    Scanner scanner = new Scanner(System.in);
    while(true) {
      System.out.print("> ");

      String input = scanner.nextLine();
      String[] inputSplit = input.split(" ");
      Command command = Command.getCommand(inputSplit[0]);

      switch(command) {
        case ADD: {
          String employeeType = inputSplit[1];

          switch (employeeType) {
            case "developer": {
              String name = inputSplit[2];
              Employee manager = dataStore.getEmployeeById(inputSplit[3]);
              Team team = Team.getTeam(inputSplit[4]);

              dataStore.addEmployee(
                  new Developer(name, manager, team)
              );

              break;
            }

            case "productManager": {
              String name = inputSplit[2];
              Employee manager = dataStore.getEmployeeById(inputSplit[3]);
              String product = inputSplit[4];

              dataStore.addEmployee(
                  new ProductManager(name, manager, product)
              );

              break;
            }

            case "cto": {
              String name = inputSplit[2];
              dataStore.addEmployee(
                  new CTO(name)
              );

              break;
            }

            default: {
              break;
            }
          }

          break;
        }

        case GET: {
          List<Employee> employees = dataStore.getEmployees();
          employees.stream().forEach(
              employee -> {
                System.out.println(employee.toString());
              }
          );

          break;
        }

        case EXIT: {
          return;
        }
      }
    }
  }
}
