package dp._2_creationalPatterns._3_abstractFactory.code;

/**
 * @author apuchals
 */
public abstract class EcoCar implements Car {

	/**
	 * the engine type
	 */
	protected EngineType engineType;
	/**
	 * the emissions
	 */
	protected int emissions;

	/**
	 * @param engineType
	 *            the type
	 */
	public EcoCar(EngineType engineType) {
		this.engineType = engineType;
		this.emissions = 0;
	}

	@Override
	public EngineType getEngineType() {
		return engineType;
	}

	@Override
	public float calculateEmissions() {
		return emissions;
	}

	@Override
	public String getCarDetails() {
		return "I am a " + this.getClass().getName() + " and I am eco";
	}

}
