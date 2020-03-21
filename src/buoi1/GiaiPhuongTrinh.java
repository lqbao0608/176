package buoi1;

import java.util.Scanner;

public class GiaiPhuongTrinh {

	public static void giaiPhuongTrinhBac1(float a, float b) {
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh co vo so nghiem");
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}
		} else {
			System.out.println("Phuong trinh co 1 nghiem: x = " + (-b / a));
		}
	}

	public static void giaiPhuongTrinhBac2(float a, float b, float c) {
		if (a == 0) {
			giaiPhuongTrinhBac1(b, c);
		} else {
			float delta = b * b - 4 * a * c;
			float x1, x2;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				System.out.println("Phuong trinh co 1 nghiem kep: x = " + (-b / (2 * a)));
			} else if (delta > 0) {
				x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phuong trinh co 2 nghiem phan biet:");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: ");
		float a = sc.nextFloat();
		System.out.print("Nhap b: ");
		float b = sc.nextFloat();
		System.out.print("Nhap c: ");
		float c = sc.nextFloat();
		giaiPhuongTrinhBac2(a, b, c);
	}

}
