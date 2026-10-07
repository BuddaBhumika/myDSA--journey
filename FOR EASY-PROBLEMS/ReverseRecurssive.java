class ReverseRecurssive{
	static int reverse(int n, int rev){
		if(n==0)
			return rev;
		return reverse(n/10,rev*10+n%10);
		}
	public static void main(String args[]){
		System.out.print(reverse(1234,0));
	}
}