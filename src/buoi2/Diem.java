package buoi2;

import java.util.Scanner;

public class Diem {

	private int x;
	private int y;

	public Diem() {
		x = 0;
		y = 0;
	}

	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Diem(Diem d) {
		x = d.x;
		y = d.y;
	}
	
	public void makeCopy(Diem d) {
		x = d.x;
		y = d.y;
	}

	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap hoanh do x: ");
		x = sc.nextInt();
		System.out.print("Nhap tung do y: ");
		y = sc.nextInt();
	}

	public void inDiem() {
		System.out.print("(" + x + "," + y + ")");
	}

	public void doiDiem(int dx, int dy) {
		x += dx;
		y += dy;
	}

	public int giaTriX() {
		return x;
	}

	public int giaTriY() {
		return y;
	}

	public float khoangCach() {
		return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	public float khoangCach(Diem d) {
		return (float) Math.sqrt(Math.pow(x - d.x, 2) + Math.pow(y - d.y, 2));
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
