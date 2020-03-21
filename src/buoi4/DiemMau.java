package buoi4;

import java.util.Scanner;

import buoi2.Diem;

public class DiemMau extends Diem {
	private String mau;

	public DiemMau() {
		super();
		mau = new String();
	}

	public DiemMau(int x, int y, String mau) {
		super(x, y);
		this.mau = mau;
	}

	public DiemMau(DiemMau dm) {
		super(dm);
		mau = new String(dm.mau);
	}

	public void setMau(String mau) {
		this.mau = mau;
	}

	public void nhapDiemMau() {
		Scanner sc = new Scanner(System.in);
		super.nhapDiem();
		System.out.print("Nhap mau: ");
		mau = sc.nextLine();
	}

	public void inDiemMau() {
		super.inDiem();
		System.out.println(", mau: " + mau);
	}

	public String toString() {
		return super.toString() + ", mau: " + mau;
	}
}
