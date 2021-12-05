import java.util.Scanner

public class Main{
	public static void main(String args[]){
	int a,b;
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the two numbers:");
	a = input.nextInt();
	b = input.nextInt();
	int sum = a+b;
	System.out.println("The sum of the two numbers is: " + sum);
	}
}
