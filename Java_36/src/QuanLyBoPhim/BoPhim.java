package QuanLyBoPhim;

public class BoPhim {
	private String tenPHim;
	private int namXuatSan;
	private HangSanXuat hangSanXuat;
	private double giaVe;
	private Ngay ngayChieu;
	
	// constructor
	public BoPhim(String tenPHim, int namXuatSan, HangSanXuat hangSanXuat, double giaVe, Ngay ngayChieu) {
		this.tenPHim = tenPHim;
		this.namXuatSan = namXuatSan;
		this.hangSanXuat = hangSanXuat;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}

	
	// set, get
	public String getTenPHim() {
		return tenPHim;
	}

	public void setTenPHim(String tenPHim) {
		this.tenPHim = tenPHim;
	}

	public int getNamXuatSan() {
		return namXuatSan;
	}

	public void setNamXuatSan(int namXuatSan) {
		this.namXuatSan = namXuatSan;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public double getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}

	public Ngay getNgayChieu() {
		return ngayChieu;
	}

	public void setNgayChieu(Ngay ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	
	
	public boolean kiemTraGiaVeReHon(BoPhim phimKhac) {
		return this.giaVe < phimKhac.giaVe;
	}
	
	public String layTenBoPhim() {
		return this.hangSanXuat.getTenHangXuatSan();
	}
	
	public double giaSauKhuyenMai(double x) {
		return this.giaVe * (1-x/100);
	}
	
	
	

}
