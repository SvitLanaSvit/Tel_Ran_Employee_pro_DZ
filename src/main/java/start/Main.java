package start;

import db.DataBase;
import model.*;
import service.Service;
import generator.Generator;

public class Main {
    public static void main(String[] args) {
//        Employee emp1 = new TopWorker("Petro", "Vijchenko", PositionList.DIRECTOR.toString(),
//                45, 15000);
//        Employee emp2 = new MiddleWorker("Anna", "Bojko", PositionList.CONSTRUCTOR.toString(),
//                35,8000);
//        Employee emp3 = new TopWorker("Gleb", "Vil`k", PositionList.MANAGER.toString(),
//                30,10000);
//        Employee emp4 = new MiddleWorker("Svit", "Shpilova", PositionList.ENGINEER.toString(),
//                40,9000);
//        Employee emp5 = new OrdinaryWorker("Niko", "Klinck", PositionList.ACCOUNTANT.toString(),
//                31,4000);
//        Employee emp6 = new OrdinaryWorker("Viko", "Krojak", PositionList.WORKER.toString(),
//                29,5000);
//
//        //ArrayList
//        DataBase<Employee> dbList = new DataBase<>();
//
        Service service = new Service();
//        service.addEmployeeToList(dbList, emp1);
//        service.addEmployeeToList(dbList, emp2);
//        service.addEmployeeToList(dbList, emp3);
//        service.addEmployeeToList(dbList, emp4);
//        service.addEmployeeToList(dbList, emp5);
//        service.addEmployeeToList(dbList, emp6);
//        service.addEmployeeToList(dbList, Generator.makeTopWorker());
//        service.addEmployeeToList(dbList, Generator.makeMiddleWorker());
//        service.addEmployeeToList(dbList, Generator.makeOrdinaryWorker());
//
//        dbList.showDataBaseList();
//        System.out.println("Count of list: " + service.getSizeOfList(dbList));
//
////        service.editPosition(db, emp1);
////        service.editPosition(db, emp2);
//
//        service.removeEmployeeFromList(dbList, emp5);
//        service.getIndexOfEmployeeFromList(dbList,emp6);
//        service.sortCollectionsList(dbList);
//        dbList.showDataBaseList();

//        //TreeSet
//        System.out.println("------------------TREESET-------------------");
//        DataBase<Employee> dbTreeSet = new DataBase<>();
//        service.addEmployeeToTreeSet(dbTreeSet, emp1);
//        service.addEmployeeToTreeSet(dbTreeSet, emp2);
//        service.addEmployeeToTreeSet(dbTreeSet, emp3);
//        service.addEmployeeToTreeSet(dbTreeSet, emp4);
//        service.addEmployeeToTreeSet(dbTreeSet, emp5);
//        service.addEmployeeToTreeSet(dbTreeSet, emp6);
//
//        dbTreeSet.showDataBaseTreeSet();
//        System.out.println("Count of TreeSet: " + service.getSizeOfTreeSet(dbTreeSet) + "\n");
//
////        service.editPositionInTreeSet(dbTreeSet, emp1);
////        dbTreeSet.showDataBaseTreeSet();
//
//        service.removeEmployeeFromTreeSet(dbTreeSet, emp1);
//
//        service.getFirstEmployeeFromTreeSet(dbTreeSet);
//        service.getLastEmployeeFromTreeSet(dbTreeSet);
//        service.getRemoveFirstEmployeeFromTreeSet(dbTreeSet);
//        service.getRemoveLastEmployeeFromTreeSet(dbTreeSet);

        System.out.println("------------------HASHMAP-------------------");
        DataBase<Employee> dbHashMap = new DataBase<>();
        service.addEmployeeToHashMap (dbHashMap,1, Generator.makeOrdinaryWorker());
        service.addEmployeeToHashMap (dbHashMap,2, Generator.makeOrdinaryWorker());
        service.addEmployeeToHashMap (dbHashMap,3, Generator.makeOrdinaryWorker());
        service.addEmployeeToHashMap (dbHashMap,4, Generator.makeOrdinaryWorker());
        service.addEmployeeToHashMap (dbHashMap,5, Generator.makeOrdinaryWorker());
        service.addEmployeeToHashMap (dbHashMap,6, Generator.makeOrdinaryWorker());

        dbHashMap.showDataBaseHashMap();
        service.showKeys(dbHashMap);

        service.removeEmployeeFromHashMapByKey(dbHashMap, 2);

        service.editPositionInHashMap(dbHashMap, 1);

    }
}
