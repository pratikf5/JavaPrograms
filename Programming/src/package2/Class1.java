package package2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Class1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File file= new File("C:\\PratikCodes\\pratik.txt");
		try {
			FileInputStream file1= new FileInputStream(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("There is no file available");
		}
		
	}

}
