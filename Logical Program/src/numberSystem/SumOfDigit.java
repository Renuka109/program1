package numberSystem;

public class SumOfDigit {

	public static void main(String[] args) {
 int n=123,sum=0,pro=1;
 while(n!=0) {
	 sum+=n%10;
	 pro*=n%10;
	 n=n/10;
 }
 System.out.println(pro);
 System.out.println(sum);
	}

}
