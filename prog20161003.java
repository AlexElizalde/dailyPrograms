import java.util.*;

public class prog20161003
{

    /*
      The finder function aims to find the factorial input value. If you input 120, it will output 6!.
      The finder function starts out as finder(i, 1, 1) where i is the number that you're looking for.
      It uses recursion to find the last number in the sequence. The sequence of numbers might multiply to equal i.
      So if i is 6, the function would go like this finder(6, 1, 1) - > finder(6, 2, 2) -> finder(6, 6, 3)
      The second argument of finder keeps track of the Total value of the sequence. The third argument keeps track of the last
      number in the sequence, which is what you want to display.
     */
    public static void finder(int numToFind, int currentNum, int lastNumInSeq)
    {
	if(numToFind == 0)
	    System.out.println(" = 1!");

	else if(currentNum < numToFind)
	{
	    //used for debugging
	    //System.out.println("numToFind: " + numToFind + "  currentNum:" + currentNum + " lastNumInSeq:" + lastNumInSeq);
	    finder(numToFind, (currentNum * (lastNumInSeq + 1)), (lastNumInSeq + 1));
	}

	else if(currentNum == numToFind)
	    System.out.println(" = " + lastNumInSeq + "!");

	else if(currentNum > numToFind)
	    System.out.println("\tNONE");
	    //System.out.println("\tNONE" + " " + currentNum + " " + lastNumInSeq);

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
