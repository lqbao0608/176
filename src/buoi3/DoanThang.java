package buoi3;

import buoi2.Diem;

public class DoanThang {
	
	private Diem d1;
	private Diem d2;
	
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	
	public DoanThang(Diem a, Diem b) {
		d1 = a;
		d2 = b;
	}
	
	public DoanThang(int ax, int ay, int bx, int by) {
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}
	
	public DoanThang(DoanThang dt) {
		d1 = new Diem(dt.d1);
		d2 = new Diem(dt.d2);
	}
	
	public void makeCopy(DoanThang dt) {
		d1 = new Diem(dt.d1);
		d2 = new Diem(dt.d2);
	}
	
	public void nhapDoanThang() {
		System.out.println("Nhap diem d1:");
		d1.nhapDiem();
		System.out.println("Nhap diem d2:");
		d2.nhapDiem();
	}
	
	public void inDoanThang() {
		System.out.print("[" + d1 + ", " + d2 + "]");
	}
	
	public void tinhTien(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	
	public float doDai() {
		return d1.khoangCach(d2);
	}
	
	public String toString() {
		return "[" + d1 + ", " + d2 + "]";
	}
	
}
