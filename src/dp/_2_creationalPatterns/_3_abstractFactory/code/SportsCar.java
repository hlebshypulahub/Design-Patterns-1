package dp._2_creationalPatterns._3_abstractFactory.code;

/**
 * @author apuchals
 */
public abstract class SportsCar implements Car {

	/**
	 * the sports car engine location
	 */
	protected EngineLocation engineLocation;
	/**
	 * the wheel drive layout
	 */
	protected WheelDriveLayout wheelDriveLayout;

	/**
	 * 
	 */
	public SportsCar() {
		engineLocation = EngineLocation.MIDDLE;
		wheelDriveLayout = WheelDriveLayout.REAR;
	}

	@Override
	public EngineLocation getEngineLocation() {
		return engineLocation;
	}

	@Override
	public String turnSharpRight() {
		return "The car oversteers and You die!";
	}

	@Override
	public WheelDriveLayout getWheelDriveLayout() {
		return wheelDriveLayout;
	}

	@Override
	public String getCarDetails() {
		return "I am a " + this.getClass().getName() + " and I am fast";
	}

}
