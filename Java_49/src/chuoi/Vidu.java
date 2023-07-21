package chuoi;

import java.util.Scanner;

public class Vidu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		System.out.println("Nhập vào chuỗi: ");
		s = sc.nextLine();
		System.out.println("------------");
		
		// Hàm length()-> trả về đọ dài chuỗi
		System.out.println(s.length());
		
		// hàm chatAt()
		for(int i=0; i<s.length(); i++ ) {
			System.out.println("Vị trí "+i+ " là: "+s.charAt(i));
		}
		
		// hàm getChars
		char[] arrChar = new char[20];
		s.getChars(0, 4, arrChar, 0);
		for(int i=0; i<arrChar.length; i++) {
			System.out.println("giá trị của mảng tại "+i+" là: "+arrChar[i]);
		}
	}

}
