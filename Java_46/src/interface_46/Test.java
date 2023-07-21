package interface_46;

public class Test {
	public static void main(String[] args) {
		System.out.println("Test cau a: ");
		MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
		MayTinhVinaCal500 mvn500 = new MayTinhVinaCal500();
		
		System.out.println("5+3= "+mfx500.cong(5, 3));
		System.out.println("4*5= "+mfx500.nhan(4, 5));
		System.out.println("----------");
		
		System.out.println("Test cau b: ");
		double[] arr = new double[] {5,2,1,7,4,9,6};
		double[] arr2 = new double[] {1,7,8,2,4,6,0};
		
		SapXepChen sxChen = new SapXepChen();
		SapXepChon sxChon = new SapXepChon();
		
		sxChen.sapXepTang(arr);
		System.out.println("Sap Xep Tang Dan(SxChen): ");
		for (int i =0 ; i< arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println("\n-----------");
		System.out.println("Sap xep giam dan(SxChen): ");
		sxChen.sapXepGiam(arr2);
		for (int i =0 ; i< arr2.length; i++) {
			System.out.print(arr2[i]+ " ");
		}
		
		System.out.println("\n-----------");
		System.out.println("Sap xep tang dan(SxChon): ");
		sxChon.sapXepTang(arr2);
		for (int i =0 ; i< arr2.length; i++) {
			System.out.print(arr2[i]+ " ");
		}
		
		System.out.println("\n-----------");
		System.out.println("Sap xep giam dan(SxChon): ");
		sxChon.sapXepGiam(arr);
		for (int i =0 ; i< arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println("\n------------");
		System.out.println("Test cau c: ");
		PhanMemMayTinh pmmt = new PhanMemMayTinh();
		System.out.println("3+5= "+pmmt.cong(5, 3));
		
		double[] arr3 = new double[] {3,6,8,0,1,5};
		System.out.println("Sap xep tang dan(Pmmt): ");
		pmmt.sapXepTang(arr3);
		for (int i =0 ; i< arr3.length; i++) {
			System.out.print(arr3[i]+ " ");
		}
		
	}
}
