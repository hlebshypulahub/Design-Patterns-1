package dp._2_creationalPatterns._3_abstractFactory.code;

import java.util.NoSuchElementException;

public class CarFactoryImpl implements CarFactory {

    @Override
    public Car getCar(String name) {
        switch (name) {
            case "PORSZE":
            case "PASSERATTI":
            case "BUGATTINI":
                return new SportsCarFactory().getCar(name);
            case "VOLKSWAGON":
            case "TASLA":
            case "PRIUSS":
                return new EcoCarFactory().getCar(name);
            default:
                throw new NoSuchElementException("Car with name " + name + " not exists");
        }
    }

}
