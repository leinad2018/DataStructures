package chapter1;

import java.util.Scanner;

public class TTTApp {

	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		Scanner input = new Scanner(System.in);
		boolean end = false;
		do {
			System.out.println("Player: " + game.getPlayer() + " enter coordinates for your move.");
			System.out.println(game);
			if ( !game.putMove(input.nextInt(), input.nextInt())) {
				System.err.println("Invalid Move");
			}

			if (game.getState() != 0) {
				if (game.getState() == 3) {
					System.out.println("Tie game");
				}
				else
					System.out.println("Player: " + game.getState() + " wins.");
				end = true;
			}
		} while ( !end);
	}
}
