package bai;

public class Test {
	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyen", 100000, 1.5);
		HoaDonCaPhe hd1 = new HoaDonCaPhe("Trung Nguyen", 100000, 5.5);
		HoaDonCaPhe hd2 = new HoaDonCaPhe("Trung Nguyen", 1000000, 1.5);
		
		System.out.println("Tong tien: " +hd.tinhTongTien());
		System.out.println("Tong tien: " +hd1.tinhTongTien());
		
		System.out.println("Kiem tra khoi luong > 2kg :"+hd.kiemTraKLLonHon(1));
		System.out.println("Kiem tra khoi luong > 2kg :"+hd.kiemTraKLLonHon(2));
		
		System.out.println("Kiem tra tong tien > 500k: "+ hd.kiemTraTongTienLonHon500K());
		System.out.println("Kiem tra tong tien > 500k: "+ hd1.kiemTraTongTienLonHon500K());
		
		System.out.println("Giam gia cua hd: "+ hd.giamGia(10));
		System.out.println("Giam gia cua hd: "+ hd1.giamGia(10));
		
		System.out.println("Sau khi giam gia cua hd :"+ hd.giamSauKhiGiam(10));
		System.out.println("Sau khi giam gia cua hd1 :"+ hd1.giamSauKhiGiam(10));
		
		
	}

}
