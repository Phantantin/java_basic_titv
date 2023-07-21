package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutThamTrungThuong_HasSet {
	Set<String> tapHopPhieuDuThuong = new HashSet<String>();
	
	
	
	public RutThamTrungThuong_HasSet() {
	}
	
	public boolean themPhieu(String giaTri) {
		return this.tapHopPhieuDuThuong.add(giaTri);
	}
	
	public boolean xoaPhieu(String giaTri) {
		return this.tapHopPhieuDuThuong.remove(giaTri);
	}
	
	public boolean kiemTraPhieuTonTai(String giaTri) {
		return this.tapHopPhieuDuThuong.contains(giaTri);
	}

	public void xoaTatCaPhieu() {
		this.tapHopPhieuDuThuong.clear();
	}
	
	public int laySoLuong() {
		return this.tapHopPhieuDuThuong.size();
	}
	
	public String rutThamTrungThuong() {
		String ketQua = "";
		Random rd = new Random();
		int viTri = rd.nextInt(this.tapHopPhieuDuThuong.size());
		ketQua= (String) this.tapHopPhieuDuThuong.toArray()[viTri];
		return ketQua;
		
	}
	
	public void inTatCa() {
		System.out.println(Arrays.toString(this.tapHopPhieuDuThuong.toArray()));
	}

	public static void main(String[] args) {
		int luaChon =0;
		Scanner sc = new Scanner(System.in);
		RutThamTrungThuong_HasSet rt = new RutThamTrungThuong_HasSet();
	
		
		do {
			System.out.println("------------------");
			System.out.println("----------MENU---------");
			System.out.println("1.Thêm mã số dự thưởng.");
			System.out.println("2.Xóa mã số dự thưởng.");
			System.out.println("3.Kiểm tra phiếu dự thưởng có tồn tại hay không.");
			System.out.println("4.Xóa tất cả các phiếu dự thưởng.");
			System.out.println("5.Số lượng phiếu dự thưởng.");
			System.out.println("6.Rút thăm trúng thưởng.");
			System.out.println("7.In ra tất cả các phiếu.");
			System.out.println("0.Thoát chương trình.");
			luaChon = sc.nextInt();
			sc.nextLine();
			
			if(luaChon ==1 || luaChon==2 || luaChon==3) {
				System.out.println("Nhập vào mã phiếu dự thưởng: ");
				String giaTri = sc.nextLine();
				if(luaChon ==1) {
					rt.themPhieu(giaTri);
				}else if(luaChon ==2) {
					rt.xoaPhieu(giaTri);
				}else {
					System.out.println("Kết quả kiểm tra: "+rt.kiemTraPhieuTonTai(giaTri));
				}
			}else if(luaChon ==4) {
				rt.xoaTatCaPhieu();
			}else if(luaChon ==5) {
				System.out.println("Số lượng phiếu là: "+ rt.laySoLuong());
			}else if(luaChon ==6) {
				System.out.println("Mã số trúng thưởng là: "+rt.rutThamTrungThuong());
			}else if(luaChon ==7) {
				System.out.println("Các mã phiếu dự thưởng là: ");
				rt.inTatCa();
			}
			
		}while(luaChon !=0);
	}

}
