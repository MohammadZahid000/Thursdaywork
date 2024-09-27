//Assignment 6: Logical NOT (!) for Negation
//Write a program that determines whether a number is not between 10 and 20 (inclusive).
//Requirements:
//•Use logical ! to negate conditions.
package module1;
import java.util.Scanner;
public class Assignment6 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = scanner.nextInt();
		  boolean isNotInRange = !(number >= 10 && number <= 20);
		        
		        if (isNotInRange) {
		            System.out.println("The number is not between 10 and 20.");
		        } else {
		            System.out.println("The number is between 10 and 20.");
		        }
		        
		    
		    }

	

	}


