//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{
		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		if(atMat[r][c] == '@' && r <= 9 && c <= 9 && r>= 0 && c >= 0){		
			atCount++;
			atMat[r][c] = '-';
			if(atMat[r+1][c] == '@' && r <= 9 && c <= 9 && r>= 0 && c >= 0){
				atCount++;
				atMat[r][c] = atMat[r+1][c];
				atMat[r][c] = '-';
			}
			else if(atMat[r-1][c] == '@' && r <= 9 && c <= 9 && r>= 0 && c >= 0){
				atCount++;
				atMat[r][c] = atMat[r-1][c];
				atMat[r][c] = '-';
			}
			else if(atMat[r][c+1] == '@' && r <= 9 && c <= 9 && r>= 0 && c >= 0){
				atCount++;
				atMat[r][c] = atMat[r][c+1];
				atMat[r][c] = '-';
			}
			else if(atMat[r][c-1] == '@' && r <= 9 && c <= 9 && r>= 0 && c >= 0){
				atCount++;
				atMat[r][c] = atMat[r][c-1];
				atMat[r][c] = '-';
			}
		}
	return 0;
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output += getAtCount() + " @s connected.";
		return output;
	}
}