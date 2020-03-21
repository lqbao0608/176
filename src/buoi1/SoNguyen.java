package buoi1;

import java.util.Scanner;

public class SoNguyen {
	
	public static void nhapDanhSach(int[] a, int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap so nguyen thu " + (i + 1) + ":");
			a[i] = sc.nextInt();
		}
	}
	
	public static void inDanhSach(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static int dem(int[] a, int x) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == x) {
				count++;
			}
		}
		return count;
	}
	
	public static void sapXepTang(int[] a) {
		for(int i = 0; i < a.length - 1; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== NHAP DANH SACH SO NGUYEN =====");
		System.out.print("Nhap so luong phan tu: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		nhapDanhSach(a, n);
		System.out.println("===== DANH SACH SO NGUYEN =====");
		inDanhSach(a);
		System.out.println("===== DEM SO LAN XUAT HIEN CUA PHAN TU X TRONG DANH SACH =====");
		System.out.print("Nhap x: ");
		int x = sc.nextInt();
		System.out.println("So " + x + " xuat hien " + dem(a, x) + " lan trong danh sach");
		System.out.println("===== DANH SACH SO NGUYEN SAP XEP TANG DAN =====");
		sapXepTang(a);
		inDanhSach(a);
	}
}
