public class Field {
	int fieldID;
	boolean startYellow;
	boolean startGreen;
	boolean startBlue;
	boolean startRed;



	void setStart(String color)
	{
		switch (color) {
			case "yellow" -> startYellow = true;
			case "red" -> startRed = true;
			case "blue" -> startBlue = true;
			case "green" -> startGreen = true;
		}
	}


	Field(int id)
	{
		fieldID = id;
		startGreen = false;
		startBlue = false;
		startYellow = false;
		startRed  =false;
	}
}
