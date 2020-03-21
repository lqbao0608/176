package buoi5;

import java.util.Scanner;

public class HangHoa {
	private String maHH;
	private String tenHH;
	private int soLuong;
	private long donGia;

	public HangHoa() {
		maHH = new String();
		tenHH = new String();
	}

	public HangHoa(HangHoa hh) {
		maHH = new String(hh.maHH);
		tenHH = new String(hh.tenHH);
	}

	public int getSoLuong() {
		return soLuong;
	}

	public long getDonGia() {
		return donGia;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma hang hoa: ");
		maHH = sc.nextLine();
		System.out.print("Nhap ten hang hoa: ");
		tenHH = sc.nextLine();
		System.out.print("Nhap so luong: ");
		soLuong = sc.nextInt();
		System.out.print("Nhap don gia: ");
		donGia = sc.nextLong();
	}

	public void in() {
		System.out.println(maHH + ", " + tenHH + ", " + soLuong + ", " + donGia
				+ "vnd");
	}

	public String toString() {
		return maHH + ", " + tenHH + ", " + soLuong + ", " + donGia + " vnd";
	}

}
