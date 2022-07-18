package dp._2_creationalPatterns._3_abstractFactory.code;

/**
 * @author apuchals
 */
public class Bugattini extends SportsCar {

	private EngineType engineType;
	private int emissions;

	/**
	 * @param engineType
	 *            the type
	 */
	public Bugattini(EngineType engineType) {
		this.engineType = engineType;
		this.emissions = Integer.MAX_VALUE;
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
		return "Brrrrrrr";
	}

	@Override
	public String pressHorn() {
		return "Beep";
	}
}
