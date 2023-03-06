package course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "c:\\temp\\in.txt";

		//e essa variavel vai receber um NEW FILE READER como argumento e nele vai receber o CAMINHO do
		//arquivo q queremos abrir em PATH
		try (BufferedReader br = new BufferedReader(new FileReader(path))){

			String line = br.readLine();			

			while (line != null) {

				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
