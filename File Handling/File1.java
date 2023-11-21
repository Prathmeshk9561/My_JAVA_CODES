package File;

import java.io.File;
public class File1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("C:\\Aher\\city.txt");
		System.out.println(f1.getName());
		System.out.println(f1.getPath());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.canExecute());
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
		System.out.println(f1.isHidden());
		System.out.println(f1.lastModified());
	}
}
