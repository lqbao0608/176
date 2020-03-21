package buoi1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SoNguyenTo {

	public static boolean kiemTraNguyenTo(int n) {
		if (n == 1 || n == 2) {
			return true;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {
			try {
				System.out.println("Nhap so nguyen:");
				n = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Dinh dang so khong hop le, moi nhap lai!");
			} finally {
				sc.nextLine();
			}
		}
		if (kiemTraNguyenTo(n) == true) {
			System.out.println(n + " la so nguyen to");
		} else {
			System.out.println(n + " khong phai la so nguyen to");
		}
	}

}
