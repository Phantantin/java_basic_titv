package vidu;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		SinhVien sinhVien1 = new SinhVien(01, "Phan An", "Lop1", 3);
		SinhVien sinhVien2 = new SinhVien(100, "Phan Binh", "Lop1", 7);
		SinhVien sinhVien3 = new SinhVien(31, "Phan A1", "Lop1", 5);
		
		SinhVien[] sv_1 = new SinhVien[] {sinhVien1, sinhVien2, sinhVien3};
		
		System.out.println("Ban đầu: "+ Arrays.toString(sv_1));
		// sắp xếp
		Arrays.sort(sv_1);
		System.out.println("Sau: "+Arrays.toString(sv_1));
		
		// tìm kiếm
		System.out.println("tìm sinh viên 1: "+Arrays.binarySearch(sv_1, sinhVien1));
		System.out.println("tìm sinh viên 3: "+Arrays.binarySearch(sv_1, sinhVien3));
	}

}
