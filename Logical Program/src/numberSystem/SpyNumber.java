package numberSystem;

public class SpyNumber {

	public static void main(String[] args) {
int n=345,sum=0,pro=1;
while(n!=0) {
	sum+=n%10;
	pro*=n%10;
	n=n/10;
}
if(sum==pro) {
	System.out.println("Spy Number");
}
else
	System.out.println("Not Spy Number");
	
	}

}
