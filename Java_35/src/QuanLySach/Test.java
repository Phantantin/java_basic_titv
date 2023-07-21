package QuanLySach;

public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 05, 2023);
		Ngay ngay2 = new Ngay(25, 12, 2031);
		Ngay ngay3 = new Ngay(20, 04, 2023);
		
		TacGia tacGia1 = new TacGia("Tín Chip", ngay1);
		TacGia tacGia2 = new TacGia("Tấn Tín", ngay2);
		TacGia tacGia3 = new TacGia("Tín 3", ngay3);
		
		Sach sach1 = new Sach("Lập trình C", 5000, 2023, tacGia1);
		Sach sach2 = new Sach("Lập trình Java", 10000, 2024, tacGia2);
		Sach sach3 = new Sach("Lập trình PHP", 15000, 2023, tacGia3);
		
		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();
		
		System.out.println("So sach NXB sach1 va sach2: " +sach1.kiemTraCungNamXuatBan(sach2));
		System.out.println("So sach NXB sach1 va sach3: " +sach1.kiemTraCungNamXuatBan(sach3));
		
		System.out.println("Sach1 giam 10%: "+sach1.giamSauKhiGiam(10));
		System.out.println("Sach1 giam 20%: "+sach2.giamSauKhiGiam(20));
		System.out.println("Sach1 giam 50%: "+sach3.giamSauKhiGiam(50));
	}

}
