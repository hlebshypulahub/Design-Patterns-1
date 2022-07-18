package dp._2_creationalPatterns._1_builderPattern.code;

/**
 * @author apuchals
 */
public class Cake {

	// gramms
	private int wheatFlour;
	private int sugar;
	private int butter;
	private int lemonZest;
	private int salt;

	// mililiters
	private int milk;
	private int water;
	private int lemonJuice;
	private int oliveOil;

	// count
	private int eggYolk;
	private int eggWhite;
	private int vanilaBeans;

	private Cake(Builder builder) {
		this.wheatFlour = builder.wheatFlour;
		this.sugar = builder.sugar;
		this.butter = builder.butter;
		this.lemonZest = builder.lemonZest;
		this.salt = builder.salt;

		// mililiters
		this.milk = builder.milk;
		this.water = builder.water;
		this.lemonJuice = builder.lemonJuice;
		this.oliveOil = builder.oliveOil;

		// count
		this.eggYolk = builder.eggYolk;
		this.eggWhite = builder.eggWhite;
		this.vanilaBeans = builder.vanilaBeans;
	}

	public static class Builder {
		// gramms
		private int wheatFlour;
		private int sugar;
		private int butter;
		private int lemonZest;
		private int salt;

		// mililiters
		private int milk;
		private int water;
		private int lemonJuice;
		private int oliveOil;

		// count
		private int eggYolk;
		private int eggWhite;
		private int vanilaBeans;

		public Cake build() {
			return new Cake(this);
		}

		public Builder setWheatFlour(int wheatFlour) {
			this.wheatFlour = wheatFlour;
			return this;
		}

		public Builder setSugar(int sugar) {
			this.sugar = sugar;
			return this;
		}

		public Builder setButter(int butter) {
			this.butter = butter;
			return this;
		}

		public Builder setLemonZest(int lemonZest) {
			this.lemonZest = lemonZest;
			return this;
		}

		public Builder setSalt(int salt) {
			this.salt = salt;
			return this;
		}

		public Builder setMilk(int milk) {
			this.milk = milk;
			return this;
		}

		public Builder setWater(int water) {
			this.water = water;
			return this;
		}

		public Builder setLemonJuice(int lemonJuice) {
			this.lemonJuice = lemonJuice;
			return this;
		}

		public Builder setOliveOil(int oliveOil) {
			this.oliveOil = oliveOil;
			return this;
		}

		public Builder setEggYolk(int eggYolk) {
			this.eggYolk = eggYolk;
			return this;
		}

		public Builder setEggWhite(int eggWhite) {
			this.eggWhite = eggWhite;
			return this;
		}

		public Builder setVanilaBeans(int vanilaBeans) {
			this.vanilaBeans = vanilaBeans;
			return this;
		}
	}

	/**
	 * Ingredients of a Pancake
	 * 
	 * @param milk
	 *            in mililiters
	 * @param water
	 *            in mililiters
	 * @param egg
	 *            number of
	 * @param wheatFlour
	 *            in gramms
	 * @param salt
	 *            in gramms
	 */
//	public Cake(int milk, int water, int egg, int wheatFlour, int salt) {
//		this.setMilk(milk);
//		this.setWater(water);
//		this.eggWhite = egg;
//		this.eggYolk = egg;
//		this.wheatFlour = wheatFlour;
//		this.salt = salt;
//	}

	/**
	 * Ingredients of a Lemon and Olive Oil cake
	 * http://www.foodemperor.com/cooking/oliveoilcake
	 * 
	 * @param sugar
	 *            in gramms
	 * @param eggYolk
	 *            count of
	 * @param eggWhite
	 *            count of
	 * @param lemonJuice
	 *            in mililiters
	 * @param vanilaBeans
	 *            in gramms
	 * @param lemonZest
	 *            in gramms
	 * @param wheatFlour
	 *            in gramms
	 * @param oliveOil
	 *            in mililiters
	 * @param salt
	 *            in gramms
	 */
//	public Cake(int sugar, int eggYolk, int eggWhite, int lemonJuice, int vanilaBeans, int lemonZest, int wheatFlour,
//			int oliveOil, int salt) {
//		this.sugar = sugar;
//		this.eggYolk = eggYolk;
//		this.eggWhite = eggWhite;
//		this.lemonJuice = lemonJuice;
//		this.vanilaBeans = vanilaBeans;
//		this.lemonZest = lemonZest;
//		this.wheatFlour = wheatFlour;
//		this.oliveOil = oliveOil;
//		this.salt = salt;
//
//	}

	/**
	 * Empty cake
	 */
	public Cake() {

	}

	public int getWheatFlour() {
		return wheatFlour;
	}

	public void setWheatFlour(int wheatFlour) {
		this.wheatFlour = wheatFlour;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public int getButter() {
		return butter;
	}

	public void setButter(int butter) {
		this.butter = butter;
	}

	public int getEggYolk() {
		return eggYolk;
	}

	public void setEggYolk(int eggYolk) {
		this.eggYolk = eggYolk;
	}

	public int getEggWhite() {
		return eggWhite;
	}

	public void setEggWhite(int eggWhite) {
		this.eggWhite = eggWhite;
	}

	public int getLemonJuice() {
		return lemonJuice;
	}

	public void setLemonJuice(int lemonJuice) {
		this.lemonJuice = lemonJuice;
	}

	public int getVanillaBeans() {
		return vanilaBeans;
	}

	public void setVanillaBeans(int vanillaBeans) {
		this.vanilaBeans = vanillaBeans;
	}

	public int getLemonZest() {
		return lemonZest;
	}

	public void setLemonZest(int lemonZest) {
		this.lemonZest = lemonZest;
	}

	public int getOliveOil() {
		return oliveOil;
	}

	public void setOliveOil(int oliveOil) {
		this.oliveOil = oliveOil;
	}

	public int getSalt() {
		return salt;
	}

	public void setSalt(int salt) {
		this.salt = salt;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	/**
	 * @return the mass of the cake
	 */
	public int mass() {
		int mass = 0;
		mass += wheatFlour;
		mass += sugar;
		mass += butter;
		mass += lemonZest;
		mass += salt;

		// assume water density
		mass += milk;
		mass += water;
		mass += lemonJuice;
		mass += oliveOil;

		// count
		mass += eggYolk * 17;
		mass += eggWhite * 33;
		mass += vanilaBeans * 2;
		return mass;
	}

}
