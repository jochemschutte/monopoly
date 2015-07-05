package model.properties;

import executables.Executable;
import executables.VisitProperty;
import model.Player;

public abstract class Property extends model.Field{

	public enum Type {Station, Utility, Street}
	
	int price;
	Player owner = null;
	
	public Property(Type type, String name, int price) {
		super(name,new Executable[0], new Executable[0]);
	}
	
	public Type getType(){
		return this.getType();
	}
	
	public int getPrice(){
		return this.price;
	}
	
	public Player getOwner(){
		return this.owner;
	}

	public void setOwner(Player owner){
		this.owner = owner;
	}

	public boolean morgage(){
		return false;
	}
	
	@Override
	public Executable[] pre(){
		Executable[] result = new Executable[1];
		result[0] = new VisitProperty();
		return result;
	}
	
	@Override
	public Executable[] post(){
		return new Executable[0];
	}
	
}