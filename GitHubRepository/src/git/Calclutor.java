package git;

import java.util.Scanner;

public class Calclutor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to my calclutor");
		System.out.println("Enter your number");
		int first_num = sc.nextInt();
		System.out.println("Enter your number");
		int second_num = sc.nextInt();
		
		System.out.println("The sum is " + first_num+second_num);
		sc.close();
	}

}
