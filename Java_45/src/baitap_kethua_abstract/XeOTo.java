package baitap_kethua_abstract;

public class XeOTo extends PhuongTienDiChuyen {
	private String loaiNhieuLieu;

	public XeOTo(HangSanXuat hangSanXuat, String loaiNhieuLieu) {
		super("Xe O To", hangSanXuat);
		this.loaiNhieuLieu = loaiNhieuLieu;
	}

	public String getLoaiNhieuLieu() {
		return loaiNhieuLieu;
	}

	public void setLoaiNhieuLieu(String loaiNhieuLieu) {
		this.loaiNhieuLieu = loaiNhieuLieu;
	}

	@Override
	public double layVanToc() {
		return 100;
	}
	
	

}
