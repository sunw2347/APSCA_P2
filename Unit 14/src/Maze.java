//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;

	public Maze()
	{
	

	}

	public Maze(int size, String line)
	{
		Scanner reader = new Scanner(line);
		maze = new int[size][size];
		for (int i=0; i<size; i++){
			for (int j=0; j<size; j++){
				int x = reader.nextInt();
				maze[i][j] = x;
			}
		}

	}

	public boolean hasExitPath(int r, int c)
	{
		
		if((r>=0 && r< maze.length) && (c>= 0 && c<maze.length) && (maze[r][c] == 1)){
			maze[r][c]=9;
			if (c==maze[0].length-1){
				return true;
			}
			else{
				 if(hasExitPath(r+1, c)) {
					 return true; 
				 }
				 if (hasExitPath(r-1, c)) {
					 return true;
				 } 
				 if (hasExitPath(r, c+1)) {
					 return true;
				 }
				 if (hasExitPath(r, c-1)) {
					 return true;
				 }
				
			}
		}

		return false;
	}

	public String toString()
	{
		String str ="";
		for (int[] row: maze){
			for (int spot :row){
				str+=spot;
			}
			str+="\n";
		}
		if (hasExitPath(0,0)){
			str+="exit found";
		}
		else{
			str+="exit not found";
		}





		return str + "\n";
	}
}