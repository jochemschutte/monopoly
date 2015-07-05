package model.properties;

import java.util.Arrays;

public class UtilityDecorator extends Decorator implements UtilityInterface{

	public UtilityDecorator(String name, int price, Property parent) {
		super(name, price, parent);
	}
	

	@Override
	public int[] getPercentages() {
		UtilityInterface u = (UtilityInterface)this.getParent();
		int[] result = u.getPercentages();
		if(result.length > 0){
			result = Arrays.copyOfRange(result, 1, result.length);
		}
		return result;
	}


	@Override
	public int getPercentage() {
		int[] perc = this.getPercentages();
		if(perc.length == 0){
			perc = new int[1];
			perc[0] = 0;
		}
		return perc[0];
	}
	
}