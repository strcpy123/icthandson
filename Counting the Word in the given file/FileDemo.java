import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		int wc=0;
		
		try {
			File file = new File("log.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			StringBuffer sb = new StringBuffer();
			String line;
			while ((line = br.readLine()) != null) {
				String words[]= line.split(" ");
				for (int i = 0; i < words.length; i++) {
					if(words[i].equalsIgnoreCase("knowledge"))
						wc++;
				}
			}
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(wc);
	}
}