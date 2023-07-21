package QuanLySinhVien;

public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(14, 04, 2004);
		Ngay ngay2 = new Ngay(16, 07, 2001);
		Ngay ngay3 = new Ngay(14, 4, 2004);
		
		Lop lop1 = new Lop("DH01", "Khoa Công nghệ Thông tin");
		Lop lop2 = new Lop("DH02", "Khoa an ninh mạng");
		Lop lop3 = new Lop("DH03", "Khoa Công nghệ Thông tin và điện tử");
		
		SinhVien sinhVien1 = new SinhVien("01", "Tín1", ngay1, 9.0, lop1);
		SinhVien sinhVien2 = new SinhVien("02", "Tín2", ngay2, 5.0, lop2);
		SinhVien sinhVien3 = new SinhVien("03", "Tín3", ngay3, 2.0, lop3);
		
		
		System.out.println("Ten khoa SV1 :"+sinhVien1.layTenKhoa());
		System.out.println("Ten khoa SV2 :"+sinhVien2.layTenKhoa());
		System.out.println("Ten khoa SV3 :"+sinhVien3.layTenKhoa());
		
		System.out.println("SV1 có thi đạt ko: "+sinhVien1.kiemTraThiDat());
		System.out.println("SV2 có thi đạt ko: "+sinhVien2.kiemTraThiDat());
		System.out.println("SV3 có thi đạt ko: "+sinhVien3.kiemTraThiDat());
		
		System.out.println("Kiểm tra cùng ngày sinh:");
		System.out.println("SV1 với SV2: "+sinhVien1.kiemTraCungNgaySinh(sinhVien2));
		System.out.println("SV1 với SV3: "+sinhVien1.kiemTraCungNgaySinh(sinhVien3));
	}

}
