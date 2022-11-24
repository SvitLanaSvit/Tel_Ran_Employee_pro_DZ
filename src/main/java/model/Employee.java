package model;

import java.util.Objects;

public class Employee implements Managementing, Controling, Working, Comparable<Employee> {
    private String name;
    private String surname;
    private String position;
    private int age;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(int age) {
        try{
            if(age > 18 && age < 66)
                this.age = age;
            else{
                throw new Exception("The age is not correct.");
            }

        }
        catch(Exception ex){
            System.out.println(ex.toString());
            System.out.println("Employee : " + name + " " + surname);
            System.exit(0);
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public void setSalary(double salary) {
        if(salary >= 0)
            this.salary = salary;
        else
            this.salary = 0;
    }

    @Override
    public void control() {
        System.out.println(this.getPosition() + " controls all in the company.");
    }
    @Override
    public void management() {
        System.out.println(this.getPosition() + " develops in the company.");
    }
    @Override
    public void work() {
        System.out.println(this.getPosition() + " works in the company.");
    }

    @Override
    public String toString() {
        if(position == PositionList.DIRECTOR.toString() || position == PositionList.MANAGER.toString())
            control();
        else if(position == PositionList.ENGINEER.toString() || position == PositionList.CONSTRUCTOR.toString())
            management();
        else if(position == PositionList.ACCOUNTANT.toString() || position == PositionList.WORKER.toString())
            work();
        return "--------------------------------------------" +
                "\nPosition:\t\t\t\t" + position +
                "\nName of employee:\t\t" + name +
                "\nSurname of employee:\t" + surname +
                "\nAge:\t\t\t\t\t" + age +
                "\nSalary:\t\t\t\t\t" + salary +
                "\n--------------------------------------------";
    }

    @Override
    public int compareTo(Employee obj) {
        int resSurname = this.position.compareTo(obj.position);
        if(resSurname == 0)
            resSurname = this.surname.compareTo(obj.surname);
        return resSurname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, position, age);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Employee employee)) return false;
        return Objects.equals(surname, employee.surname) && Objects.equals(position, employee.position) &&
                Objects.equals(age, employee.age);
    }
}