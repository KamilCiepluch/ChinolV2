public class Pawn {
	String color;
	int pawnID;
	boolean inBase;
	boolean inHouse;
	int currentField;
	int houseFieldID;
	boolean canEnterHouse;
	int fieldsCounter;


	Pawn(String color,int pawnID,int houseFieldID)
	{
		this.color=color;
		this.pawnID=pawnID;
		this.inBase=true;
		this.inHouse=false;
		currentField=-1;
		fieldsCounter=0;
		this.houseFieldID=houseFieldID;
	}

	void movePawn(int number)
	{
		if(!inHouse && !inBase)
		{
			currentField+= number;
			fieldsCounter+=number;

			if(number>48-1)
			{
				currentField = number-48;
				canEnterHouse = true;
			}
			if(fieldsCounter>=48 )
			{
				if(currentField >= houseFieldID)
				{
					inHouse=true;
					currentField=-1;
				}
			}
		}
	}



}

