package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	//cria��o de uma pe�a
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}	

}
