package chess_game_chess;
import chess_game_boardgame.Board;
import chess_game_boardgame.Piece;
public class ChessPiece extends Piece {
	private Color color;
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	public Color getColor() {
		return color;
	}
}
