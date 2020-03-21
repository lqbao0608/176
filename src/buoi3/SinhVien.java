package buoi3;

import java.util.Scanner;

import buoi2.Date;

public class SinhVien {

	private String maSo;
	private String hoTen;
	private Date ngaySinh;
	private int soLuongHP;
	private String[] tenHP;
	private String[] diemHP;

	public SinhVien() {
		maSo = new String();
		hoTen = new String();
		ngaySinh = new Date();
		soLuongHP = 0;
		tenHP = new String[50];
		diemHP = new String[50];
	}

	public SinhVien(String maSo, String hoTen, Date ngaySinh, int soLuongHP,
			String[] tenHocPhan, String[] diemHocPhan) {
		this.maSo = new String(maSo);
		this.hoTen = new String(hoTen);
		this.ngaySinh = new Date(ngaySinh);
		this.soLuongHP = soLuongHP;
		this.tenHP = new String[tenHP.length];
		this.diemHP = new String[tenHP.length];
		for (int i = 0; i < soLuongHP; i++) {
			this.tenHP[i] = new String(tenHP[i]);
			this.diemHP[i] = new String(diemHP[i]);
		}
	}

	public SinhVien(SinhVien sv) {
		maSo = new String(sv.maSo);
		hoTen = new String(sv.hoTen);
		ngaySinh = new Date(sv.ngaySinh);
		soLuongHP = sv.soLuongHP;
		tenHP = new String[sv.tenHP.length];
		diemHP = new String[sv.tenHP.length];
		for (int i = 0; i < soLuongHP; i++) {
			tenHP[i] = new String(sv.tenHP[i]);
			diemHP[i] = new String(sv.diemHP[i]);
		}
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap MSSV: ");
		maSo = sc.nextLine();
		System.out.print("Nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap ngay sinh:");
		ngaySinh.nhap();
		System.out.print("Nhap so luong hoc phan: ");
		soLuongHP = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < soLuongHP; i++) {
			System.out.println("Nhap hoc phan thu " + (i + 1) + ":");
			System.out.print("Nhap ten hoc phan: ");
			tenHP[i] = new String();
			tenHP[i] = sc.nextLine();
			System.out.print("Nhap diem hoc phan: ");
			diemHP[i] = new String();
			diemHP[i] = sc.nextLine();
		}
	}

	public String getHoTen() {
		return hoTen;
	}

	public void in() {
		String s = "[" + maSo + ", " + hoTen + ", dang ky " + soLuongHP
				+ " hoc phan";
		for (int i = 0; i < soLuongHP; i++) {
			s += ", " + tenHP[i] + ": " + diemHP[i];
		}
		s += "]";
		System.out.print(s);
	}

	public String toString() {
		String s = "[" + maSo + ", " + hoTen + ", dang ky " + soLuongHP
				+ " hoc phan";
		for (int i = 0; i < soLuongHP; i++) {
			s += ", " + tenHP[i] + ": " + diemHP[i];
		}
		s += "]";
		return s;
	}

	public float diemTrungBinh() {
		float tongDiemHP = 0.0f;
		for (int i = 0; i < soLuongHP; i++) {
			if (diemHP[i].compareTo("A") == 0) {
				tongDiemHP += 4.0;
			} else if (diemHP[i].equals("B+")) {
				tongDiemHP += 3.5;
			} else if (diemHP[i].equals("B")) {
				tongDiemHP += 3.0;
			} else if (diemHP[i].equals("C+")) {
				tongDiemHP += 2.5;
			} else if (diemHP[i].equals("C")) {
				tongDiemHP += 2.0;
			} else if (diemHP[i].equals("D+")) {
				tongDiemHP += 1.5;
			} else if (diemHP[i].equals("D")) {
				tongDiemHP += 1.0;
			} else if (diemHP[i].equals("F")) {
				tongDiemHP += 0.0;
			}
		}
		return (float) tongDiemHP / soLuongHP;
	}

	public void themHocPhan(String ten, String diem) {
		if (soLuongHP < tenHP.length) {
			tenHP[soLuongHP] = new String(ten);
			diemHP[soLuongHP] = new String(diem);
			soLuongHP++;
		}
	}

	public void xoaHocPhan(String ten) {
		int p = -1;
		for (int i = 0; i < soLuongHP; i++) {
			if (tenHP[i].equals(ten)) {
				p = i;
				break;
			}
		}
		if (p != -1) {
			for (int i = p; i < soLuongHP - 1; i++) {
				tenHP[i] = tenHP[i + 1];
				diemHP[i] = diemHP[i + 1];
			}
		}
		soLuongHP--;
	}

}
