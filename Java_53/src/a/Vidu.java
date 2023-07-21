package a;

import java.util.Arrays;

public class Vidu {
	public static void main(String[] args) {
		int[] mang1 = {1,2,3};
		
		int[] mang1_a = mang1;
		
		mang1_a[0] = 100;
		
		System.out.println("Mang 1"+Arrays.toString(mang1));
		System.out.println("Mang1_a"+Arrays.toString(mang1_a));
		
		System.out.println("----------------");
		
		int[] mang1_b = mang1.clone();
		mang1_b[0] =10;
		System.out.println("Mang1_b"+ Arrays.toString(mang1_b));
	}

}
