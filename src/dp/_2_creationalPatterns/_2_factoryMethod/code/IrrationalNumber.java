package dp._2_creationalPatterns._2_factoryMethod.code;

/**
 * TASK 2.2 - This class has many constructors that look identical in the
 * signature - or would look identical if some booleans where thrown away.
 * Introduce some static factory methods so it allows more effective work.
 *
 * @author apuchals
 */
public class IrrationalNumber {

    // cartesian coordinates
    private double re;
    private double im;

    public static IrrationalNumber cartesian(double re, double im) {
        IrrationalNumber irrationalNumber = new IrrationalNumber();
        irrationalNumber.re = re;
        irrationalNumber.im = im;
        return irrationalNumber;
    }

    /**
     * @param re real
     * @param im imaginative
     */
//	public IrrationalNumber(double re, double im) {
//		this.re = re;
//		this.im = im;
//	}

    public static IrrationalNumber cartesian(double re) {
        return cartesian(re, 0);
    }

    /**
     * @param re real
     */
//	public IrrationalNumber(double re) {
//		this(re, 0);
//	}
    public static IrrationalNumber cylindric(double r, double phi) {
        IrrationalNumber irrationalNumber = new IrrationalNumber();
        irrationalNumber.re = r * Math.cos(phi);
        irrationalNumber.im = r * Math.sin(phi);
        return irrationalNumber;
    }

    /**
     * @param r                the length
     * @param phi              the angle
     * @param isCylindricCoord flag
     */
//	public IrrationalNumber(double r, double phi, boolean isCylindricCoord) {
//		this.re = r * Math.cos(phi);
//		this.im = r * Math.sin(phi);
//	}
    public static IrrationalNumber cylindric(double r) {
        return cylindric(r, 0);
    }

    /**
     * @param r
     *            the length
     * @param isCylindricCoord
     *            flag
     */
//	public IrrationalNumber(double r, boolean isCylindricCoord) {
//		this(r, 0, true);
//	}

    /**
     *
     */
//    public IrrationalNumber() {
//        this(0, 0);
//    }

    @Override
    public String toString() {
        return String.format("%4.3f + %4.3fi", re, im);
    }

}
