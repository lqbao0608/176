package buoi3;

import buoi2.Diem;


public class SDDoanThang {
	
	public static void main(String[] args) {
		Diem A = new Diem(2, 1);
		Diem B = new Diem(5, 3);
		DoanThang AB = new DoanThang(A, B);
		System.out.println("Doan thang AB:");
		AB.inDoanThang();
		AB.tinhTien(1, 2);
		
//		Diem C = new Diem(3, 3);
//		Diem D = new Diem(6, 5);
//		DoanThang CD = new DoanThang(C, D);
//		System.out.println("Doan thang CD:");
		Diem C = new Diem();
		Diem D = new Diem();
		System.out.println("Nhap diem C:");
		C.nhapDiem();
		System.out.println("Nhap diem D:");
		D.nhapDiem();
		DoanThang CD = new DoanThang(C, D);
		System.out.print("Doan thang CD:");
		CD.inDoanThang();
		System.out.println("Do dai doan thang CD: " + CD.doDai());
	}
	
}
