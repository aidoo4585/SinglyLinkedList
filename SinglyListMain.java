import java.util.Scanner;

public class SinglyListMain {
    Scanner input = new Scanner(System.in);
    String values;
    int number = 0;

    System.out.println("Hello, welcome to the List app..."+
            "\nPlease specifcy how many values you would like to input: ");
    number=input.nextInt();

    SinglyLinkedList<String> charDigitList = new SinglyLinkedList();

	    	for(
    int i = 0;
    i<number;i++)

    {
        System.out.println("\nEnter the character/digit values: ");     //Prompting the user to enter values
        System.out.println("Value " + (i + 1) + ": ");
        values = input.next();

        if (checkIfDigit(values) == true) { //Adding the values to the list and grouping them
            charDigitList.addFirst(values);
        } else {
            charDigitList.addLast(values);
        }
    }
	       charDigitList.printList();

    public static boolean checkIfDigit(String d) {
        //Checking if it is a digit by returning true if parsing can occur
        try {
            Integer.parseInt(d);
            return true;
        }
        catch(NumberFormatException k) {
            return false;
        }
    }
}

