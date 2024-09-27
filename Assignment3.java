//Write a program that simulates an access control system. A person is allowed access if they have both a valid ID and a valid access card, or 
//if they are an admin.
//Requirements:
//• Use logical operators &&, ||, and !.



package module1;
import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {
	 Scanner scanner=new Scanner(System.in);
	 
	
        
        
        System.out.print("Enter your ID status (true for valid, false for invalid): ");
        boolean ValidID = scanner.nextBoolean();
        
        System.out.print("Enter your access card status (true for valid, false for invalid): ");
        boolean AccessCard = scanner.nextBoolean();
        
        System.out.print("Are you an admin? (true for yes, false for no): ");
        boolean Admin = scanner.nextBoolean();
        
    
        boolean Access = (ValidID && AccessCard) || Admin;
        
     
        if (Access) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
        
      
    }



	}


