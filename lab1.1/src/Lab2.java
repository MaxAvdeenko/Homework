import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		double d;
		d = b * b - 4 * a * c;
		double x1, x2;
		if (d > 0) {
			x1 = (-b - Math.sqrt(d)) / (2 * a);
			x2 = (-b + Math.sqrt(d)) / (2 * a);
			if (x1 == x2) {
				System.out.println(x1);
			} else {
				System.out.println(x1);
				System.out.println(x2);
			}
		} else {
			System.out.println("Корней нет");
		}
	}
}