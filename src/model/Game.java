package model;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Game{
	
	private Player[] players;
	private int index = 0;
	private Board board;
	private List<Card> cc;
	private List<Card> chance;
	
	public Game(Player[] players, Board b, List<Card> cc, List<Card> chance){
		this.players = players;
		this.board = b;
		this.cc = this.shuffle(cc);
		this.chance = this.shuffle(chance);
	}
	
	public Player[] getPlayers(){
		return this.players;
	}

	public Player getCurrentPlayer(){
		return this.players[this.index];
	}

	public Board getBoard(){
		return this.board;
	}

	public Card getCommunityChest(){
		Card result = this.cc.remove(0);
		this.cc.add(result);
		return result;
	}

	public Card getChance(){
		Card result = this.chance.remove(0);
		this.chance.add(result);
		return result;
	}
	
	public List<Card> shuffle(List<Card> in){
		List<Card> result = new ArrayList<Card>();
		while(in.size() > 0){
			int i = (int)(Math.random()*in.size());
			result.add(in.remove(i));
		}
		return result;
	}


	
}