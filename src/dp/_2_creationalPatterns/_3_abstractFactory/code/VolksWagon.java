package dp._2_creationalPatterns._3_abstractFactory.code;

/**
 * @author apuchals
 */
public class VolksWagon extends EcoCar {

	/** */
	public VolksWagon() {
		super(EngineType.CONVENTIONAL);
		this.emissions = Integer.MAX_VALUE;
	}

	@Override
	public EngineLocation getEngineLocation() {
		return EngineLocation.FRONT;
	}

	@Override
	public WheelDriveLayout getWheelDriveLayout() {
		return WheelDriveLayout.FRONT;
	}

	@Override
	public String drive() {
		return "Grrrrrrrrrr";
	}

	@Override
	public String pressHorn() {
		return "HALT!";
	}

	@Override
	public String turnSharpRight() {
		return "The car turns aggressively";
	}

}
