package model;

import executables.Executable;

public class Field{
	
	private Executable[] pre;
	private Executable[] post;
	private String name;

	public Field(String name, Executable[] pre, Executable[] post){
		this.name = name;
		this.pre = pre;
		this.post = post;
	}
	
	public String getName(){
		return this.name;
	}

	public Executable[] pre(){
		return this.pre;
	}
	
	public Executable[] post(){
		return this.post;
	}
	
}