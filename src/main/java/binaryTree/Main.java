package binaryTree;

import model.*;

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
        Employee[] employees = new Employee[]{emp1, emp2, emp3, emp4, emp5, emp6};
        Node<Employee> node = new Node<>();
        node.createNode(node, emp1);
        for (int i = 1; i < employees.length; i++) {
            node.insert(node, employees[i]);
        }
        node.inOrderTraversal(node);
        System.out.println(node.remove(node, emp3));
        node.inOrderTraversal(node);
    }
}
