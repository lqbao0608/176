package buoi3;

import java.util.Scanner;

public class SDGach {

	public static void main(String[] args) {
		int n = 5;
		Gach[] dsGach = new Gach[n];
		dsGach[0] = new Gach("001", "Do", 7, 3, 4, 40000);
		dsGach[1] = new Gach("002", "Cam ", 8, 3, 6, 55000);
		dsGach[2] = new Gach("003", "Vang", 22, 3, 3, 55000);
		dsGach[3] = new Gach("004", "Luc", 6, 4, 4, 77000);
		dsGach[4] = new Gach("005", "Lam ", 4, 5, 5, 66000);
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("==== NHAP DANH SACH CAC LOAI GACH =====");
//		System.out.print("Nhap so luong loai gach: ");
//		int n = scanner.nextInt();
//		Gach[] dsGach = new Gach[n];
//		for (int i = 0; i < n; i++) {
//			System.out.println("Nhap thong tin loai gach thu " + (i + 1) + ":");
//			dsGach[i] = new Gach();
//			dsGach[i].nhapThongTin();
//		}
		System.out.println("===== DANH SACH CAC LOAI GACH =====");
		for (int i = 0; i < n; i++) {
			dsGach[i].in();
		}
		
		
		
		
		
		System.out.println("===== LOAI GACH CO CHI PHI LOT THAP NHAT =====");
		float minChiPhiLotNen = (float) (dsGach[0].getGia1Hop() / (dsGach[0].dienTichLotNenToiDa1Hop()));
		int p = 0;
		for (int i = 1; i < n; i++) {
			float chiPhiLotNen = (float) (dsGach[i].getGia1Hop() / (dsGach[i].dienTichLotNenToiDa1Hop()));
			if (chiPhiLotNen < minChiPhiLotNen) {
				minChiPhiLotNen = chiPhiLotNen;
				p = i;
			}
		}
		dsGach[p].in();
		
		int vitri = 0;
		for(int i=1; i<n; i++)
			if(  ((float)dsGach[vitri].getGia1Hop() / dsGach[vitri].dienTichLotNenToiDa1Hop()) 
			   > ((float)dsGach[i].getGia1Hop() / dsGach[i].dienTichLotNenToiDa1Hop()))
				vitri = i;
		System.out.println("\nLoai gach cho chi phi lot thap nhat");
		for(int i=0; i<n; i++)
			if(  ((float)dsGach[i].getGia1Hop() / dsGach[i].dienTichLotNenToiDa1Hop()) 
			  == ((float)dsGach[vitri].getGia1Hop() / dsGach[vitri].dienTichLotNenToiDa1Hop()) )
				dsGach[i].in();
		
		
		
		System.out.println("===== CHI PHI TUNG LOAI GACH KHI LOT 1 NEN CO DIEN TICH 5m * 20m =====");
		for (int i = 0; i < n; i++) {
			String s = dsGach[i].toString();
			s += ", chi phi lot: " + dsGach[i].soluongHop(2000, 500) * dsGach[i].getGia1Hop();
			System.out.println(s);
		}
	}

}
