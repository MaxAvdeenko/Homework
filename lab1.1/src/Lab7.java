import java.util.Arrays;
import java.util.Scanner;

public class Lab7 {
	public static void main(String[] str) {

		Scanner in = new Scanner(System.in);
		System.out.println("������� �������� ��������� �������");
		int a = in.nextInt();
		String[] m = new String[a + 1];
		System.out.println("������� ������");
		for (int i = 0; i <= a; i++) {
			String c = in.nextLine();
			m[i] = c;
		}
		System.out.println();
		System.out.println("�� ����������: ");
		for (int i = 0; i <= a; i++) {
			System.out.print(m[i] + " ");
		}
		Arrays.sort(m);
		System.out.println();
		System.out.println("����� ����������: ");
		for (int i = 0; i <= a; i++) {
			System.out.print(m[i] + " ");
		}

	}
}