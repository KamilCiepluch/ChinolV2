import java.util.ArrayList;
import java.util.Random;

public class Player {

	String color;
	ArrayList<Pawn> pawns = new ArrayList<>();
	boolean isInGame;
	int pawnsInGame;
	int pawnsInHouse;

	int rollDice()
	{
		Random random = new Random();
		return random.nextInt(7-1)+1;
	}


	Player(String color,int houseFieldID)
	{
		this.color=color;
		pawns.add(new Pawn(color,0,houseFieldID));
		pawns.add(new Pawn(color,1,houseFieldID));
		pawns.add(new Pawn(color,2,houseFieldID));
		pawns.add(new Pawn(color,3,houseFieldID));
		isInGame=true;
		pawnsInGame=0;
	}

	void playerTurn()
	{
		// czy są pionki w grze
		if(pawnsInGame!=0)
		{
			if(pawnsInHouse==4) return;
			else
			{
				int dice1 = rollDice();

				//Todo select pawn
				int pawnID = 0;

				//
				pawns.get(pawnID).movePawn(dice1);
			}
		}
	}
}
