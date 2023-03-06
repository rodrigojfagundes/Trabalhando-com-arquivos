package course;
import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a file path");
		
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		System.out.println("getName: " + path.getName());
		
		System.out.println("getParent: " + path.getParent());
		
		System.out.println("getPath: " + path.getPath());
		sc.close();
	}
}
