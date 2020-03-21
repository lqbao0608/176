package buoi1;

import java.util.Scanner;

public class HoTen {
	
	public static String tachTen(String hoTen) {
		hoTen.trim();
		int i = hoTen.lastIndexOf(' ');
		String ten = hoTen.substring(i + 1, hoTen.length());
		return ten;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		String hoTen = sc.nextLine();
		String ten = tachTen(hoTen);
		System.out.println("Ten: " + ten);
	}
	
}
