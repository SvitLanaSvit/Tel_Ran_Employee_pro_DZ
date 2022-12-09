package service;

import db.DataBase;
import model.Employee;
import model.PositionList;

import java.util.*;

public class Service {

    //Service List
    public void editPositionInList(DataBase<Employee> db, Employee employee){
        System.out.println("--------------------EDIT---------------------");
        List<Employee> employees = db.getEmployeeList();
        if (employees.size() != 0){
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
            db.showDataBaseList();
        }
        else{
            System.out.println("The List of employees is empty.");
        }
    }
    public void addEmployeeToList(DataBase<Employee> db, Employee employee){
        List<Employee> employees = db.getEmployeeList();
        employees.add(employee);
    }
    public void removeEmployeeFromList(DataBase<Employee> db, Employee employee){
        System.out.println("--------------------REMOVE---------------------");
        List<Employee> employees = db.getEmployeeList();
        if(employees.size() != 0){
            System.out.println("\n" + employee.getName() + " " + employee.getSurname() + " has deleted.\n");
            employees.remove(employee);
            db.showDataBaseList();
            System.out.println("Count of list: " + getSizeOfList(db));
        }
        else{
            System.out.println("The List of employees is empty.");
        }
    }
    public int getSizeOfList(DataBase<Employee> db){
        List<Employee> employees = db.getEmployeeList();
        int length = employees.size();
        return length;
    }
    public void getIndexOfEmployeeFromList(DataBase<Employee> db, Employee employee){
        List<Employee> employees = db.getEmployeeList();
        if(employees.size() != 0){
            System.out.println("\nThe index of employee " + employee.getName() + " " + employee.getSurname() +
                    " in the List = " + employees.indexOf(employee) + "\n");
        }
        else
            System.out.println("\nThe List of employees is empty.\n");
    }
    public List<Employee> sortCollectionsList(DataBase<Employee> db){
        List<Employee> employees = db.getEmployeeList();
        if(employees.size() > 0){
            Collections.sort(employees);
        }
        else return null;
        return employees;
    }

    //Service TreeSet
    public void editPositionInTreeSet(DataBase<Employee> db, Employee employee){
        System.out.println("--------------------EDIT---------------------");
        TreeSet<Employee> employees = db.getEmployeeTreeSet();
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
    public void addEmployeeToTreeSet(DataBase<Employee> db, Employee employee){
        TreeSet<Employee> employees = db.getEmployeeTreeSet();
        employees.add(employee);
    }
    public void removeEmployeeFromTreeSet(DataBase<Employee> db, Employee employee){
        System.out.println("--------------------REMOVE---------------------");
        TreeSet<Employee> employees = db.getEmployeeTreeSet();
        if(employees != null){
            System.out.println("\n" + employee.getName() + " " + employee.getSurname() + " has deleted.\n");
            employees.remove(employee);
            db.showDataBaseTreeSet();
            System.out.println("Count of TreeSet: " + getSizeOfTreeSet(db) + "\n");
        }
        else{
            System.out.println("The List of employees is empty.");
        }
    }
    public int getSizeOfTreeSet(DataBase<Employee> db){
        TreeSet<Employee> employees = db.getEmployeeTreeSet();
        int length = employees.size();
        return length;
    }
    public void getFirstEmployeeFromTreeSet(DataBase<Employee> db){
        TreeSet<Employee> employees = db.getEmployeeTreeSet();
        if(employees != null){
            System.out.println("The first employee without remove from TreeSet:\n" + employees.first());
        }
        else
            System.out.println("The TreeSet of employees is empty.\n");
    }
    public void getLastEmployeeFromTreeSet(DataBase<Employee> db){
        TreeSet<Employee> employees = db.getEmployeeTreeSet();
        if(employees != null){
            System.out.println("The last employee without remove from TreeSet:\n" + employees.last());
        }
        else
            System.out.println("The TreeSet of employees is empty.\n");
    }
    public void getRemoveFirstEmployeeFromTreeSet(DataBase<Employee> db){
        TreeSet<Employee> employees = db.getEmployeeTreeSet();
        if(employees.size() != 0){
            System.out.println("The first employee with remove from TreeSet:\n" + employees.pollFirst());
        }
        else
            System.out.println("The TreeSet of employees is empty.\n");
        System.out.println("Count of TreeSet: " + getSizeOfTreeSet(db) + "\n");
    }
    public void getRemoveLastEmployeeFromTreeSet(DataBase<Employee> db){
        TreeSet<Employee> employees = db.getEmployeeTreeSet();
        if(employees != null){
            System.out.println("The last employee with remove from TreeSet:\n" + employees.pollLast());
        }
        else
            System.out.println("The TreeSet of employees is empty.\n");
        System.out.println("Count of TreeSet: " + getSizeOfTreeSet(db) + "\n");
    }

    //Service HashMap
    public void editPositionInHashMap(DataBase<Employee> db, Integer key){
        System.out.println("--------------------EDIT---------------------");
        HashMap<Integer, Employee> employees = db.getEmployeeHashMap();

        if (!employees.isEmpty()){
            for (Map.Entry<Integer, Employee> e : employees.entrySet()) {
                if (employees.containsKey(key)) {
                    System.out.println("\nFor change position for " +
                            e.getValue().getName() + " " + e.getValue().getSurname() + " choose case:" +
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
                    if (number >= 1 && number <= 6) {
                        switch (number) {
                            case 1 -> str = PositionList.DIRECTOR.toString();
                            case 2 -> str = PositionList.MANAGER.toString();
                            case 3 -> str = PositionList.ENGINEER.toString();
                            case 4 -> str = PositionList.CONSTRUCTOR.toString();
                            case 5 -> str = PositionList.ACCOUNTANT.toString();
                            case 6 -> str = PositionList.WORKER.toString();
                        }
                        e.getValue().setPosition(str);
                        db.showDataBaseHashMap();
                        break;
                    }
                    else{
                        System.out.println("The choose is wrong!");
                    }
                }
            }
        }
        else{
            System.out.println("The List of employees is empty.");
        }
    }
    public void addEmployeeToHashMap(DataBase<Employee> db, Integer key, Employee employee){
        HashMap<Integer, Employee> employees = db.getEmployeeHashMap();
        employees.put(key, employee);
    }
    public void removeEmployeeFromHashMapByKey(DataBase<Employee> db, Integer key){
        System.out.println("------------------REMOVE-------------------");
        HashMap<Integer, Employee> employees = db.getEmployeeHashMap();
        if(!employees.isEmpty()){
            if(employees.containsKey(key)){
                System.out.println("\n" + employees.get(key).getName() + " " + employees.get(key).getSurname()
                        + " has deleted.\n");
                employees.remove(key);
                db.showDataBaseHashMap();
                System.out.println("Count of HashMap: " + getSizeOfHashMap(db) + "\n");
            }
            else{
                System.out.println("The key " + key + " is not exists by HashMap.");
            }
        }
        else{
            System.out.println("This HashMap of employees is empty.");
        }
    }
    public void showKeys(DataBase<Employee> db){
        HashMap<Integer, Employee> employees = db.getEmployeeHashMap();
        System.out.println("---------------SHOW ALL KEY-----------------");
        for (Map.Entry<Integer, Employee> e: employees.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue().getName() + " " + e.getValue().getSurname());
        }
    }
    public int getSizeOfHashMap(DataBase<Employee> db){
        HashMap<Integer, Employee> employees = db.getEmployeeHashMap();
        return employees.size();
    }
}