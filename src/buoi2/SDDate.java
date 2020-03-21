package buoi2;

import java.util.Scanner;

public class SDDate {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Nhap mot ngay.
		Date date = new Date();
		System.out.println("Nhap ngay/thang/nam:");
		date.nhap();
		System.out.print("Ngay vua nhap: ");
		date.in();
		
		// Tinh ngay hom sau.
		Date date1 = date.ngayHomSau();
		System.out.print("Ngay " + date.toString() + ", ngay hom sau: ");
		date1.in();
		
		// Tinh ngay hien tai sau khi cong them n ngay.
		System.out.print("Nhap so ngay muon cong them: ");
		int n = sc.nextInt();
		Date date2 = date.congNgay(n);
		System.out.print("Ngay " + date.toString() + ", cong them " + n + " ngay: ");
		date2.in();
	}
	
}
