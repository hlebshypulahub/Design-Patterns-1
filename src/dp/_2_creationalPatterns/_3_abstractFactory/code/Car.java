package dp._2_creationalPatterns._3_abstractFactory.code;

/**
 * @author apuchals
 */
public interface Car {

	/**
	 * @return the emissions of the car
	 */
	public float calculateEmissions();

	/**
	 * @return the engine type
	 */
	public EngineType getEngineType();

	/**
	 * @return the engine location
	 */
	public EngineLocation getEngineLocation();

	/**
	 * @return the layout
	 */
	public WheelDriveLayout getWheelDriveLayout();

	/**
	 * @return the car engine sound
	 */
	public String drive();

	/**
	 * @return the car horn sound
	 */
	public String pressHorn();

	/**
	 * @return a hedgehog is on the way, turn sharp right!
	 */
	public String turnSharpRight();

	/**
	 * @return the car details
	 */
	public String getCarDetails();

}
