package buoi4;

import java.util.Scanner;

import buoi2.Date;
import buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien {
	private String taiKhoan;
	private String matKhau;
	private String email;

	public SinhVienCNTT() {
		super();
		taiKhoan = new String();
		matKhau = new String();
		email = new String();
	}

	public SinhVienCNTT(String maSo, String hoTen, Date ngaySinh, int soLuongHP, String[] tenHocPhan,
			String[] diemHocPhan, String taiKhoan, String matKhau, String email) {
		super(maSo, hoTen, ngaySinh, soLuongHP, tenHocPhan, diemHocPhan);
		this.taiKhoan = taiKhoan;
		this.matKhau = matKhau;
		this.email = email;
	}

	public SinhVienCNTT(SinhVienCNTT svcntt) {
		super(svcntt);
		taiKhoan = new String(svcntt.taiKhoan);
		matKhau = new String(svcntt.matKhau);
		email = new String(svcntt.email);
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhapThongTin();
		System.out.print("Nhap tai khoan: ");
		taiKhoan = sc.nextLine();
		System.out.print("Nhap mat khau: ");
		matKhau = sc.nextLine();
		System.out.print("Nhap email: ");
		email = sc.nextLine();
	}

	public void in() {
		super.in();
		System.out.print(", tai khoan: " + taiKhoan + ", email: " + email);
	}

	public String toString() {
		return super.toString() + ", tai khoan: " + taiKhoan + ", email: " + email;
	}

	public String getEmail() {
		return email;
	}

	public void doiMatKhau(String newpass) {
		matKhau = newpass;
	}

}
