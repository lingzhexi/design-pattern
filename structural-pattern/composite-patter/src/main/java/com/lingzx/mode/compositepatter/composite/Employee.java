package com.lingzx.mode.compositepatter.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Employee {
   private String name;
   private String dept;
   private int salary;
   private List<Employee> subordinates;

   public Employee(String name, String dept, int salary) {
      this.name = name;
      this.dept = dept;
      this.salary = salary;
      subordinates = new ArrayList<Employee>();
   }

   public void add(Employee e) {
      subordinates.add(e);
   }

   public void remove(Employee e) {
      subordinates.remove(e);
   }

   public List<Employee> getSubordinates(){
      return subordinates;
   }
}
 