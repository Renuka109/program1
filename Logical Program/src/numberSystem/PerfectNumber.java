package numberSystem;

public class PerfectNumber {

	public static void main(String[] args) {
 // A number whose sum of factors except that no. is equal to given no .
		int n=6,sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		if(n==sum) {
			System.out.println("perfect no");
		}
		else
			System.out.println("not a perfect no");
	
	}

}
