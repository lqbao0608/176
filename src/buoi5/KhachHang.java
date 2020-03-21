package buoi5;

import java.util.Scanner;

public class KhachHang {
	private String maKH;
	private String hoTen;
	private String diaChi;
	private String sdt;

	public KhachHang() {
		maKH = new String();
		hoTen = new String();
		diaChi = new String();
		sdt = new String();
	}

	public KhachHang(KhachHang kh) {
		maKH = new String(kh.maKH);
		hoTen = new String(kh.hoTen);
		diaChi = new String(kh.diaChi);
		sdt = new String(kh.sdt);
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma khach hang: ");
		maKH = sc.nextLine();
		System.out.print("Nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		diaChi = sc.nextLine();
		System.out.print("Nhap so dien thoai: ");
		sdt = sc.nextLine();
	}

	public void in() {
		System.out.println(maKH + ", " + hoTen + ", " + diaChi + ", " + sdt);
	}

	public String toString() {
		return maKH + ", " + hoTen + ", " + diaChi + ", " + sdt;
	}
}
