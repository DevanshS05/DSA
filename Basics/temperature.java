//This program takes input in celsius and converts it into fahrenheit
import java.util.Scanner

public class Main{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	int f,c;
	System.out.println("Please enter the temperature in celsius : ");
	c = input.nextInt();
	f = (c*(9/5)) + 32;
	System.out.println("The temperature in fahrenheit is: "+f);
	}
}
