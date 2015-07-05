package model;

import java.util.Collection;
import java.util.ArrayList;

import old.model.properties.Property;



public class Player implements FinancialEntity,Comparable<Player>{

	int index;
	String name;
	int money;
	Collection<Property> properties = new ArrayList<Property>();
	Collection<Pardon> pardons = new ArrayList<Pardon>();
	
	public Player(int index, String name, int money){
		this.index = index;
		this.name = name;
		this.money = money;
	}

	public int getIndex(){
		return this.index;
	}

	public String getName(){
		return this.name;
	}

	public int getMoney(){
		return this.money;
	}

	public void payMoney(int amount){
		//TODO implement
	}
	
	public Collection<Property> getProperties(){
		return this.properties;
	}

	public Collection<Pardon> getPardons(){
		return this.pardons;
	}
	
	@Override
	public int compareTo(Player arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}