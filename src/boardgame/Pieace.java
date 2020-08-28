package boardgame;

public class Pieace {
	
	protected Position position;
	private Board board;
	public Pieace(Board board) {
		this.board = board;
		position = null;
	}
	protected Board getBoard() {
		return board;
	}
}