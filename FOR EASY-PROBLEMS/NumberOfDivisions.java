class NumberOfDivisions{
	public static void main(String args[]){	
		int n=64;
		int count=0;
		while(n>1){
		n=n/2;
		count=count+1;
		}
	System.out.println("count="+count);
	}
}
	
	