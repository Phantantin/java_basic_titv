package enum_b;

public class ThoiKhoaBieu {
	private Ngay thu;
	private String cacMonHoc;

	public ThoiKhoaBieu(Ngay thu, String cacMonHoc) {
		this.thu = thu;
		this.cacMonHoc = cacMonHoc;
	}

	public Ngay getThu() {
		return thu;
	}

	public void setThu(Ngay thu) {
		this.thu = thu;
	}

	public String getCacMonHoc() {
		return cacMonHoc;
	}

	public void setCacMonHoc(String cacMonHoc) {
		this.cacMonHoc = cacMonHoc;
	}

	@Override
	public String toString() {
		return "ThoiKhoaBieu [thu=" + thu + ", cacMonHoc=" + cacMonHoc + "]";
	}

	
}
