package Start;

import db.DataBase;
import model.*;
import service.Service;
import util.Generator;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new TopWorker("Petro", "Vijchenko", PositionList.DIRECTOR.toString(),
                45, 15000);
        Employee emp2 = new MiddleWorker("Anna", "Bojko", PositionList.CONSTRUCTOR.toString(),
                35,8000);
        Employee emp3 = new TopWorker("Gleb", "Vil`k", PositionList.MANAGER.toString(),
                30,10000);
        Employee emp4 = new MiddleWorker("Svit", "Shpilova", PositionList.ENGINEER.toString(),
                40,9000);
        Employee emp5 = new OrdinaryWorker("Niko", "Klinck", PositionList.ACCOUNTANT.toString(),
                31,4000);
        Employee emp6 = new OrdinaryWorker("Viko", "Krojak", PositionList.WORKER.toString(),
                29,5000);

        DataBase<Employee> db = new DataBase<>();

        Service service = new Service();
        service.addEmployee(db, emp1);
        service.addEmployee(db, emp2);
        service.addEmployee(db, emp3);
        service.addEmployee(db, emp4);
        service.addEmployee(db, emp5);
        service.addEmployee(db, emp6);
        service.addEmployee(db, Generator.makeTopWorker());
        service.addEmployee(db, Generator.makeMiddleWorker());
        service.addEmployee(db, Generator.makeOrdinaryWorker());

        db.showDataBase();
        System.out.println("Count of list: " + service.getSizeOfList(db));

//        service.editPosition(db, emp1);
//        service.editPosition(db, emp2);
//
//        db.showDataBase();
//        System.out.println("Count of list: " + service.getSizeOfList(db));

        service.removeEmployee(db, emp5);
        db.showDataBase();
        System.out.println("Count of list: " + service.getSizeOfList(db));

        service.getIndexOfEmployee(db,emp6);

        service.sortCollections(db);
        db.showDataBase();
    }
}
