package util;

import com.github.javafaker.Faker;
import lombok.experimental.UtilityClass;
import model.*;

import java.util.Random;

public class Generator {
    public static Employee makeTopWorker() {
        Random rnd = new Random();
        Faker faker = new Faker();
        Employee employee = new TopWorker(faker.name().firstName(), faker.name().lastName(),
                PositionList.values()[rnd.nextInt(PositionList.values().length)].toString(),
                rnd.nextInt(18,66), rnd.nextDouble(1000,3500));
        return employee;
    }

    public static Employee makeMiddleWorker(){
        Random rnd = new Random();
        Faker faker = new Faker();
        Employee employee = new MiddleWorker(faker.name().firstName(), faker.name().lastName(),
                PositionList.values()[rnd.nextInt(PositionList.values().length)].toString(),
                rnd.nextInt(18,66), rnd.nextDouble(1000,3500));
        return employee;
    }

    public static Employee makeOrdinaryWorker(){
        Random rnd = new Random();
        Faker faker = new Faker();
        Employee employee = new OrdinaryWorker(faker.name().firstName(), faker.name().lastName(),
                PositionList.values()[rnd.nextInt(PositionList.values().length)].toString(),
                rnd.nextInt(18,66), rnd.nextDouble(1000,3500));
        return employee;
    }
}
