public class Pawn {
	String color;
	int pawnID;
	boolean inBase;
	boolean inHouse;
	int currentField;
	int houseFieldID;
	Pawn(String color,int pawnID,int houseFieldID)
	{
		this.color=color;
		this.pawnID=pawnID;
		this.inBase=true;
		this.inHouse=false;
		currentField=-1;
		this.houseFieldID=houseFieldID;
	}



	void movePawn(int number)
	{
		if(number<0) return;
		currentField+= number;
		if(number>48-1) number = number-48;

	}
}

