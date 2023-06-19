package numberSystem;

public class ArmstrongNumber {

	public static void main(String[] args) {
//sum of power of each digit is equal to given number
		int n=153,n1=n,c=0,n2=n;
		while(n!=0) {
			n=n/10;
			c++;
		} 
		int sum=0;
		while(n1!=0) {
			int rem=n1%10;
		   int pow=1;
		for(int i=1;i<=c;i++) {
			pow=pow*rem;
		}
		sum=sum+pow;
		n1=n1/10;	
		}
		System.out.println(sum);
		
		if(sum==n2)
		
		System.out.println("Armstrong Number");
		else
			System.out.println("Not a Armstrong no");
	}

}
