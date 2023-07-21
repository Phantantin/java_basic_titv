package enum_b;

public class Test {
	public static void main(String[] args) {
		ThoiKhoaBieu tkb2 = new ThoiKhoaBieu(Ngay.Moday, "Toán Lý Hóa");
		ThoiKhoaBieu tkb3 = new ThoiKhoaBieu(Ngay.Tuesday, "Anh Văn Sinh");
		ThoiKhoaBieu tkb4 = new ThoiKhoaBieu(Ngay.Wednesday, "Toán Sử Đại");
		ThoiKhoaBieu tkb5 = new ThoiKhoaBieu(Ngay.Thursday, "Toán Sử Đại");
		
		System.out.println(tkb3);
		
		int x= Thang.ThangMot.soNgay();
		System.out.println(x);
		
	}

}
