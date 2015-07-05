package model.properties;

public class Street extends Property implements StreetInterface{
	
	private int[] fees;
	
	public Street(String name, int price, int[] fees){
		super(Property.Type.Street, name, price);
		this.fees = fees;
	}

	@Override
	public int[] getFees() {
		return this.fees;
	}

	@Override
	public int getFee() {
		return this.getFees()[0];
	}
	
	
}