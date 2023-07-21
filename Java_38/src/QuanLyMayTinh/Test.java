package QuanLyMayTinh;

public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(19, 05, 2015);
		Ngay ngay2 = new Ngay(30, 01, 2011);
		Ngay ngay3 = new Ngay(19, 05, 2015);
		
		QuocGia quocGia1 = new QuocGia("VN", "Việt Nam");
		QuocGia quocGia2 = new QuocGia("USA", "Hoa Kỳ");
		QuocGia quocGia3 = new QuocGia("PL", "Ban Lan");
		
		HangSanXuat hangSanXuat1 = new HangSanXuat("VNLaptop", quocGia1);
		HangSanXuat hangSanXuat2 = new HangSanXuat("Macbook", quocGia2);
		HangSanXuat hangSanXuat3 = new HangSanXuat("Asus", quocGia3);
		
		MayTinh mayTinh1 = new MayTinh(hangSanXuat1, ngay1, 16500000, 1);
		MayTinh mayTinh2 = new MayTinh(hangSanXuat2, ngay2, 20500000, 1.5);
		MayTinh mayTinh3 = new MayTinh(hangSanXuat3, ngay3, 4000000, 24);
		
		System.out.println("Kiem tra gia thap hon: ");
		System.out.println("MT1 VS MT2: "+mayTinh1.kiemTraGiaThapHon(mayTinh2));
		System.out.println("MT1 VS MT3: "+mayTinh1.kiemTraGiaThapHon(mayTinh3));
		
		System.out.println("Ten Quoc Gia MT1: "+mayTinh1.layTenQuocGia());
		System.out.println("Ten Quoc Gia MT2: "+mayTinh2.layTenQuocGia());
		System.out.println("Ten Quoc Gia MT3: "+mayTinh3.layTenQuocGia());
	}

}
