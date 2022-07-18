package dp._2_creationalPatterns;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import dp._2_creationalPatterns._1_builderPattern.test.CakeTest;
import dp._2_creationalPatterns._2_factoryMethod.test.IrrationalNumberTest;
import dp._2_creationalPatterns._3_abstractFactory.test.CarCreationTest;
import dp._2_creationalPatterns._4_prototype.test.HandHeldDeviceCacheTest;

/**
 * @author apuchals
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ CakeTest.class, IrrationalNumberTest.class, CarCreationTest.class, HandHeldDeviceCacheTest.class })
public class CreationalPatternsMasterSuite {

}
