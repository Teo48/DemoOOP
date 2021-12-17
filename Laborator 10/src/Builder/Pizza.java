package Builder;

public class Pizza {
	private String pizzaSize;
	private String crust;
	private int cheeseCount;
	private int pepperoniCount;
	private int hamCount;
	private int mushroomsCount;

	public static class Builder {
		private String pizzaSize; // mandatory
		private String crust; // mandatory
		private int cheeseCount = 0; // optional
		private int pepperoniCount = 0; // optional
		private int hamCount = 0; // optional
		private int mushroomsCount = 0; // optional

		public Builder(String pizzaSize, String crust) {
			this.pizzaSize = pizzaSize;
			this.crust = crust;
		}

		public Builder cheeseCount(int cheeseCount) {
			this.cheeseCount = cheeseCount;
			return this;
		}

		public Builder pepperoniCount(int pepperoniCount) {
			this.pepperoniCount = pepperoniCount;
			return this;
		}

		public Builder hamCount(int hamCount) {
			this.hamCount = hamCount;
			return this;
		}

		public Builder mushroomsCount(int mushroomsCount) {
			this.mushroomsCount = mushroomsCount;
			return this;
		}

		public Pizza build() {
			return new Pizza(this);
		}
	}

	private Pizza(Builder builder) {
		this.pizzaSize = builder.pizzaSize;
		this.crust = builder.crust;
		this.cheeseCount = builder.cheeseCount;
		this.pepperoniCount = builder.pepperoniCount;
		this.hamCount = builder.hamCount;
		this.mushroomsCount = builder.mushroomsCount;
	}

	@Override
	public String toString() {
		return "Pizza{" +
				"pizzaSize='" + pizzaSize + '\'' +
				", crust='" + crust + '\'' +
				", cheeseCount=" + cheeseCount +
				", pepperoniCount=" + pepperoniCount +
				", hamCount=" + hamCount +
				", mushroomsCount=" + mushroomsCount +
				'}';
	}
}

