import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

	List<Player> playerList=new ArrayList<>();
	void initializePlayers()
	{

	}
	public static void main(String[] args) {
		Board board=new Board();
		board.boardInitialize();
		System.out.println("Podaj liczbe graczy: ");
		Scanner scanner = new Scanner(System.in);
		int wybor=scanner.nextInt();
		if(wybor<2 || wybor>4)
			System.out.println("Zły wybór");

	}
}
