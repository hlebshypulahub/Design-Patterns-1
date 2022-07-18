package dp._2_creationalPatterns._3_abstractFactory.code;

import java.util.NoSuchElementException;

public class EcoCarFactory implements CarFactory {

    @Override
    public EcoCar getCar(String name) {
        switch (name) {
            case "VOLKSWAGON" :
                return new VolksWagon();
            case "TASLA" :
                return new Tasla("Wuuuuuuu");
            case "PRIUSS" :
                return new Priuss();
            default:
                return null;
        }
    }

}
