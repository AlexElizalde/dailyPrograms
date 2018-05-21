import java.util.*;

public class prog20161003
{

    public static void finder(int numToFind, int currentNum)
    {
	if(numToFind == 0)
	    System.out.println(" = 1!");

	else if(currentNum < numToFind)
	    finder(numToFind, (currentNum * (currentNum + 1)));

	else if(currentNum == numToFind)
	    System.out.println(" = " + currentNum + "!");

	else if(currentNum > numToFind)
	    System.out.println("\tNONE");

	else
	    System.out.println("error! something screwed up!");
    }
    
    
    public static void main(String [] args)
    {
	Scanner keyboard = new Scanner(System.in);
	String  input    = keyboard.nextLine();
	
	//scan input numbers until the user just presses the enter key without
	//an input number
	while(!(input.equals("")))
	{
	    
	    finder( Integer.parseInt(input), 1);

	    input = keyboard.nextLine();
	}
    }
}
