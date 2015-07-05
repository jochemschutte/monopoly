package model.properties;

public class Station extends Property implements StationInterface{

	int fee;
	
	public Station(String name, int price, int fee) {
		super(Property.Type.Station, name, price);
		this.fee = fee;
	}
	
	public int getFee(){
		return this.fee;
	}
}