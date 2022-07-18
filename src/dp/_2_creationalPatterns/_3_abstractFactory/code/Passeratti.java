package dp._2_creationalPatterns._3_abstractFactory.code;

/**
 * @author apuchals
 */
public class Passeratti extends SportsCar {

	private EngineType engineType;
	private int emissions;

	/**
	 * @param engineType
	 *            the type
	 * @param emissions
	 *            the engine emissions
	 */
	public Passeratti(EngineType engineType, int emissions) {
		this.engineType = engineType;
		this.emissions = emissions;
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
		return "Brrbrrbrrbrr";
	}

	@Override
	public String pressHorn() {
		return "Tuuut";
	}

}
