package model;

public class ConnectFive extends Gra {
	
	int need = 5;
	public ConnectFive(){
		plansza = new int[6][9];
		fillZero();
	}
	public void ktoWygral(){
    	if(szuk_skos(need)== true  || szuk_poziom(need) == true) System.out.println(" Wygrales");
    	else nastepny_gracz();
    }

}
