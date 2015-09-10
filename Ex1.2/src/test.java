import java.util.Scanner;
public class test {
	public static void main(String[]args){
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter your usename ");
	String user = keyboard.nextLine();
	System.out.println("Enter your password ");
	String pass = keyboard.nextLine();
	int num = pass.length();
	String xes = "X";
	while ( xes.length() != num ){
		xes = "X" + xes;
	}
	System.out.print("Hello, "+user+"! Welcome to CSC 200! Your password is "+xes);
	keyboard.close();
	}
}