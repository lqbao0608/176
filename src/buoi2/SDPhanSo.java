package buoi2;

import java.util.Scanner;

public class SDPhanSo {

	public static void nhapDanhSach(PhanSo[] dsPhanSo, int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan so thu " + i + ":");
			dsPhanSo[i] = new PhanSo();
			dsPhanSo[i].nhap();
		}
	}

	public static void hienThiDanhSach(PhanSo[] dsPhanSo) {
		for (PhanSo ps : dsPhanSo) {
			ps.in();
		}
	}

	public static PhanSo tinhTong(PhanSo[] dsPhanSo) {
		PhanSo tong = new PhanSo();
		for (PhanSo ps : dsPhanSo) {
			tong = tong.cong(ps);
		}
		return tong;
	}

	public static PhanSo timPhanSoLonNhat(PhanSo[] dsPhanSo) {
		PhanSo max = dsPhanSo[0];
		for (int i = 1; i < dsPhanSo.length; i++) {
			if (dsPhanSo[i].lonHon(max) == true) {
				max = dsPhanSo[i];
			}
		}
		return max;
	}

	public static void sapXepDanhSachTangDan(PhanSo[] dsPhanSo) {
		for (int i = 0; i < dsPhanSo.length - 1; i++) {
			for (int j = i + 1; j < dsPhanSo.length; j++) {
				if (dsPhanSo[i].lonHon(dsPhanSo[j]) == true) {
					PhanSo temp = new PhanSo(dsPhanSo[i]);
					dsPhanSo[i].makeCopy(dsPhanSo[j]);
					dsPhanSo[j].makeCopy(temp);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Tao phan so a = 3/7 va b = 4/9.
		PhanSo a = new PhanSo(3, 7);
		System.out.print("Phan so a: ");
		a.in();
		PhanSo b = new PhanSo(4, 9);
		System.out.print("Phan so b: ");
		b.in();

		// Nhap phan so x va y tu ban phim.
		PhanSo x = new PhanSo();
		System.out.println("Nhap phan so x:");
		x.nhap();
		PhanSo y = new PhanSo();
		System.out.println("Nhap phan so y:");
		y.nhap();

		// Tim nghich dao cua phan so x.
		System.out.print("Nghich dao cua phan so x: ");
		PhanSo nghichDaoX = x.giaTriNghichDao();
		nghichDaoX.in();

		// Tinh tong cua phan so x + y.
		PhanSo tongXY = x.cong(y);
		System.out.print("Tong cua x + y: ");
		tongXY.in();

		// Nhap danh sach phan so.
		PhanSo[] dsPhanSo;
		System.out.print("Nhap so luong phan so: ");
		int n = sc.nextInt();
		dsPhanSo = new PhanSo[n];
		nhapDanhSach(dsPhanSo, n);

		// Tinh tong cac phan so.
		System.out.print("Tong cac phan so: ");
		PhanSo tong = tinhTong(dsPhanSo);
		tong.in();

		// Tim phan so lon nhat.
		System.out.print("Phan so lon nhat: ");
		PhanSo max = timPhanSoLonNhat(dsPhanSo);
		max.in();

		// Sap xep va hien thi danh sach phan so theo thu tu tang dan.
		System.out.println("Danh sach phan so sau khi sap xep theo thu tu tang dan:");
		sapXepDanhSachTangDan(dsPhanSo);
		hienThiDanhSach(dsPhanSo);
	}

}
