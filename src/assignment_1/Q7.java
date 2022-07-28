package assignment_1;
import java.util.Scanner;
public class Q7 {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int num=scn.nextInt();
	
	for(int i=1;i<num;i++){
		for(int j=1;j<=num;j++)
		{	if(i%2==0)
			System.out.print("#"+" ");
		else {
			System.out.print(" "+"#");
		}
		}
		System.out.println();
	}
}
}
