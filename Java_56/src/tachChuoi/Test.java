package tachChuoi;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String s = "Xin chào, hello word";
		String[] a = s.split(",");
		

		System.out.println(Arrays.toString(a));
		
		String s2 = "Xin chào.Tôi là, phan tấn tín";
		String[] c = s2.split("\\.|\\,");
		System.out.println(Arrays.toString(c));
	}

}
