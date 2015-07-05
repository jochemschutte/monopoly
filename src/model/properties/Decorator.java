package model.properties;

import model.Player;
import executables.Executable;

public abstract class Decorator extends Property{

	private Property parent;
	
	public Decorator(String name, int price, Property parent) {
		super(parent.getType(), name, price);
		this.parent = parent;
	}
	
	public Property.Type getType(){
		return this.getParent().getType();
	}
	
	public Property getParent(){
		return this.parent;
	}
	
	@Override
	public String getName(){
		return this.getParent().getName();
	}
	
	@Override
	public int getPrice(){
		return this.getParent().getPrice();
	}
	
	@Override
	public Player getOwner(){
		return this.getParent().getOwner();
	}
	
	@SuppressWarnings("rawtypes")
	public Property remove(java.lang.Class c){
		Property result = this;
		if(this.getClass() == c){
			result = this.getParent();
		}
		return result;
	}
	
	@Override
	public boolean morgage(){
		return this.getParent().morgage();
	}
}