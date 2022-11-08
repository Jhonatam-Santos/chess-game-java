package chess_game_application;
import chess_game_chess.ChessMatch;
public class Program {
	public static void main(String[] args) {
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}
}
