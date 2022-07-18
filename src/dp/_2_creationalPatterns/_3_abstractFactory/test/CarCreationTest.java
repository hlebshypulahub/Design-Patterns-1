package dp._2_creationalPatterns._3_abstractFactory.test;

import static org.junit.Assert.assertEquals;

import dp._2_creationalPatterns._3_abstractFactory.code.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * TASK 2.3 - instead of manually creating instances for the tests create an
 * abstract factory that will do it for you.
 * <p>
 * Note: there are some assumptions suggested - Assume some default car
 * implementation, so the default constructor will make the car with the
 * defaults without need to pass the defaults to him.
 *
 * @author apuchals
 */
public class CarCreationTest {

    private static CarFactory carFactory;

    @BeforeClass
    public static void setup() {
        carFactory = new CarFactoryImpl();
    }

    /**
     *
     */
    @Test
    public void shouldCreatePasseratti() {
        // given
//		Car c = new Passeratti(EngineType.CONVENTIONAL, 200);
        Car c = carFactory.getCar("PASSERATTI");

        // when
        float emissions = c.calculateEmissions();

        // then
        assertEquals(200, emissions, 0.1);
    }

    /**
     *
     */
    @Test
    public void shouldCreateBugattini() {
        // given
//		Car c = new Bugattini(EngineType.FUEL_CELL);
        Car c = carFactory.getCar("BUGATTINI");

        // when
        EngineType engineType = c.getEngineType();

        // then
        assertEquals(EngineType.FUEL_CELL, engineType);
    }

    /**
     *
     */
    @Test
    public void shouldCreatePorsze() {
        // given
//		Car c = new Porsze();
        Car c = carFactory.getCar("PORSZE");

        // when
        float emissions = c.calculateEmissions();

        // then
        assertEquals(200, emissions, 0.1);
    }

    /**
     *
     */
    @Test
    public void shouldCreateVolksWagon() {
        // given
//		Car c = new VolksWagon();
        Car c = carFactory.getCar("VOLKSWAGON");

        // when
        float emissions = c.calculateEmissions();

        // then
        assertEquals(Integer.MAX_VALUE, emissions, 100);
    }

    /**
     *
     */
    @Test
    public void shouldCreatePriuss() {
        // given
//		Car c = new Priuss();
        Car c = carFactory.getCar("PRIUSS");

        // when
        float emissions = c.calculateEmissions();

        // then
        assertEquals(10, emissions, 0.1);
    }

    /**
     *
     */
    @Test
    public void shouldCreateTasla() {
        // given
//		Car c = new Tasla("Never gonna Give...");
        Car c = carFactory.getCar("TASLA");

        // when
        float emissions = c.calculateEmissions();

        // then
        assertEquals(0, emissions, 0.1);
    }

}
