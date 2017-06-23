package model;
import java.util.ArrayList;
import java.util.List;

public class Modelmain{
	
	public InterModel game = null;
	private List<Observer> observers = new ArrayList<Observer>();
	
	public Modelmain(InterModel game){
		this.game = game;
	
	}
	public void modelInsert (int j){
		game.insert(j);
		notifyAllObservers();
		nastepnyGracz();
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
	
	public void attach(Observer observer){
	      observers.add(observer);		
	 } 
	public void notifyAllObservers(){
	      for (Observer observer : observers) {
	         observer.update(getWyb(),getGracz());
	      }
	   } 
	
	public void nastepnyGracz(){
		game.nastepnyGracz();
	}
	
}
