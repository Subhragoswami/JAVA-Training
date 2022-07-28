package assignment_1;
import java.util.Scanner;
public class Q3 {
	public static void main (String[] args) {
		Scanner scn=new Scanner(System.in);
		int sum = 0; 
		System.out.println("Enter lowerbound and upperbound");
		int lowerbound =scn.nextInt(); 
		double upperbound = scn.nextDouble(); 
		for (int i= lowerbound;i<= upperbound; i++) {
		sum +=i; 
		}
		double average= sum/upperbound;
		System.out.println("The sum = "+sum);
		System.out.println("The average = "+ average);
		}
}

