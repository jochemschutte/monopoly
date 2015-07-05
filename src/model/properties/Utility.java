package model.properties;

public class Utility extends Property implements UtilityInterface{

	int[] percentages;
	
	public Utility(String name, int price, int[] percentages) {
		super(Property.Type.Utility, name, price);
		this.percentages = percentages;
	}

	@Override
	public int[] getPercentages() {
		return this.percentages;
	}

	@Override
	public int getPercentage() {
		return this.getPercentages()[0];
	}
	
}