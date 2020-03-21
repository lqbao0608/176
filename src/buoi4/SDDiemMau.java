package buoi4;

import java.util.Scanner;

public class SDDiemMau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong diem mau: ");
        int n = sc.nextInt();
        DiemMau ds[] = new DiemMau[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Nhap diem mau thu " + (i+1) + ":");
            ds[i] = new DiemMau();
            ds[i].nhapDiemMau();
        }
        for(DiemMau dm : ds) {
            dm.inDiemMau();
        }
    }
}
