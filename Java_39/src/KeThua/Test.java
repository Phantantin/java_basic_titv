package KeThua;

public class Test {
	public static void main(String[] args) {
		ConNguoi conNguoi = new ConNguoi("Tín", 2023);
		conNguoi.an();
		conNguoi.uong();
		conNguoi.ngu();
		
		HocSinh hocSinh = new HocSinh("Tấn Tín", 2003, "Lơp 12", "Trường 1");
		hocSinh.an();
		hocSinh.uong();
		hocSinh.ngu();
		hocSinh.lamBaiTap();
		
	}

}
