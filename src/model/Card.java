package model;

import executables.Executable;

public class Card{
	
	public enum Type {CHANCE, CC}
	
	String text;
	Executable executable;
	Type type;
	
	public Card(String text, Executable executable, Type type){
		this.text = text;
		this.executable = executable;
		this.type = type;
	}
	
	public String getText(){
		return this.text;
	}

	public Executable getExecutable(){
		return this.executable;
	}

	public Type getType(){
		return this.type;
	}
}