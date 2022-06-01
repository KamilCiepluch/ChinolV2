import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
	//Gra start
	public static void main(String[] args) {
		/*
		Board board=new Board();
		board.boardInitialize();
		List<Player> playerList=new ArrayList<>();
		System.out.println("Podaj liczbe graczy: ");
		Scanner scanner = new Scanner(System.in);
		int wybor=scanner.nextInt();
		if(wybor<2 || wybor>4)
			System.out.println("Zły wybór");
		playerList.add(new Player("red",0));
		playerList.add(new Player("yellow",12));
		if(wybor>2)
			playerList.add(new Player("blue",24));
		if(wybor>3)
			playerList.add(new Player("green",36));

		 */
		Board board=new Board();
		board.boardInitialize();
		List<Player> playerList=new ArrayList<>();
		playerList.add(new Player("red",0));
		playerList.get(0).pawns.get(0).movePawn(1);
		playerList.get(0).pawns.get(0).movePawn(22);
		playerList.get(0).pawns.get(0).movePawn(24);
		playerList.get(0).pawns.get(0).movePawn(1);
		playerList.get(0).pawns.get(0).movePawn(1);
		playerList.get(0).pawns.get(0).movePawn(1);
		playerList.get(0).pawns.get(0).movePawn(1);


	}

}
