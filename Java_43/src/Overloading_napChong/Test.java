package Overloading_napChong;

public class Test {
	public static void main(String[] args) {
		MuMath mm = new MuMath();
		
		System.out.println(mm.timMin(5, 5));
		System.out.println(mm.timMin(5.5, 6.5));
		System.out.println("Tinh tong(6,7): "+mm.tinhTong(6,7));
		System.out.println("Tinh tong(6.5 ,7.5 ): "+mm.tinhTong(6.5 ,7.5));
		
		double arr[] = new double[] {1,2,3,4,5};
		System.out.println("Tong(arr) 1,2,3,4,5 :"+mm.tinhTong(arr));
	}

}
