package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //Forced 
	}

	protected Board getBoard() { //Access only to package and subclasses
		return board;
	} 
	//Set will not be used so that the board is not changed
	
	
}
