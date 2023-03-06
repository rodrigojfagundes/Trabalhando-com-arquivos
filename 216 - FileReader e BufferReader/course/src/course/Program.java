package course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//criando uma variavel do tipo STRING q sera o caminho do arquivo
		String path = "c:\\temp\\in.txt";

		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		finally {
		try {
		if (br != null) {
			br.close();
		}
		if (fr != null) {
			fr.close();
		}
	}
		catch (IOException e) {
			e.printStackTrace();
		}
		}
	}
}
