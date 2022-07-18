package dp._2_creationalPatterns._3_abstractFactory.code;

/**
 * @author apuchals
 */
public class Porsze extends SportsCar {

	private EngineType engineType;
	private int emissions;

	/** */
	public Porsze() {
		this.engineLocation = EngineLocation.REAR;
		this.engineType = EngineType.CONVENTIONAL;
		this.emissions = 200;
	}

	@Override
	public float calculateEmissions() {
		return emissions;
	}

	@Override
	public EngineType getEngineType() {
		return engineType;
	}

	@Override
	public String drive() {
		return "BuuBuuBuu";
	}

	@Override
	public String pressHorn() {
		return "DingDong";
	}

}
