import java.util.*;
public class DivideByTwo{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int n=sc.nextInt();
	int count=0;
	while(n>1){
	n= n/2;
	count++;
}
	System.out.println("number of time this number is divided by 2 is:"+count);
}
}
	