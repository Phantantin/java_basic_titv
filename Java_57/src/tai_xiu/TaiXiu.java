package tai_xiu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * Một người chơi có tài khoản. 
 * người chơi đặt cược ít hơn hoặc bằng số tiền 
 * đang có trong tài khoản
 * 
 * Có 3 con xx
 * 1. nếu tổng =3 hay = 18 cái ăn
 * 2. (4-10) -> xỉu
 * 3. (11- 17)->tài
 */

public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoanNguoiChoi = 9000000;
		int luaChon =1;
		Scanner sc = new Scanner(System.in);
		
		Locale locale = new Locale("vi", "VN");
//		NumberFormat numberFormat = NumberFormat.getInstance(locale);
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
		
		do {
			System.out.println("------Mời Bạn Chọn--------");
			System.out.println("Chọn 1 để tiếp tục. ");
			System.out.println("Chọn bất kỳ để thoát. ");
			luaChon = sc.nextInt();
			if(luaChon ==1) {
				System.out.println("***Bắt đầu chơi: ");
				System.out.println("***** Tài khoản người chơi: "+numberFormat.format(taiKhoanNguoiChoi) +" bạn muốn cược bao nhiêu: ");
				// cược
				double datCuoc =0;
				do {
					System.out.println("Đặt cược >0 và < "+numberFormat.format(taiKhoanNguoiChoi)+" : ");
					datCuoc = sc.nextDouble();
				}while(datCuoc <=0 || datCuoc>taiKhoanNguoiChoi);
				
				
				// chọn tài xỉu
				int luaChonTaiXiu =0;
				do {
					System.out.println("*****1 là tài , 2 là xỉu: ");
					luaChonTaiXiu = sc.nextInt();
				}while(luaChonTaiXiu !=1 && luaChonTaiXiu!=2);
				
				// tạo xúc xắc
				Random xucXac1 = new Random();
				Random xucXac2 = new Random();
				Random xucXac3 = new Random();
				
				int giaTri1 = xucXac1.nextInt(1,7);
				int giaTri2 = xucXac2.nextInt(1,7);
				int giaTri3 = xucXac3.nextInt(1,7);
				
				int tong = giaTri1+giaTri2+giaTri3;
				//tính toán
				System.out.println("*****Kết quả: "+giaTri1+" - "+giaTri2+" - "+giaTri3);
				if(tong == 3 || tong == 18) {
					taiKhoanNguoiChoi -=datCuoc;
					System.out.println("***** Tổng là: "+tong+" => Cái ăn.");
					System.out.println("Tiền còn lại của bạn: "+numberFormat.format(taiKhoanNguoiChoi));
					
				}else if(tong >=4 && tong<=10) {
					System.out.println("***** Tổng là : "+tong+ " =>Xỉu.");
					if(luaChonTaiXiu ==2) {
						System.out.println("***** Bạn đã thắng.");
						taiKhoanNguoiChoi+=datCuoc;
						System.out.println("Tiền còn lại của bạn: "+numberFormat.format(taiKhoanNguoiChoi));
					}else {
						System.out.println("***** Bạn đã thua.");
						taiKhoanNguoiChoi-=datCuoc;
						System.out.println("Tiền còn lại của bạn: "+numberFormat.format(taiKhoanNguoiChoi));
					}
				}else {
					System.out.println("***** Tổng là : "+tong+ "=>Tài.");
					if(luaChonTaiXiu ==1) {
						System.out.println("***** Bạn đã thắng.");
						taiKhoanNguoiChoi+=datCuoc;
						System.out.println("Tiền còn lại của bạn: "+numberFormat.format(taiKhoanNguoiChoi));
					}else {
						System.out.println("***** Bạn đã thua.");
						taiKhoanNguoiChoi-=datCuoc;
						System.out.println("Tiền còn lại của bạn: "+numberFormat.format(taiKhoanNguoiChoi));
					}
				}
				
			}
			
		}while(luaChon ==1);
	}

}
