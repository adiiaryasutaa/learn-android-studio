package com.ceceply.learnlistview;

public class Student {
  private String name;
  private String group;
  private int number;

  public Student(String name, String group, int number) {
    this.name = name;
    this.group = group;
    this.number = number;
  }

  public String getName() {
    return this.name;
  }

  public String getGroup() {
    return this.group;
  }

  public int getNumber() {
    return this.number;
  }

  @Override
  public String toString() {
    return this.name + " - " + this.group + " - " + String.valueOf(this.number);
  }
}
