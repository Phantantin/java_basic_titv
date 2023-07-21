package QuanLyMayTinh;

public class MayTinh {
	private HangSanXuat hangSanXuat;
	private Ngay ngaySanXuat;
	private double giaBan;
	private double thoiGiaBaoHanh;
	
	public MayTinh(HangSanXuat hangSanXuat, Ngay ngaySanXuat, double giaBan, double thoiGiaBaoHanh) {
		this.hangSanXuat = hangSanXuat;
		this.ngaySanXuat = ngaySanXuat;
		this.giaBan = giaBan;
		this.thoiGiaBaoHanh = thoiGiaBaoHanh;
	}
	
	
	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public Ngay getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(Ngay ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public double getThoiGiaBaoHanh() {
		return thoiGiaBaoHanh;
	}
	public void setThoiGiaBaoHanh(double thoiGiaBaoHanh) {
		this.thoiGiaBaoHanh = thoiGiaBaoHanh;
	}
	
	
	public boolean kiemTraGiaThapHon(MayTinh mtKhac) {
		return this.giaBan < mtKhac.giaBan;
	}
	
	public String layTenQuocGia() {
		return this.hangSanXuat.layTenQuocGia();
	}
	

}
