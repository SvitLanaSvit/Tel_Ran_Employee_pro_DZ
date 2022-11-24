package db;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Employee> employeeList;

    public DataBase(){
        employeeList = new ArrayList<>(200);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void showDataBase(){
        if (employeeList != null){
            System.out.println("--------------------------------------------");
            employeeList.forEach(t-> System.out.println("\t" + t.getClass().getName() + "\n" + t));
        }
        else{
            System.out.println("The List of employees is empty.");
        }
    }
}
