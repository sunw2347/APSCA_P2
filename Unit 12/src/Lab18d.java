//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\sunw2347\\Desktop\\Unit\\Unit12\\Unit12-2016\\Unit12-Assignments\\Lab18d\\lab18d.dat"));

		int size = file.nextInt();
		for(int i = 0; i < size; i++){
		String s = file.nextLine();
		Word1 test = new Word1(s);
		out.println(test.compareTo(rhs));
		}
		}
		
}