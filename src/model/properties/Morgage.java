package model.properties;

public class Morgage extends Decorator implements StationInterface, StreetInterface, UtilityInterface{

	public Morgage(String name, int price, Property parent) {
		super(name, price, parent);
	}

	@Override
	public int[] getPercentages() {
		return new int[0];
	}

	@Override
	public int getPercentage() {
		return 0;
	}

	@Override
	public int[] getFees() {
		return new int[0];
	}

	@Override
	public int getFee() {
		return 0;
	}
	
}