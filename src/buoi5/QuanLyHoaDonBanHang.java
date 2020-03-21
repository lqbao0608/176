package buoi5;

import java.util.Scanner;

public class QuanLyHoaDonBanHang {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== NHAP DANH SACH HOA DON =====");
		System.out.print("Nhap so luong hoa don: ");
		int n = sc.nextInt();
		HoaDon dsHD[] = new HoaDon[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin hoa don thu " + (i + 1) + ":");
			dsHD[i] = new HoaDon();
			dsHD[i].nhap();
		}
		System.out.println("===== DANH SACH HOA DON =====");
		for (int i = 0; i < n; i++) {
			dsHD[i].in();
		}
		System.out.println("===== TINH TONG TIEN CHO MOI HOA DON =====");
		for (int i = 0; i < n; i++) {
			System.out.println("Tong tien hoa don thu " + (i + 1) + ": "
					+ dsHD[i].tongTien());
		}
	}

}