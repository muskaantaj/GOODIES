import java.util.*;

import java.util.Arrays;
import java.util.Scanner;
public class ITEM2
{
static int minimum(int arr[],int n, int k ) {
	int result= Integer.MAX_VALUE;
	Arrays.sort(arr);
	for(int i=0;i<=n-k;i++)
	{
		result=Math.min(result, arr[i+k-1]-arr[i]);
	}
	return result;
	
}
static int getting(int res,int arr[],int n, int k) {
	int result=Integer.MAX_VALUE;
	for(int i=0;i<=n;i++) {
		result=Math.min(result,arr[i+k-1]-arr[i] );
	if(res==result)
	
		return i;
	}
	
return 0;

	}
public static void main(String[] args){
	
	int arr[]= {7980,22349,2799,229900,11101,9999,2195,9800,4999};
	String items[]= {
			"fitbill plus:7980",
			"ipods:22349",
			"mi bands:999",
			"cult pass:2799",
			"macbook pro:229900",
			"digital camera:11101",
			"alexa:9999",
			"sandwich toaster:2195",
			"microwave oven:9800",
			"scale:4999"};
	int n=arr.length;
	System.out.println("enter the number of employees");
	Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
	int result = minimum(arr,n,k);
	System.out.println("number of employees:" +k);
	
	int start=getting(result,arr,n,k);
	System.out.println(" here are the input items that are selected for distribution are:");
	for(int i=start;i<start+k;i++)
		System.out.println(items[i]);
	System.out.println("and the diggerence between the chosen goodie with highest price and thelowest price is:"+result);

}
			
	
}
