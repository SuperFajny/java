package model;


public class Modelmain{
	
	public InterModel game = null;
	
	public Modelmain(InterModel game){
		this.game = game;
	
	}
	public void modelInsert (int j){
		game.insert(j);
	}
	public int getGracz(){
		return game.getGracz();
	}
	
	public boolean ktoWygral(){
		return game.ktoWygral();
	}
	public int[] getWyb(){
		return game.getWyb();
	}
	
}
