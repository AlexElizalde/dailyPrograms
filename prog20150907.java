import java.util.*;

//DOESNT WORK RIGHT NOW
public class prog20150907 {

    public static boolean areCellsXOR(String [] array, int firstNum, int secondNum) {

	//checks if there's a zero in one index and a one in the other index.
	//also the X symbol corresponds to 1 and a blank space corresponds to 0
	if(    ( array[firstNum].equals("0") && array[secondNum].equals("1")  )
	       || ( array[firstNum].equals(" ") && array[secondNum].equals("X")  )    )//end of if
	    return true;
	else if(   ( array[firstNum].equals("1") && array[secondNum].equals("0") )
		   || ( array[firstNum].equals("X") && array[secondNum].equals(" ") )   )//end of if
	    return true;
	else
	    return false;
    }

    //firstIndexVal and lastIndexVal are from the previous array
    public static String[]  traverseArray(int length, String []  array, String firstIndexVal, String lastIndexVal) {
	String[] resultArray = new String[100];

	for(int i = 0; i < length; i++) {
	    //i is at the beginning of array
	    if(i == 0) {
		//don't do anything just use the value from index 0 in array
		if(firstIndexVal.equals("1") || firstIndexVal.equals("X"))
		    resultArray[0] = "X";
		else
		    resultArray[0] = " ";
	    }
	    //i is at the end of array
	    else if(i == (length - 1)) {
		//System.out.println("elseif-" + i + "-" + array[length - 1]);
		if( lastIndexVal.equals("1") || lastIndexVal.equals("X") ) 
		    resultArray[length - 1] = "X";
		else
		    resultArray[length - 1] = " ";
	    }
	    //i is at neither ends of the array. 
	    else {
		if( areCellsXOR(array, (i - 1), (i + 1) ) )
		    resultArray[i] = "X";
		else
		    resultArray[i] = " ";
			
	    }
	}

	return resultArray;
    }

    
    public static void main(String [] args) {
	String[] inputArray = new String[100];
	String[] finalArray = new String[100];
	Scanner keyboard = new Scanner(System.in);
	String inputString;
	int inputLength = 0;
	
	System.out.print("--->");
	inputString = keyboard.nextLine();
	inputLength = inputString.length();



	
	for(int i = 0; i < inputLength; i++) {
	    inputArray[i] = inputString.substring(i, i + 1);
	}



	for( int k = 0; k < 1; k++) {

	    if(k == 0)
		finalArray = traverseArray(inputLength, inputArray, inputArray[0], inputArray[inputLength - 1]);
	    else
		finalArray = traverseArray(inputLength, finalArray, finalArray[0], finalArray[inputLength - 1]);
	    
	    for( int i = 0; i < inputLength; i++) {
		System.out.print(finalArray[i]);
	    }

	    System.out.println();
	}
       

	
	
    }
}
