package assignment_1;
import java.util.Scanner;
public class Selectionsort {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter size of array");
	int size=scn.nextInt();
	int[] arr=new int[size];
	System.out.println("array before sorting");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scn.nextInt();
	}
	sort(arr);
	System.out.println("Array after sorting");
	for(int i:arr){
		System.out.println(i);
	}
}	
public static void sort(int[] k){
	for(int i=0;i<k.length;i++) {
	int ref=i;
	for(int j=i+1;j<k.length;j++) {
		if(k[ref]>k[j]) {
			ref=j;
		}
	}
	if(ref!=i) {
		int temp=k[ref];
		k[ref]=k[i];
		k[i]=temp;
	}
	}
}
}


