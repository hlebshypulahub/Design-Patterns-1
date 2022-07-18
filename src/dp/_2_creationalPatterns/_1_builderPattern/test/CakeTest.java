package dp._2_creationalPatterns._1_builderPattern.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dp._2_creationalPatterns._1_builderPattern.code.Cake;

/**
 * TASK 2.1 - Introduce the Builder Pattern to the Cake creation so the code
 * looks and reads better
 * 
 * @author apuchals
 */
public class CakeTest {

	/** */
	@Test
	public void shouldComputeEmptyCakeMass() {
		// given
		Cake cake = new Cake.Builder().build();

		// when
		int mass = cake.mass();

		// then
		assertEquals(0, mass);
	}

	/** */
	@Test
	public void shouldComputePanCakeMass() {
		// given
//		Cake panCake = new Cake(300, 300, 2, 250, 8);
		Cake panCake = new Cake
				.Builder()
				.setMilk(300)
				.setWater(300)
				.setEggYolk(2)
				.setEggWhite(2)
				.setWheatFlour(250)
				.setSalt(8)
				.build();

		// when
		int mass = panCake.mass();

		// then
		assertEquals(958, mass);
	}

	/** */
	@Test
	public void shouldComputePanCakeMassLongVersion() {
		// given
		Cake panCake = new Cake();
		panCake.setMilk(300);
		panCake.setWater(300);
		panCake.setEggWhite(2);
		panCake.setEggYolk(2);
		panCake.setWheatFlour(250);
		panCake.setSalt(8);

		// when
		int mass = panCake.mass();

		// then
		assertEquals(958, mass);
	}

	/** */
	@Test
	public void shouldComputeDensePanCakeMass() {
		// given
//		Cake panCake = new Cake(300, 300, 2, 330, 8);
		Cake panCake = new Cake
				.Builder()
				.setMilk(300)
				.setWater(300)
				.setEggYolk(2)
				.setEggWhite(2)
				.setWheatFlour(330)
				.setSalt(8)
				.build();

		// when
		int mass = panCake.mass();

		// then
		assertEquals(1038, mass);
	}

	/** */
	@Test
	public void shouldComputeFoodEmperorCakeMass() {
		// given
//		Cake foodEmperorCake = new Cake(160, 1, 3, 25, 3, 3, 115, 17, 8);
		Cake foodEmperorCake = new Cake
				.Builder()
				.setSugar(160)
				.setEggYolk(1)
				.setEggWhite(3)
				.setLemonJuice(25)
				.setVanilaBeans(3)
				.setLemonZest(3)
				.setWheatFlour(115)
				.setOliveOil(17)
				.setSalt(8)
				.build();

		// when
		int mass = foodEmperorCake.mass();

		// then
		assertEquals(450, mass);
	}

	/** */
	@Test
	public void shouldComputeFoodEmperorModifiedCakeMass() {
		// given
//		Cake foodEmperorCake = new Cake(160, 1, 3, 25, 3, 3, 115, 17, 8);
//		foodEmperorCake.setButter(200);
//		foodEmperorCake.setWater(50);
//		foodEmperorCake.setEggWhite(1);
//		foodEmperorCake.setEggYolk(13);
//		foodEmperorCake.setMilk(50);
		Cake foodEmperorCake = new Cake
				.Builder()
				.setSugar(160)
				.setEggYolk(1)
				.setEggWhite(3)
				.setLemonJuice(25)
				.setVanilaBeans(3)
				.setLemonZest(3)
				.setWheatFlour(115)
				.setOliveOil(17)
				.setSalt(8)
				.setButter(200)
				.setWater(50)
				.setEggWhite(1)
				.setEggYolk(13)
				.setMilk(50)
				.build();


		// when
		int mass = foodEmperorCake.mass();

		// then
		assertEquals(888, mass);
	}

	/** */
	@Test
	public void shouldComputeOilAndWaterMixtureMass() {
		// given
//		Cake oilAndWater = new Cake();
//		oilAndWater.setOliveOil(150);
//		oilAndWater.setWater(98);
		Cake oilAndWater = new Cake
				.Builder()
				.setOliveOil(150)
				.setWater(98)
				.build();

		// when
		int mass = oilAndWater.mass();

		// then
		assertEquals(248, mass);
	}

	/** */
	@Test
	public void shouldComputeEggWhiteAndYolkMass() {
		// given
//		Cake yolkAndWhite = new Cake();
//		yolkAndWhite.setEggWhite(3);
//		yolkAndWhite.setEggYolk(2);
		Cake yolkAndWhite = new Cake
				.Builder()
				.setEggWhite(3)
				.setEggYolk(2)
				.build();

		// when
		int mass = yolkAndWhite.mass();

		// then
		assertEquals(133, mass);
	}

}
