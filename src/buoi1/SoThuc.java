package buoi1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SoThuc {

	public static void nhap(double[] ds, int n) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		do {
			System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
			try {
				ds[i] = sc.nextDouble();
				i++;
			} catch (InputMismatchException e) {
				System.out.println("Dinh dang so khong hop le, moi nhap lai!");
			} finally {
				sc.nextLine();
			}
		} while (i < n);
	}

	public static void inDanhSach(double[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static double max(double[] a) {
		double max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static double tong(double[] a) {
		double tong = 0;
		for (int i = 0; i < a.length; i++) {
			tong += a[i];
		}
		return tong;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua danh sach: ");
		int n = sc.nextInt();
		double[] a = new double[n];
		nhap(a, n);
		inDanhSach(a);
		System.out.println("So lon nhat: " + max(a));
		System.out.println("Tong: " + tong(a));
	}

}
