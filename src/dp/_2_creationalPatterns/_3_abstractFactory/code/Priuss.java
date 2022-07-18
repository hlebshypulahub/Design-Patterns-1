package dp._2_creationalPatterns._3_abstractFactory.code;

/**
 * @author apuchals
 */
public class Priuss extends EcoCar {

	private EngineLocation engineLocation = EngineLocation.FRONT;

	/** */
	public Priuss() {
		super(EngineType.HYBRID);
		this.emissions = 10;
	}

	@Override
	public EngineLocation getEngineLocation() {
		return engineLocation;
	}

	@Override
	public WheelDriveLayout getWheelDriveLayout() {
		return WheelDriveLayout.FRONT;
	}

	@Override
	public String drive() {
		return "PyrPyrPyr";
	}

	@Override
	public String pressHorn() {
		return "IoIoIo";
	}

	@Override
	public String turnSharpRight() {
		return "the car turns slowly";
	}

}
