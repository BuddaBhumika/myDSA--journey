import java.util.*;
	class NNumbers{
		static void Value(int n){
		if(n==0)
		return;
		Value(n-1);
		System.out.print(n+" ");
		}
	public static void main(String args[]){
		Value(5);
	}
}

		