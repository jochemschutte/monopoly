package model.properties;

import java.util.Arrays;

public class StreetDecorator extends Decorator implements StreetInterface{

	public StreetDecorator(String name, int price, Property parent) {
		super(name, price, parent);
	}
	

	@Override
	public int[] getFees() {
		StreetInterface s = (StreetInterface)this.getParent();
		int[] result = s.getFees();
		if(result.length > 0){
			result = Arrays.copyOfRange(result, 1, result.length);
		}
		return result;
	}
	
	@Override
	public int getFee(){
		int[] perc = this.getFees();
		if(perc.length == 0){
			perc = new int[1];
			perc[0] = 0;
		}
		return perc[0];
	}

}