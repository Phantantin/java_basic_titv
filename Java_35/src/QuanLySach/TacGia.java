package QuanLySach;

public class TacGia {
	private String tenTacGia;
	private Ngay ngaySinh;
	
	
	// constructor
	public TacGia(String tenTacGia, Ngay ngaySinh) {
		this.tenTacGia = tenTacGia;
		this.ngaySinh = ngaySinh;
	}


	// set, get
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public Ngay getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Ngay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	
	

}
