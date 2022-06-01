import java.util.ArrayList;

public class Player {

	String color;
	ArrayList<Pawn> pawns = new ArrayList<>();
	boolean isInGame;
	int pawnsInGame;

	Player(String color,int houseFieldID)
	{
		this.color=color;
		pawns.add(new Pawn(color,1,houseFieldID));
		pawns.add(new Pawn(color,2,houseFieldID));
		pawns.add(new Pawn(color,3,houseFieldID));
		pawns.add(new Pawn(color,4,houseFieldID));
		isInGame=true;
		pawnsInGame=0;
	}
}
