package enum_b;

public enum Thang {
	ThangMot(31),
	ThangHai(29),
	ThangBa(31),
	ThangTu(30),
	ThangNam(31),
	ThangSau(30),
	ThangBay(31),
	ThangTam(31),
	ThangChin(30),
	ThangMuoi(31),
	ThangMuoiMot(30),
	ThangMuoiHai(31);
	
	private final int soNgay;
	Thang(int soNgay){
		this.soNgay = soNgay;
	}
	
	public int soNgay() {
		return soNgay;
	}
}
