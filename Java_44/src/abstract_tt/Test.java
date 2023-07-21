package abstract_tt;

public class Test {
	public static void main(String[] args) {
		TaoDo td1 = new TaoDo(5, 05);
		TaoDo td2 = new TaoDo(6, 05);
		TaoDo td3 = new TaoDo(7, 05);
		
		Hinh h1 = new Diem(td1);
		Hinh h2 = new HinhTron(td2, 5);
		Hinh h3 = new HinhChuNhat(td3, 6, 8);
		
		
		System.out.println("Dt1: "+h1.tinhDienTich());
		System.out.println("Dt2: "+h2.tinhDienTich());
		System.out.println("Dt3: "+h3.tinhDienTich());
	}

}
