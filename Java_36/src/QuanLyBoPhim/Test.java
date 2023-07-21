package QuanLyBoPhim;

public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 01, 2021);
		Ngay ngay2 = new Ngay(20, 03, 2023);
		Ngay ngay3 = new Ngay(10, 06, 2026);
		
		HangSanXuat hangSanXuat1 = new HangSanXuat("Hãng SamSung", "Hàn Quốc");
		HangSanXuat hangSanXuat2 = new HangSanXuat("Hãng Iphobe", "Mỹ");
		HangSanXuat hangSanXuat3 = new HangSanXuat("Hãng Audi", "Đức");
		
		BoPhim boPhim1 = new BoPhim("Phim Bố già", 2020, hangSanXuat1, 65000, ngay1);
		BoPhim boPhim2 = new BoPhim("Phim Siu", 2022, hangSanXuat2, 100000, ngay2);
		BoPhim boPhim3 = new BoPhim("Phim Thế Giới khủng long", 2024, hangSanXuat3, 50000, ngay3);
		
		System.out.println("So sanh BP1 re hon BP2: "+boPhim1.kiemTraGiaVeReHon(boPhim2));
		System.out.println("So sanh BP1 re hon BP3: "+boPhim1.kiemTraGiaVeReHon(boPhim3));
		
		System.out.println("Ten hang san xuat Bo Phim 3: "+boPhim3.layTenBoPhim());
		
		System.out.println("BP1 giam 10%: "+boPhim1.giaSauKhuyenMai(10));
		System.out.println("BP2 giam 20%: "+boPhim2.giaSauKhuyenMai(20));
		System.out.println("BP3 giam 50%: "+boPhim3.giaSauKhuyenMai(50));
	}

}
