//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[3][3];

	}

	public TicTacToe(String game)
	{
		int x = 0;
		mat = new char[3][3];
		for(int i = 0; i <3; i++){
			for(int j = 0; j < 3; j++){
				mat[i][j] = game.charAt(x);
				x++;
			}
		}



	}

	public String getWinner()
	{
		String str = "";
		for(int i = 0; i<3; i++){
			if((mat[i][0] == mat[i][1]) && (mat[i][1] == mat[i][2])){
				str += mat[i][1] + " HORIZONAL DUB";
			}
		}
		for(int i = 0; i<3; i++){
			if((mat[0][i] == mat[1][i]) && (mat[1][i] == mat[2][i])){
				str += mat[1][i] + " VERTICAL DUB";
			}
		}
		if(((mat[0][0] == mat[1][1])&&(mat[1][1] == mat[2][2]))||((mat[2][0] == mat[1][1])&&(mat[1][1]) == mat[0][2])){
			str += mat[1][1] + " DIAGONAL DUB";
		}
		if(str.equals("")){
			str += ("UNLUCKY");
		}

		return str;
	}

	public String toString()
	{
		String str = "";
		for(char[] row:mat){
			for(char letter:row){
				str += letter;
			}
			str += "\n";
		}
		str += getWinner();




		return str + "\n";
	}
}