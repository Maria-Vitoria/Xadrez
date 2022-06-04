package application;

import chess.ChessPiece;

public class UI {

	//nesse metodo � criada a visualiza��o do tabuleiro
	public static void printBoard(ChessPiece[][] pieces) {
		for (int i = 0; i < pieces.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}

	//aqui � feita a valida��o se possui pe�a ou n�o na posi��o, se tiver ele mostra, caso contr�rio mostra somente o -
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		} else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
