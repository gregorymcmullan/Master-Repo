import java.util.Scanner;

public class Greeter
	{

		public static void greet(){
			System.out.print("Hello! What is your Name?\n:");
			Scanner userString = new Scanner(System.in);
			String name = userString.nextLine();
			System.out.println("Hello, " + name+ "! I have some advice for you!");
		}
		
		
		
	}
