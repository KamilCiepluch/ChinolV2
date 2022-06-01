import java.util.ArrayList;

public class Player {

	String color;
	ArrayList<Pawn> pawns = new ArrayList<>();
	boolean isInGame;
	int pawnsInGame;

	Player(String color)
	{
		pawns.add(new Pawn());

	}
}
