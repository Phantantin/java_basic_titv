package file;

import java.io.File;

public class delete_file {
	
	public static void xoaFile(File fx) {
		if(fx.isFile()) {
			// xóa nếu là file
			System.out.println("Đã xóa: "+fx.getAbsolutePath());
			fx.delete();
		}else if(fx.isDirectory()) {
			// lấy các file con
			File[] mangCon = fx.listFiles();
			for (File file : mangCon) {
				// xóa các file con
				xoaFile(file);
			}
			// xóa bản thân thư mục sau khi đã xóa các file con
			System.out.println("Đã xóa: "+fx.getAbsolutePath());
			fx.delete();
		}
	}
	
	// "D:\\Hoc_Java_TITV\\folder1"
	
	public static void main(String[] args) {
		File f0 = new File("D:\\Hoc_Java_TITV\\a.txt");
		File f0_1 = new File("D:\\Hoc_Java_TITV\\folder2");
		File f0_2 = new File("D:\\Hoc_Java_TITV\\folder4_2");
		
		
		// xóa được nếu là thư mục rỗng deleteOnExit()
		f0.deleteOnExit();
		
		delete_file.xoaFile(f0_1);
	}

}
