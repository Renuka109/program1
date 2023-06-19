package numberSystem;

class StrongNumber {
	public static void main(String[] args) {

//sum of factorial of each digit is equal to given number
		int n=145 ,n1=n,sum=0;
		while(n!=0) {
			int rem=n%10; int fact=1;
			for(int i=1;i<=rem;i++) {
				 fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==n1) {
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Not a String Number");
		}
	}
}
