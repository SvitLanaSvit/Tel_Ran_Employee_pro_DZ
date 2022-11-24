package service;

import db.DataBase;
import model.Employee;
import model.PositionList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Service {

    public void editPosition(DataBase db, Employee employee){
        List<Employee> employees = db.getEmployeeList();
        if (employees != null){
            for (Employee model : employees) {
                if(model.hashCode() == employee.hashCode() && model.equals(employee)){

                    System.out.println("\nFor change position for " +
                            employee.getName() + " " + employee.getSurname() + " choose case:" +
                            "\n\t1.DIRECTOR" +
                            "\n\t2.MANAGER" +
                            "\n\t3.ENGINEER" +
                            "\n\t4.CONSTRUCTOR" +
                            "\n\t5.ACCOUNTANT" +
                            "\n\t6.WORKER");
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("\nEnter number of case: ");
                    int number = scanner.nextInt();
                    String str = "";
                    if(number >=1 && number <=6){
                        switch (number){
                            case 1 -> str = PositionList.DIRECTOR.toString();
                            case 2 -> str = PositionList.MANAGER.toString();
                            case 3 -> str = PositionList.ENGINEER.toString();
                            case 4 -> str = PositionList.CONSTRUCTOR.toString();
                            case 5 -> str = PositionList.ACCOUNTANT.toString();
                            case 6 -> str = PositionList.WORKER.toString();
                        }

                        model.setPosition(str);
                    }
                    else{
                        System.out.println("The number is not correct!");
                    }
                }
            }
        }
        else{
            System.out.println("The List of employees is empty.");
        }
    }

    public void addEmployee(DataBase db, Employee employee){
        List<Employee> employees = db.getEmployeeList();
        employees.add(employee);
    }

    public void removeEmployee(DataBase db, Employee employee){
        List<Employee> employees = db.getEmployeeList();
        if(employees != null){
            employees.remove(employee);
            System.out.println("\n" + employee.getName() + " " + employee.getSurname() + " has deleted.\n");
        }
        else{
            System.out.println("The List of employees is empty.");
        }
    }

    public int getSizeOfList(DataBase db){
        List<Employee> employees = db.getEmployeeList();
        int length = employees.size();
        return length;
    }

    public void getIndexOfEmployee(DataBase db, Employee employee){
        List<Employee> employees = db.getEmployeeList();
        if(employees != null){
            System.out.println("\nThe index of employee " + employee.getName() + " " + employee.getSurname() +
                    " in the List = " + employees.indexOf(employee) + "\n");
        }
        else
            System.out.println("\nThe List of employees is empty.\n");
    }

    public List<Employee> sortCollections(DataBase db){
        List<Employee> employees = db.getEmployeeList();
        if(employees.size() > 0){
            Collections.sort(employees);
        }
        else return null;
        return employees;
    }
}