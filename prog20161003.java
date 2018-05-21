import java.util.*;

public class prog20161003
{

    public static void finder(int numToFind, int currentNum, int lastNumInSeq)
    {
	if(numToFind == 0)
	    System.out.println(" = 1!");

	else if(currentNum < numToFind) {
	    System.out.println("numToFind: " + numToFind + "  currentNum:" + currentNum
			       + " lastNumInSeq:" + lastNumInSeq);
	    finder(numToFind, (currentNum * (lastNumInSeq + 1)), (lastNumInSeq + 1));   }

	else if(currentNum == numToFind)
	    System.out.println(" = " + lastNumInSeq + "!");

	else if(currentNum > numToFind)
	    System.out.println("\tNONE" + " " + currentNum + " " + lastNumInSeq);

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
	    
	    finder( Integer.parseInt(input), 1, 1);

	    input = keyboard.nextLine();
	}
    }
}
