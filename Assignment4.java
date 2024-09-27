//Assignment 4: Voting Eligibility
//Write a program that checks if a person is eligible to vote. A person can vote 
//if they are a citizen and their age is 18 or above.
//Requirements:
//•Use logical && to combine conditions, and ! to negate conditions if necessary.




package module1;
import java.util.Scanner;
public class Assignment4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of the person:");
		int age=sc.nextInt();
		
		if(age >=18)
		{
			System.out.println("your are eligible");
		}
		else
		{
              System.out.println("your are not eligible");
	}

}
}