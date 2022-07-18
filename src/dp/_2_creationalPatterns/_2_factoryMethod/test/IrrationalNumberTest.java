package dp._2_creationalPatterns._2_factoryMethod.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dp._2_creationalPatterns._2_factoryMethod.code.IrrationalNumber;

/**
 * @author apuchals
 */
public class IrrationalNumberTest {

	/** */
	@Test
	public void shouldPrintEmptyIrrationalNumber() {
		// given
		IrrationalNumber num = new IrrationalNumber();

		// when then
		assertEquals("0,000 + 0,000i", num.toString());
	}

	/** */
	@Test
	public void shouldPrintRealPartOfTheIrrationalNumber() {
		// given
		IrrationalNumber num = IrrationalNumber.cylindric(3);

		// when then
		assertEquals("3,000 + 0,000i", num.toString());
	}

	/** */
	@Test
	public void shouldPrintCartesianPlaneIrrationalNumber() {
		// given
		IrrationalNumber num = IrrationalNumber.cartesian(3, 2);

		// when then
		assertEquals("3,000 + 2,000i", num.toString());
	}

	/** */
	@Test
	public void shouldPrintCylindricPlaneForRealIrrationalNumber() {
		// given
		IrrationalNumber num = IrrationalNumber.cylindric(3, 0);

		// when then
		assertEquals("3,000 + 0,000i", num.toString());
	}

	/** */
	@Test
	public void shouldPrintCylindricPlaneForIrrationalIrrationalNumber() {
		// given
		IrrationalNumber num = IrrationalNumber.cylindric(1, Math.PI / 2);

		// when then
		assertEquals("0,000 + 1,000i", num.toString());
	}

	/** */
	@Test
	public void shouldPrintCylindricPlaneForMixedIrrationalNumber() {
		// given
		IrrationalNumber num = IrrationalNumber.cylindric(1, Math.PI / 4);

		// when then
		assertEquals("0,707 + 0,707i", num.toString());
	}

}
