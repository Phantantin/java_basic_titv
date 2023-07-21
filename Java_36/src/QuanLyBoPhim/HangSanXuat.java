package QuanLyBoPhim;

public class HangSanXuat {
	private String tenHangXuatSan;
	private String quocGia;

	// constructor
	public HangSanXuat(String tenHangXuatSan, String quocGia) {
		this.tenHangXuatSan = tenHangXuatSan;
		this.quocGia = quocGia;
		
		
	}

	
	// set,get
	public String getTenHangXuatSan() {
		return tenHangXuatSan;
	}

	public void setTenHangXuatSan(String tenHangXuatSan) {
		this.tenHangXuatSan = tenHangXuatSan;
	}

	public String getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
	

}
