import java.util.ArrayList;

public class Player {

	String color;
	ArrayList<Pawn> pawns = new ArrayList<>();
	boolean isInGame;
	int pawnsInGame;

	Player(String color)
	{
		this.color=color;
		pawns.add(new Pawn(color,1));
		pawns.add(new Pawn(color,2));
		pawns.add(new Pawn(color,3));
		pawns.add(new Pawn(color,4));
		isInGame=true;
		pawnsInGame=0;
	}
}
