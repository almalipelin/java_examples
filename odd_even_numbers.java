package javaDers2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("Enter a number: ");
		a = input.nextInt();
		
		if(a%2==0) {
			System.out.println("Number is even.");
		}
		else {
			System.out.println("Number is odd.");
		}
	}

}
