package model;

public class ConnectFive extends Gra  implements InterModel{
	
	int need = 5;
	public ConnectFive(){
		plansza = new int[6][9];
		fillZero();
	}
	public boolean ktoWygral(){
    	if(szuk_skos(need)== true  || szuk_poziom(need) == true) return true;
    	else {
    		nastepnyGracz();
    		return false;
    	}
    }

}
