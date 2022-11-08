package chess_game_application;
import chess_game_chess.ChessPiece;
public class UI {
	public static void printBoard(ChessPiece pieces[][]) {
		
	}
	private static void printPeace(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		} else {
			System.out.print(piece);
		}
		System.out.println(" ");
	}
}
