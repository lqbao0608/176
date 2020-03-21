package buoi2;

import java.util.Scanner;

public class Date {

	private int ngay;
	private int thang;
	private int nam;

	public Date() {
		ngay = 1;
		thang = 1;
		nam = 1;
	}

	public Date(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	
	public Date(Date d) {
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}
	
	public void makeCopy(Date d) {
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}

	public void in() {
		System.out.print(ngay + "/" + thang + "/" + nam);
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap ngay: ");
			ngay = sc.nextInt();
			System.out.print("Nhap thang: ");
			thang = sc.nextInt();
			System.out.print("Nhap nam: ");
			nam = sc.nextInt();
		} while (!hopLe());
	}

	public boolean hopLe() {
		int[] ngayMax = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) {
			ngayMax[2] = 29;
		}
		if (nam >= 1 && thang >= 1 && thang <= 12 && ngay >= 1 && ngay <= ngayMax[thang]) {
			return true;
		}
		return false;
	}

	public Date ngayHomSau() {
		Date date = new Date(ngay, thang, nam);
		date.ngay++;
		if (!date.hopLe()) {
			date.ngay = 1;
			date.thang++;
		}
		if (!date.hopLe()) {
			date.thang = 1;
			date.nam++;
		}
		return date;
	}

	public Date congNgay(int n) {
		Date date = new Date(ngay, thang, nam);
		for (int i = 0; i < n; i++) {
			date = date.ngayHomSau();
		}
		return date;
	}

	public String toString() {
		return ngay + "/" + thang + "/" + nam;
	}

}
