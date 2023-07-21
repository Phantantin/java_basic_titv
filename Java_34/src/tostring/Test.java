package tostring;

public class Test {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(15, 10, 2024);
		MyDate md2 = new MyDate(10, 03, 2024);
		MyDate md3 = new MyDate(15, 10, 2024);
		
		System.out.println(md1);
		System.out.println(md2);
		System.out.println(md3);
		
		System.out.println("md1 so sach md2: "+md1.equals(md2));
		System.out.println("md1 so sach md3: "+md1.equals(md3));
	}

}
