package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.println("Source: ");
				ChessPosition source = UI.readChessPosiiton(sc);
				
				System.out.println();
				System.out.println("Target: ");
				ChessPosition target = UI.readChessPosiiton(sc);
				
				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			}
			catch (ChessException e) {
				System.out.println(e.getMessage() + "\n*Press enter and try something valid*");
				sc.nextLine();
			}
			catch (InputMismatchException e) {
				System.out.println(e.getMessage() + "\n*Press enter and try something valid*");
				sc.nextLine();
			}
		}
	}

}
