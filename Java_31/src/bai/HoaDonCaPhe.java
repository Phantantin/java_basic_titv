package bai;

public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien1KG;
	private double khoiLuong;
	
	// constructor
	public HoaDonCaPhe(String ten, double gia, double luong) {
		this.tenLoaiCaPhe = ten;
		this.giaTien1KG = gia;
		this.khoiLuong = luong;
	}
	
	// phuong thuc
	public double tinhTongTien() {
		return this.giaTien1KG * this.khoiLuong;
	}
	public boolean kiemTraKLLonHon(double kl) {
		return this.khoiLuong > kl;
	}
	
	public boolean kiemTraTongTienLonHon500K() {
		return this.tinhTongTien() > 500000;
	}
	
	public double giamGia(double x) {
		if(this.tinhTongTien() > 500000) {
			return (x/100)*this.tinhTongTien();
		}else {
			return 0;
		}
	}
	
	public double giamSauKhiGiam(double x) {
		return this.tinhTongTien() - this.giamGia(x);
	}

}
