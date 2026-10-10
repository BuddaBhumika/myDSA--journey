//printing number from n to 1
import java.util.*;
public class NRev{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter a number:");
	int num=sc.nextInt();
	for(int i=num;i>=0;i--){
		System.out.println(i);
	}
}
}