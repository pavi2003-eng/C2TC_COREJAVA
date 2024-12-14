package com.tns.ifet.assignment;
import com.tns.ifet.utilities.EmployeeUtilities;
public class AssignmentMain {
 public static void main(String[] args) {
 Manager manager = new Manager("Pavithra", 114, 100000, "Fullstack Developer");
 Developer developer = new Developer("Yukta", 115, 80000, "Java");
 EmployeeUtilities.printEmployeeDetails(manager);
 EmployeeUtilities.printEmployeeDetails(developer);
 }
}