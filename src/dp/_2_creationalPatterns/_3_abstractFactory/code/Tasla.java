package dp._2_creationalPatterns._3_abstractFactory.code;

/**
 * @author apuchals
 */
public class Tasla extends EcoCar {

	private String driveSound;

	/**
	 * @param driveSound
	 *            the sound
	 */
	public Tasla(String driveSound) {
		super(EngineType.ELECTRIC);
		this.driveSound = driveSound;
	}

	@Override
	public EngineLocation getEngineLocation() {
		return EngineLocation.MIDDLE;
	}

	@Override
	public WheelDriveLayout getWheelDriveLayout() {
		return WheelDriveLayout.REAR;
	}

	@Override
	public String drive() {
		return driveSound;
	}

	@Override
	public String pressHorn() {
		return "Pik";
	}

	@Override
	public String turnSharpRight() {
		return "the car turns easily";
	}

}
