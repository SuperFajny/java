
public class Start {

	public static void main(String[] args) {
		ConnectFive game = new ConnectFive();
		game.fillZero();
		game.insert(0);
		game.ktoWygral();
		game.insert(1);
		game.ktoWygral();
		game.insert(2);
		game.ktoWygral();
		game.insert(3);
		game.ktoWygral();
		game.insert(4);
		game.display();
		game.ktoWygral();
		

	}

}
