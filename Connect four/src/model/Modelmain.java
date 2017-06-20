package model;

import java.util.ArrayList;
import java.util.List;

public class Modelmain{
	int wyb = 4;
	public Modelmain(int choose)
	{
		this.wyb=choose;
		if(wyb == 5){
			ConnectFive game = new ConnectFive(); 
		}
		else if(wyb == 4){
			ConnectFour game = new ConnectFour(); 
		}
	}
}
