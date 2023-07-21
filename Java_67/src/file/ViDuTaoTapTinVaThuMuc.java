package file;

import java.io.File;
import java.io.IOException;

public class ViDuTaoTapTinVaThuMuc {

	public static void main(String[] args) {
		File folder1 = new File("D:\\eclipse-workspace\\Java_67");
		
		// kiểm tra folder có tồn tại hay không
		System.out.println("Kiểm tra folder có tồn tại hay không "+folder1.exists());
		
		// tạo thư mục
		// phương thức mkdir()
		File folder2 = new File("D:\\Hoc_Java_TITV\\folder1");
		folder2.mkdir();
		
		// phương thức mkdirs() -> tạp nhiều thư mục cùng 1 lúc
		File folder3 = new File("D:\\Hoc_Java_TITV\\folder2\\folder2_1\\folder2_2");
		folder3.mkdirs();
		
		// tạo tập tin ()
		File file1 = new File("D:\\Hoc_Java_TITV\\folder1\\Vidu2.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
