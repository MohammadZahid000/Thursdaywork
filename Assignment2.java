package module5;
import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
	

		
		        Scanner scanner = new Scanner(System.in);

		     
		        System.out.print("Enter the score for Subject 1: ");
		        int score1 = scanner.nextInt();

		        System.out.print("Enter the score for Subject 2: ");
		        int score2 = scanner.nextInt();

		        System.out.print("Enter the score for Subject 3: ");
		        int score3 = scanner.nextInt();

		        int averageScore = (score1 + score2 + score3) / 3;

		      
		        boolean passes = averageScore >= 60 && score1 >= 40 && score2 >= 40 && score3 >= 40;

		      
		        if (passes) {
		            System.out.println("The student passes the exam.");
		        } else {
		            System.out.println("The student does not pass the exam.");
		        }

		      
		    }
		


	}


