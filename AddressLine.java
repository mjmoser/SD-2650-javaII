import java.util.Scanner;

public class AddressLine { 
	public static void main(String[] args) {
		String name;
		int age; 
		String top = "========================================";
		Scanner kb = new Scanner(System.in);
	
		System.out.println("What is your name?");
		name = kb.next();
		
		System.out.println("What is your age?");
		age = kb.nextInt();
		
		System.out.println(top);
		System.out.println("Wow " + name + ", you are really old!");
	}
}