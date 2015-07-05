package executables;

import java.util.Collection;

import model.Game;
import model.Player;

public class PayOwner implements Executable{
	
	int price;
	
	public PayOwner(int price){
		this.price = price;
	}
	
	@Override
	public Executable[] execute(Game g) {
		// TODO Auto-generated method stub
		return null;
	}
}