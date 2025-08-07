package task2;
import java.util.Scanner;
public class perfectnumber {
public static void main(String args[]) {
	int num;
	int sum=0;
	System.out.println("Enter number:");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	for (int i=1;i<=num/2;i++) {
		if(num%i==0) {
			sum+=i;
		}
	}
	if (num==sum) {
		System.out.println("Perfect number");
	}
	else {
		System.out.println("Not a perfect number");
	}
	
}
}
