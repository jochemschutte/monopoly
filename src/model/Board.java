package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import executables.Executable;

public class Board{
	
	ArrayList<Field> fields;
	Map<Player, Integer> positions;
	
	public Board(ArrayList<Field> fields, Collection<Player> players){
		this.fields = fields;
		positions = new TreeMap<Player, Integer>();
		for(Player p : players){
			positions.put(p, 0);
		}
	}
	
	public ArrayList<Field> getFields(){
		return this.fields;
	}

	public void setFields(ArrayList<Field> fields){
		this.fields = fields;
	}

	public Map<Player,Integer> getPositions(){
		return this.positions;
	}
	
	public int getPosition(Player p){
		return positions.get(p);
	}
	
	public Field getField(int fieldnr){
		return this.fields.get(fieldnr);
	}
	
	public Executable[] move(Player p, int amount){
		//TODO implement;
		return null;
	}
	
	public Collection<Player> getPlayersOnField(Field f){
		int i = fields.indexOf(f);
		Set<Player> result = new TreeSet<Player>();
		for(Player p : positions.keySet()){
			if(positions.get(p) == i){
				result.add(p);
			}
		}
		return result;
	}


	
}