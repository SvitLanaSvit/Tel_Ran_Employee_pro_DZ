package model;

public class TopWorker extends Employee {
    public TopWorker(String name, String surname, String position, int age, double salary) {
        this.setName(name);
        this.setSurname(surname);
        this.setPosition(position);
        this.setAge(age);
        this.setSalary(salary);
    }
}