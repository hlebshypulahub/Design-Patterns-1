package dp._2_creationalPatterns._3_abstractFactory.code;

import java.util.NoSuchElementException;

public class SportsCarFactory implements CarFactory {

    @Override
    public SportsCar getCar(String name) {
        switch (name) {
            case "PORSZE":
                return new Porsze();
            case "PASSERATTI":
                return new Passeratti(EngineType.CONVENTIONAL, 200);
            case "BUGATTINI":
                return new Bugattini(EngineType.FUEL_CELL);
            default:
                return null;
        }
    }

}
