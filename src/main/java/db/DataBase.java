package db;

import model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class DataBase<T extends Employee> {
    private List<T> employeeList;
    private TreeSet<T> employeeTreeSet;

    public DataBase(){
        employeeList = new ArrayList<>(200);
        employeeTreeSet = new TreeSet<>();
    }

    public List<T> getEmployeeList() {
        return employeeList;
    }
    public TreeSet<T> getEmployeeTreeSet(){ return employeeTreeSet;}

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
            System.out.println("TreeSet of employees is empty.");
        }
    }
}
