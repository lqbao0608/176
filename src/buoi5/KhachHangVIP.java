package buoi5;

import java.util.Scanner;

public class KhachHangVIP extends KhachHang {
	private float tiLe;

	public KhachHangVIP() {
		super();
		tiLe = 0.0f;
	}

	public KhachHangVIP(KhachHangVIP kh) {
		super(kh);
		tiLe = kh.tiLe;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap ti le: ");
		tiLe = sc.nextFloat();
	}

	public void in() {
		System.out.print(super.toString() + ", " + tiLe);
	}

	public String toString() {
		return super.toString() + ", " + tiLe;
	}
}
