package buoi4;

import java.util.Scanner;

public class SDSinhVienCNTT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinhVienCNTT ds[];
		System.out.print("Nhap so luong: ");
		int n = sc.nextInt();
		ds = new SinhVienCNTT[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
			ds[i] = new SinhVienCNTT();
			ds[i].nhap();
		}
		for (SinhVienCNTT sv : ds) {
			sv.in();
		}
		System.out.print("Nhap email can tim: ");
		String email = sc.nextLine();
		for (SinhVienCNTT sv : ds) {
			if (sv.getEmail().equals(email)) {
				System.out.println("Ho ten: " + sv.getHoTen() + ", diem trung binh: " + sv.diemTrungBinh());
				break;
			}
		}
	}
}
