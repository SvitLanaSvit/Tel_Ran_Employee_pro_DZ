package db;

import model.Employee;

import java.util.*;

public class DataBase<T extends Employee> {
    private List<T> employeeList;
    private TreeSet<T> employeeTreeSet;
    private HashMap<Integer,T> employeeHashMap;

    public DataBase(){
        employeeList = new ArrayList<>(200);
        employeeTreeSet = new TreeSet<>();
        employeeHashMap = new HashMap<>();
    }

    public List<T> getEmployeeList() {
        return employeeList;
    }
    public TreeSet<T> getEmployeeTreeSet(){
        return employeeTreeSet;
    }
    public HashMap<Integer, T> getEmployeeHashMap(){
        return employeeHashMap;
    }

    public void showDataBaseList(){
        if (employeeList.size() != 0){
            System.out.println("--------------------------------------------");
            employeeList.forEach(t-> System.out.println("\t" + t.getClass().getName() + "\n" + t));
        }
        else{
            System.out.println("The List of employees is empty.");
        }
    }

    public void showDataBaseTreeSet(){
        if(employeeTreeSet.size() != 0){
            System.out.println("--------------------------------------------");
            employeeTreeSet.forEach(t -> System.out.println("\t" + t.getClass().getName() + "\n" + t));
        }
        else{
            System.out.println("The treeSet of employees is empty.");
        }
    }
    public void showDataBaseHashMap(){
        if(employeeHashMap.size() != 0){
            System.out.println("--------------------------------------------");
            employeeHashMap.forEach((k,v) -> System.out.println("\t" + v.getClass().getName() + "\nKey: " + k + "\n" +  v));
        }
        else{
            System.out.println("The hashMap of employees is empty.");
        }
    }

}
