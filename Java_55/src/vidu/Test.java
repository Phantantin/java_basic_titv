package vidu;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
	
	public static int[] reverse(int[] x ) {
		int[] rs = new int [x.length];
		int index =0;
		for(int i=x.length-1 ; i>=0; i--) {
			rs[index] = x[i];
			index++;
		}
		return rs;
	}
	
	public static void main(String[] args) {
		int[] a= new int[] {1,4,7,9,2,3,0};
		int[] b= new int[5];
		
		System.out.println("mảng a: "+Arrays.toString(a));
		//hàm sắp xếp
		Arrays.sort(a);
		System.out.println("Sau sắp xếp: "+Arrays.toString(a));
		
		// hàm tìm kiếm
		System.out.println("Tìm số 4 ở vị trí nào: "+Arrays.binarySearch(a, 4));
		
		// 
		Arrays.fill(b, 4);
		System.out.println("Mảng b: "+Arrays.toString(b));
		
		
		// giảm dần
		a = Test.reverse(a);
		System.out.println("Mảng giảm dần: "+Arrays.toString(a));
	}

}
