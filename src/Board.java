import java.util.ArrayList;

public class Board {

	ArrayList<Field> board = new ArrayList<>();







	public void boardInitialize()
	{
		int planasza_size = 48;
		for(int i=0; i<planasza_size; i++)
		{
			board.add(new Field(i));
		}

		board.get(0).setStart("red");
		board.get(12).setStart("yellow");
		board.get(24).setStart( "blue");
		board.get(36).setStart( "green");
	}

	public static void main(String[] args) {
		Board board  = new Board();
		board.boardInitialize();
		int x;
		System.out.println("Xd");
	}

}
