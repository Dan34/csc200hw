import java.util.Scanner;
public class SemanticError {
	public static void main(String[]args){
		int height = 0, width = 0, depth = 0;
		String[] box = new String[3];
		Scanner keyboard = new Scanner(System.in);
//		System.out.println("Current dimensions are "+width+ " " +height+" "+depth+".");
		System.out.println("Input the desired dimesions of a box in order of height, width, and depth.");
		height = keyboard.nextInt();
// 		click the output before typing or you will type in the code
//		System.out.println("The height you input was "+height+".");
		width = keyboard.nextInt();
//		System.out.println("The width you input was "+width+".");
		depth = keyboard.nextInt();
//		System.out.println("The depth you input was "+depth+".");
		System.out.println("The volume of the box is " + height*width*depth + ".");
		box[0]=String.valueOf(height);
		box[1]=String.valueOf(width);
		box[2]=String.valueOf(depth);
		keyboard.close();
		System.out.println("The box is "+box[0]+" units tall, "+box[1]+" units wide, and "+box[2]+" units tall.");
	}
}