import java.util.Scanner;

public class Lab5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		short a = in.nextShort();
		short b = in.nextShort();
		int i;
		for (i = a; i <= b; i++) {
			System.out.println(i + " " + (char) i);
		}
	}
}
