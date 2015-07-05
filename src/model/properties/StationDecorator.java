package model.properties;

public class StationDecorator extends Decorator implements StationInterface{

	public StationDecorator(String name, int price, Property parent) {
		super(name, price, parent);
	}

	@Override
	public int getFee() {
		StationInterface s = (StationInterface)this.getParent();
		return s.getFee() * 2;
	}
	
	
	
}