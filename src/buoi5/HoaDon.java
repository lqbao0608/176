package buoi5;

import java.util.Scanner;

import buoi2.Date;

public class HoaDon {
	private String maHD;
	private String tenHD;
	private KhachHang kh;
	private Date ngayMua;
	private int soLoaiHH;
	private HangHoa hh[];

	public HoaDon() {
		maHD = new String();
		tenHD = new String();
		ngayMua = new Date();
		kh = new KhachHang();
		soLoaiHH = 0;
		hh = new HangHoa[50];
	}

	public HoaDon(HoaDon hd) {
		maHD = new String(hd.maHD);
		tenHD = new String(hd.tenHD);
		ngayMua = new Date(hd.ngayMua);
		kh = new KhachHang(hd.kh);
		hh = new HangHoa[hd.hh.length];
		soLoaiHH = hd.soLoaiHH;
		for (int i = 0; i < hd.hh.length; i++) {
			hh[i] = new HangHoa(hd.hh[i]);
		}
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma hoa don: ");
		maHD = sc.nextLine();
		System.out.print("Nhap ten hoa don: ");
		tenHD = sc.nextLine();
		System.out.println("Nhap ngay mua: ");
		ngayMua.nhap();
		System.out.println("Nhap thong tin khach hang:");
		kh.nhap();
		System.out.print("Nhap so loai hang hoa: ");
		soLoaiHH = sc.nextInt();
		System.out.println("Nhap thong tin hang hoa:");
		for (int i = 0; i < soLoaiHH; i++) {
			System.out.println("Nhap hang hoa thu " + (i + 1) + ":");
			hh[i] = new HangHoa();
			hh[i].nhap();
		}
	}

	public void in() {
		String s = "[" + maHD + ", " + tenHD + ", " + ngayMua + "]" + "["
				+ kh.toString() + "]" + "[";
		for (int i = 0; i < soLoaiHH; i++) {
			s += "(" + hh[i].toString() + ")";
		}
		s += "]";
		System.out.println(s);
	}

	public long tongTien() {
		long tong = 0;
		for (int i = 0; i < soLoaiHH; i++) {
			tong += hh[i].getSoLuong() * hh[i].getDonGia();
		}
		return tong;
	}

	public String toString() {
		String s = "[" + maHD + ", " + tenHD + ", " + ngayMua + "]" + "["
				+ kh.toString() + "]" + "[";
		for (int i = 0; i < soLoaiHH; i++) {
			s += "(" + hh[i].toString() + ")";
		}
		s += "]";
		return s;
	}
}
