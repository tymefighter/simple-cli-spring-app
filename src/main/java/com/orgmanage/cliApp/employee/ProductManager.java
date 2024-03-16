package com.orgmanage.cliApp.employee;

public class ProductManager extends Employee {
  private String product;

  public ProductManager(String name, Employee manager, String product) {
    super(name, manager);
    this.product = product;
  }

  @Override
  public String toString() {
    return String.format("%s: %s manager(%s)", name, product.toString(), id);
  }
}
