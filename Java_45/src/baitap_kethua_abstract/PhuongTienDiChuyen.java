package baitap_kethua_abstract;

public abstract class PhuongTienDiChuyen {
	protected String tenLoaiPhuongTien;
	private HangSanXuat hangSanXuat;

	public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
		this.tenLoaiPhuongTien = tenLoaiPhuongTien;
		this.hangSanXuat = hangSanXuat;
	}

	public String getTenLoaiPhuongTien() {
		return tenLoaiPhuongTien;
	}

	public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
		this.tenLoaiPhuongTien = tenLoaiPhuongTien;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public String layTenHangSanXuat() {
		return this.hangSanXuat.getTenHangSanXuat();
	}
	
	public void bauDau() {
		System.out.println("Bat Dau");
	}
	
	public void tangToc() {
		System.out.println("Tang Toc");
	}
	
	public void dungLai() {
		System.out.println("Dung Lai");
	}
	
	public abstract double layVanToc();
	
	
	
}
