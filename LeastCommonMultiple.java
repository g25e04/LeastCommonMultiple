import java.util.Scanner;

public class LeastCommonMultiple {

	public LeastCommonMultiple() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please imput positive integer to calculation least common multiple");
		System.out.println("Enter first number.");
		int num1 = sc.nextInt();
		System.out.println("Enter second number.");
		int num2 = sc.nextInt();
		Detect D1 = new Detect(num1,num2);
		System.out.println(D1.toString());
		Calculation C1 = new Calculation(num1,num2);
		System.out.println(C1.toString());
	}

}
