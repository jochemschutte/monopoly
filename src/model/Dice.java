package model;

public class Dice{
	
	private int eyes = -1;
	
	public Dice(){}
	
	public void rethrow(){
		this.eyes = (int)(Math.random()*6+1);
	}
	
	public int getEyes(){
		return eyes;
	}
	
}