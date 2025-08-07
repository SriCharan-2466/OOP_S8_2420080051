package task2;
import java.util.*;
public class sumofdigits {
	public static void main(String args[]) {
		int num;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextInt();
		while(num!=0) {
			sum+=num%10;
			num=num/10;
		}
		System.out.println("sum of digits:"+sum);
		
	}
}
