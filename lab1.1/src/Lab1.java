
import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double a = in.nextDouble();
		double b = in.nextDouble();
		if (Math.abs(a - 10) <= Math.abs(b - 10)) {
			System.out.println(a);
		} else
			System.out.println(b);
	}
}
