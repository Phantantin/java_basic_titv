package vidu;

public class Test {
	public static void main(String[] args) {
		SinhVien sinhVien1 = new SinhVien(01, "Phan An", "Lop1", 3);
		SinhVien sinhVien2 = new SinhVien(100, "Phan Binh", "Lop1", 7);
		SinhVien sinhVien3 = new SinhVien(31, "Phan A1", "Lop1", 5);
		SinhVien sinhVien4 = new SinhVien(01, "Phan ", "Lop1", 9);
		
		System.out.println(sinhVien1.compareTo(sinhVien2));

		
		
	}

}
