package chapter1;

public class TicTacToe {
	private int[][] board;
	private int player;
	private int state;

	public TicTacToe() {
		board = new int[3][3];
		player = 1;
		state = 0;
	}

	public boolean putMove(int row, int collumn) {
		if (row > 2 || row < 0 || collumn > 2 || collumn < 0) {
			return false;
		}

		if (board[row][collumn] != 0) {
			return false;
		}

		board[row][collumn] = player;

		checkWinner();
		if (player == 1) {
			player = 2;
		}
		else {
			player = 1;
		}
		return true;
	}

	private void checkWinner() {
		boolean[] wins = new boolean[8];
		if (board[0][0] != player) {
			wins[0] = true;
			wins[3] = true;
			wins[6] = true;
		}
		if(board[0][1] != player){
			wins[0] = true;
			wins[4] = true;
		}
		if(board[0][2] != player){
			wins[0] = true;
			wins[5] = true;
		}
		if(board[1][0] != player){
			wins[1] = true;
			wins[3] = true;
		}
		if (board[1][1] != player) {
			wins[1] = true;
			wins[4] = true;
			wins[6] = true;
			wins[7] = true;
		}
		if(board[1][2] != player){
			wins[1] = true;
			wins[5] = true;
		}
		if(board[2][0] != player){
			wins[2] = true;
			wins[3] = true;
		}
		if(board[2][1] != player){
			wins[2] = true;
			wins[4] = true;
		}
		if (board[2][2] != player) {
			wins[2] = true;
			wins[5] = true;
			wins[6] = true;
		}
		for(boolean x: wins){
			if(!x){
				state = player;
			}
		}
	}

	public int getState() {
		return state;
	}

	public int getPlayer(){
		return player;
	}
	
	public String toString() {
		return board[0][0] + " " + board[0][1] + " " + board[0][2] + "\n" + board[1][0] + " " + board[1][1] + " "
				+ board[1][2] + "\n" + board[2][0] + " " + board[2][1] + " " + board[2][2];
	}

}
