package bai;

public class Test {
	public static void main(String[] args) {
		MyDate md = new MyDate(31, 01, 2023);
		System.out.println("Day: "+md.getDay());
		
		md.setMonth(2);
		System.out.println("Month: "+md.getMonth());
	}

}
