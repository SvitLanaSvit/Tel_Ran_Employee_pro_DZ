package model;

public class OrdinaryWorker extends Employee{
    public OrdinaryWorker(String name, String surname, String position, int age, double salary){
        this.setName(name);
        this.setSurname(surname);
        this.setPosition(position);
        this.setAge(age);
        this.setSalary(salary);
    }
}
