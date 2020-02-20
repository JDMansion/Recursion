import java.util.Scanner;
public class CalculatePower {

	public static int power(int x, int n) {	
        if(n == 0) {
            return 1;
        }
        return x * power(x,n-1);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int pow = s.nextInt();
		System.out.println(power(num, pow));
		
	}

}
