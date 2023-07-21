package baitap_kethua_abstract;

public class Test {
	public static void main(String[] args) {
		HangSanXuat hangSanXuat1 = new HangSanXuat("Hãng 1", "Việt Nam");
		HangSanXuat hangSanXuat2 = new HangSanXuat("Hãng Audi", "Dức");
		HangSanXuat hangSanXuat3 = new HangSanXuat("Hãng Toyota", "Nhật Bản");
		
		MayBay p1 = new MayBay(hangSanXuat1, "Dầu");
		PhuongTienDiChuyen p2 = new XeOTo(hangSanXuat2, "Xăng");
		PhuongTienDiChuyen p3 = new XeDap(hangSanXuat3);
		
		System.out.println("Lấy hãng hãng sản xuất: ");
		System.out.println("p1: "+p1.layTenHangSanXuat());
		
		System.out.println("Bắt đầu: ");
		p2.bauDau();
		
		System.out.println("Lấy vận tốc: ");
		System.out.println("p1: "+p1.layVanToc());
		System.out.println("p2: "+p2.layVanToc());
		System.out.println("p3: "+p3.layVanToc());

		System.out.println("Cất cánh: ");
		p1.catCanh();
	}

}
