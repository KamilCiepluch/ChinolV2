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
}
