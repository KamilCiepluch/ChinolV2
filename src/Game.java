import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Board board=new Board();
		board.boardInitialize();
		List<Player> playerList=new ArrayList<>();
		System.out.println("Podaj liczbe graczy: ");
		Scanner scanner = new Scanner(System.in);
		int wybor=scanner.nextInt();
		if(wybor<2 || wybor>4)
			System.out.println("Zły wybór");
		playerList.add(new Player("red"));
		playerList.add(new Player("yellow"));
		if(wybor>2)
			playerList.add(new Player("green"));
		if(wybor>3)
			playerList.add(new Player("blue"));
	}
}
