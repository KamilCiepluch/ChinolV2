public class Pawn {
	String color;
	int pawnID;
	boolean inBase;
	boolean inHouse;
	Pawn(String color,int pawnID)
	{
		this.color=color;
		this.pawnID=pawnID;
		this.inBase=true;
		this.inHouse=false;
	}
	int currentField;
	int houseFieldID;


	void movePawn(int number)
	{
		if(number<0) return;
		currentField+= number;
		if(number>48-1) number = number-48;

	}
}

