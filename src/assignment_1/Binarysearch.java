package assignment_1;

public class Binarysearch {
public static void main(String[] args) {
	int[] arr= {3,4,6,8,10,14};
	System.out.println(Search(arr,8));
}
static int Search(int[] a,int s){
	int start=0,end=a.length-1;
	while(start<=end) {
	int mid =(start+end)/2;
	if(s==a[mid]) return mid;
	else if(s<a[mid]) end=mid-1;
	else start=mid+1;
	}
	return -1;
}
}
