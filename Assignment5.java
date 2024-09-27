//Job Application
//Write a program that checks if a person is eligible for a job based 
//on their qualifications. A person is eligible if they have a bachelor’s 
//degree or equivalent experience, and they have a clean criminal record.
//Requirements:
//•Use logical operators to combine conditions.
package module1;
import java.util.Scanner;
public class Assignment5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Do you have a bachelor's degree or equivalent experience?:");
		boolean DegreeOrExperience = sc.nextBoolean();
		        
		System.out.print("Do you have a clean criminal record ");
		boolean CleanRecord = sc.nextBoolean();
		        
		 boolean isEligible = (DegreeOrExperience) && (CleanRecord);
		        if (isEligible) {
		            System.out.println("Eligible for the job.");
		        } else {
		            System.out.println("Not eligible for the job.");
		        }
		        
		       
		    }
		

		

	}


