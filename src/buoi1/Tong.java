package buoi1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		while (true) {
			try {
				System.out.print("Nhap so nguyen a: ");
				a = sc.nextInt();
				System.out.print("Nhap so nguyen b: ");
				b = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Dinh dang so khong hop le, moi nhap lai!");
			} finally {
				sc.nextLine();
			}
		}
		System.out.println("Tong a + b = " + (a + b));
	}

}
