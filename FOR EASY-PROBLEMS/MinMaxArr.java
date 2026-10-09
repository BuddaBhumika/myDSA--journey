import java.util.*;
public class MinMaxArr{
	public static void main(String args[]){
		System.out.print("enter number of elements in array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		System.out.print("enter elements of array:");
		for(int i=0;i<n;i++){
			 a[i]=sc.nextInt();
		}
		int min=a[0];
		int max=a[0];
		for(int i=1;i<n;i++){
		if(a[i]<min){
			min=a[i];
			}
		if(a[i]>max){
			max=a[i];
}
}
		System.out.println("min="+min);
		System.out.print("max="+max);
		}
	}

