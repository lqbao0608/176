package buoi2;

public class SDDiem {

	public static void main(String[] args) {
		// Tao diem A(3, 4).
		Diem A = new Diem(3, 4);
		System.out.print("Diem A: ");
		A.inDiem();
		
		// Nhap diem B tu ban phim.
		Diem B = new Diem();
		System.out.println("Nhap diem B:");
		B.nhapDiem();
		System.out.print("Diem B: ");
		B.inDiem();
		
		// Tao diem C doi xung voi diem B qua goc toa do.
		Diem C = new Diem(-B.giaTriX(), -B.giaTriY());
		System.out.print("Diem C doi xung voi diem B qua goc toa do: ");
		C.inDiem();
		
		// Tinh khoang cach tu diem B den tam O(0, 0).
		System.out.println("Khoang cach tu diem B den tam O(0, 0): " + B.khoangCach());
		
		// Tinh khoang cach tu diem A(3, 4) den diem B.
		System.out.println("Khoang cach tu diem A(3, 4) den diem B: " + A.khoangCach(B));
	}

}
