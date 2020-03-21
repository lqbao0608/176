package buoi3;

import java.util.Scanner;
import buoi1.HoTen;

public class SDSinhVien {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("===== NHAP THONG TIN SINH VIEN A =====");
//		SinhVien a = new SinhVien();
//		a.nhap();
//		System.out.println("===== THONG TIN SINH VIEN A =====");
//		a.in();
//		System.out.println("===== THEM 1 HOC PHAN CHO SINH VIEN A =====");
//		System.out.println("Nhap hoc phan can them:");
//		System.out.print("Nhap ten hoc phan: ");
//		String tenHP1 = new String();
//		tenHP1 = sc.nextLine();
//		System.out.print("Nhap diem hoc phan:");
//		String diemHP1 = new String();
//		diemHP1 = sc.nextLine();
//		a.themHocPhan(tenHP1, diemHP1);
//		a.in();
//		System.out.println("===== XOA 1 HOC PHAN CUA SINH VIEN A =====");
//		System.out.print("Nhap ten hoc phan can xoa: ");
//		String tenHP2 = new String();
//		tenHP2 = sc.nextLine();
//		a.xoaHocPhan(tenHP2);
//		a.in();
		System.out.println("===== NHAP DANH SACH SINH VIEN =====");
		System.out.print("Nhap so luong sinh vien: ");
		int n = sc.nextInt();
		SinhVien[] dsSV = new SinhVien[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
			dsSV[i] = new SinhVien();
			dsSV[i].nhapThongTin();
		}
		System.out.println("===== DANH SACH SINH VIEN =====");
		for (int i = 0; i < dsSV.length; i++) {
			dsSV[i].in();
		}
		System.out.println("===== DANH SACH SINH VIEN BI CANH BAO HOC VU =====");
		for (int i = 0; i < dsSV.length; i++) {
			if (dsSV[i].diemTrungBinh() < 0.8) {
				dsSV[i].in();
			}
		}
		System.out.println("===== SINH VIEN CO DIEM TRUNG BINH CAO NHAT LOP =====");
		float maxDiemTB = dsSV[0].diemTrungBinh();
		int p = 0;
		for (int i = 1; i < dsSV.length; i++) {
			if (dsSV[i].diemTrungBinh() > maxDiemTB) {
				maxDiemTB = dsSV[i].diemTrungBinh();
				p = i;
			}
		}
		dsSV[p].in();
		System.out.println("===== DANH SACH SINH VIEN SAP XEP THEO THU TU ALPHABET CUA TEN =====");
		for (int i = 0; i < dsSV.length - 1; i++) {
			for (int j = i + 1; j < dsSV.length; j++) {
				String ten1 = HoTen.tachTen(dsSV[i].getHoTen());
				String ten2 = HoTen.tachTen(dsSV[j].getHoTen());
				if (ten1.compareTo(ten2) > 0) {
					SinhVien temp = new SinhVien();
					temp = dsSV[i];
					dsSV[i] = dsSV[j];
					dsSV[j] = temp;
				}
			}
		}
		for (int i = 0; i < dsSV.length; i++) {
			dsSV[i].in();
		}
	}

}
