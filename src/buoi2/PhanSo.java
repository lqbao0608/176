package buoi2;

import java.util.Scanner;

public class PhanSo {

	private int tu;
	private int mau;

	public PhanSo() {
		tu = 0;
		mau = 1;
	}

	public PhanSo(int t, int m) {
		tu = t;
		mau = m;
	}

	public PhanSo(PhanSo p) {
		tu = p.tu;
		mau = p.mau;
	}

	public void makeCopy(PhanSo p) {
		tu = p.tu;
		mau = p.mau;
	}

	public int uscln(int a, int b) {
		int kq = Math.abs(a);
		for (int i = kq; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
		}
		return 1;
	}

	public void toiGian() {
		tu /= uscln(tu, mau);
		mau /= uscln(tu, mau);
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap tu so: ");
			tu = sc.nextInt();
			System.out.print("Nhap mau so: ");
			mau = sc.nextInt();
		} while (mau == 0);
	}

	public void in() {
		if (tu == 0 || mau == 1) {
			System.out.println(tu);
		} else if (tu % mau == 0) {
			System.out.println(tu / mau);
		} else if (tu < 0 && mau < 0) {
			System.out.println(Math.abs(tu) + "/" + Math.abs(mau));
		} else if (tu < 0 || mau < 0) {
			System.out.println("-" + Math.abs(tu) + "/" + Math.abs(mau));
		} else {
			System.out.println(tu + "/" + mau);
		}
	}

	public void nghichDao() {
		if (tu == 0) {
			System.out.println("Tu so bang 0, khong nghich dao duoc!");
		} else {
			int temp = tu;
			tu = mau;
			mau = temp;
		}
	}

	public PhanSo giaTriNghichDao() {
		if (tu == 0) {
			System.out.println("Tu so bang 0, khong nghich dao duoc!");
			return new PhanSo();
		}
		return new PhanSo(mau, tu);
	}

	public float giaTriPhanSo() {
		return (float) tu / mau;
	}

	public boolean lonHon(PhanSo a) {
		return (float) tu / mau > (float) a.tu / a.mau;
	}

	public PhanSo cong(PhanSo a) {
		PhanSo x = new PhanSo((tu * a.mau) + (a.tu * mau), mau * a.mau);
		x.toiGian();
		return x;
	}

	public PhanSo cong(int b) {
		PhanSo x = new PhanSo(tu + mau * b, mau);
		x.toiGian();
		return x;
	}

	public String toString() {
		return tu + "/" + mau;
	}

}
