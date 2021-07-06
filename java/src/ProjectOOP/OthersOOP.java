package ProjectOOP;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	
	public static void main(String[] args) throws IOException {
		
		System.out.println(Math.PI);
		System.out.println(Math.ceil(1.8));
		
		FileWriter fw = new FileWriter("data.txt");

		fw.write("Hello");
		fw.write("jave");
		fw.close();
		
	}
}
