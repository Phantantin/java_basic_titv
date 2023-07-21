package file;

import java.io.File;
import java.util.Scanner;

public class ViDuFile {
	File file;
	
	
	public ViDuFile(String tenFile) {
		this.file = new File(tenFile);
	}
	
	//kiểm tra file có thực thi được không
	public boolean kiemTraThuThi() {
		return this.file.canExecute();
	}

	// kiểm tra file có thể đọc
	public boolean kiemTraCoTheDoc() {
		return this.file.canRead();
	}

	// kiểm tra file có thể viết
		public boolean kiemTraCoTheViet() {
			return this.file.canWrite();
	}
		
		// In đường dẫn
	public void inDuongDan() {
		System.out.println(this.file.getAbsolutePath());
	}
	
	//in tên file
	public void inTenFile() {
		System.out.println(this.file.getName());
	}
	
	// thư mục hay tập tin
	public void kiemTraThuMucHayTapTin() {
		if(this.file.isDirectory()) {
			System.out.println("Đây là thư mục.");
		}else if(this.file.isFile()) {
			System.out.println("Đây là file");
		}
	}
	
	// in ra danh sách file con
	public void inRaDanhSachFileCon() {
		if(this.file.isDirectory()) {
			System.out.println("Đây là thư mục. Các thư mục hay tập tin con bên trong là: ");
			File[] mangCon =file.listFiles();
			for (File file : mangCon) {
				System.out.println(file.getAbsolutePath());
			}
		}else if(this.file.isFile()) {
			System.out.println("Đây là file, không có file con.");
		}
	}
	
	// in cây thư mục
	public void inCayThuMuc() {
		this.inChiTietCayThuMuc(this.file, 1);
	}
	
	public void inChiTietCayThuMuc(File f, int bac) {
		for (int i = 0; i < bac; i++) {
//			System.out.println("|");
			System.out.print("\t");
		}
		System.out.print("|_");
		System.out.println(f.getName());
		if(f.canRead() && f.isDirectory()) {
			File[] mangCon = f.listFiles();
			for (File file : mangCon) {
				inChiTietCayThuMuc(file, bac+1);
			}
		}
	}

	public static void main(String[] args) {
		int luaChon =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập tên file: ");
		String tenFile = sc.nextLine();
		ViDuFile viDuFile =new ViDuFile(tenFile);
		do {
			System.out.println("------MENU------");
			System.out.println("1.	Kiểm tra có thể thực thi.\n"
					+ "2.	Kiểm tra file có đọc được.\n"
					+ "3.	Kiểm tra file có thể ghi.\n"
					+ "4.	In đường dẫn.\n"
					+ "5.	In tên file.\n"
					+ "6.	Kiểm tra file là thư mục hay file.\n"
					+ "7.	In ra danh sách file con.\n"
					+ "8.	In ra cây thư mục.\n"
					+ "0.	Thoát chương trình.");
			
			luaChon = sc.nextInt();
			
			switch (luaChon) {
			case 1:
				System.out.println("File có thực thi: "+viDuFile.kiemTraThuThi());
				break;
			case 2:
				System.out.println(viDuFile.kiemTraCoTheDoc());
				break;
			case 3:
				System.out.println(viDuFile.kiemTraCoTheViet());
				break;
			case 4:
				viDuFile.inDuongDan();
				break;
			case 5:
				viDuFile.inTenFile();
				break;
			case 6:
				viDuFile.kiemTraThuMucHayTapTin();
				break;
			case 7:
				viDuFile.inRaDanhSachFileCon();
				break;
			case 8:
				viDuFile.inCayThuMuc();
				break;
				
			default:
				break;
			}
			
			sc.nextLine();
			
		}while(luaChon !=0);
	}

}
