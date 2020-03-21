package buoi3;

import java.util.Scanner;

public class Gach {

	private String maSo;
	private String mau;
	private int soVien1Hop;
	private int chieuDai1Vien;
	private int chieuNgang1Vien;
	private long gia1Hop;

	public Gach() {
		maSo = new String();
		mau = new String();
		soVien1Hop = 0;
		chieuDai1Vien = 0;
		chieuNgang1Vien = 0;
		gia1Hop = 0;
	}

	public Gach(String maSo, String mau, int soVien1Hop, int chieuDai1Vien, int chieuNgang1Vien, long gia1Hop) {
		this.maSo = maSo;
		this.mau = mau;
		this.soVien1Hop = soVien1Hop;
		this.chieuDai1Vien = chieuDai1Vien;
		this.chieuNgang1Vien = chieuNgang1Vien;
		this.gia1Hop = gia1Hop;
	}

	public Gach(Gach g) {
		maSo = g.maSo;
		mau = g.mau;
		soVien1Hop = g.soVien1Hop;
		chieuDai1Vien = g.chieuDai1Vien;
		chieuNgang1Vien = g.chieuNgang1Vien;
		gia1Hop = g.gia1Hop;
	}

	public void makeCopy(Gach g) {
		maSo = g.maSo;
		mau = g.mau;
		soVien1Hop = g.soVien1Hop;
		chieuDai1Vien = g.chieuDai1Vien;
		chieuNgang1Vien = g.chieuNgang1Vien;
		gia1Hop = g.gia1Hop;
	}

	public long getGia1Hop() {
		return gia1Hop;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so: ");
		maSo = sc.nextLine();
		System.out.print("Nhap mau: ");
		mau = sc.nextLine();
		System.out.print("Nhap so luong vien gach trong 1 hop: ");
		soVien1Hop = sc.nextInt();
		System.out.print("Nhap chieu dai 1 vien gach (cm): ");
		chieuDai1Vien = sc.nextInt();
		System.out.print("Nhap chieu ngang 1 vien gach (cm): ");
		chieuNgang1Vien = sc.nextInt();
		System.out.print("Nhap gia ban 1 hop: ");
		gia1Hop = sc.nextLong();
	}

	public void in() {
		System.out.print("[" + maSo + ", Mau: " + mau + ", So luong: " + soVien1Hop + ", Chieu dai: " + chieuDai1Vien
				+ ", Chieu ngang: " + chieuNgang1Vien + ", Gia: " + gia1Hop + "]");
	}

	public String toString() {
		return "[" + maSo + ", Mau: " + mau + ", So luong: " + soVien1Hop + ", Chieu dai: " + chieuDai1Vien
				+ ", Chieu ngang: " + chieuNgang1Vien + ", Gia: " + gia1Hop + "]";
	}

	public float tinhGiaBanLe() {
		return (float) ((gia1Hop / soVien1Hop) + (gia1Hop / soVien1Hop) * (20 / 100));
	}

	public int dienTichLotNenToiDa1Hop() {
		return (int) (chieuDai1Vien * chieuNgang1Vien) * soVien1Hop;
	}

	public int soluongHop(int D, int N) {
		int soVienNgang = N / chieuNgang1Vien;
		if (N % chieuNgang1Vien != 0) {
			soVienNgang++;
		}
		int soVienDai = D / chieuDai1Vien;
		if (D % chieuDai1Vien != 0) {
			soVienDai++;
		}
		int tongSoVien = soVienNgang * soVienDai;
		int soHop = tongSoVien / soVien1Hop;
		if (tongSoVien % soVien1Hop != 0) {
			soHop++;
		}
		return soHop;
	}

}
