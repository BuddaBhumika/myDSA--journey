class PalindromeRecurssive{
	static boolean palindrome(String S,int left,int right){
		if(left>=right)
		return true;
		if(S.charAt(left) !=S.charAt(right))
		return false;
		return palindrome(S,(left)+1,(right)-1);
}
	public static void main(String args[]){
		 String S = "madam";
		System.out.println(palindrome(S,0,S.length()-1));
		}
	}



