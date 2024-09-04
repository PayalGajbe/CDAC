/*5)Write a program that allows the user to select a shape (Circle, Square, Rectangle, Triangle) and then calculates the area based on user-provided dimensions using a switch case.*/
package practice;
import java.util.*;
public class Assi2_prog5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select a shape for which you want to the find area(circle, square, rectangle, triangle): ");
		String shape = sc.next();
		switch (shape) {
		case "circle":
			System.out.println("Enter the radius of the circle: ");
			float r = sc.nextInt();
			float areac = 3.14f*r*r;
			System.out.println("The area of circle is "+areac);
			break;
		
		case "square":
			System.out.println("Enter the side of the square: ");
			int side = sc.nextInt();
			int areas = side*side;
			System.out.println("The area of square is "+areas);
			break;
			
		case "rectangle":
			System.out.println("Enter the length of the rectangle: ");
			int length = sc.nextInt();
			System.out.println("Enter the breadth of the rectangle: ");
			int width = sc.nextInt();
			int arear = length*width;
			System.out.println("The area of rectangle is "+arear);
			break;
			
		case "triangle":
			System.out.println("Enter the length of each side the triangle: ");
			int base = sc.nextInt();
			System.out.println("Enter the height of the triangle: ");
			int heightt = sc.nextInt();
			float areat = (0.5f*base)*heightt;
			System.out.println("The area of triangle is "+areat);
			break;
		}
		sc.close();

	}

}
