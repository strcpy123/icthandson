import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//import necessary packages

@SuppressWarnings("unchecked") // Do not delete this line
public class FileManager {

	static public File createFile() {
		File file = null;
		  file = new File("visitors.txt");
		  return file;
		   }
	

	static public void writeFile(File f, String record) {
		try {
			FileWriter myWriter = new FileWriter("visitors.txt");
			myWriter.write(record);
			myWriter.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	static public String[] readFile(File f) {
		String[] str = null;
		BufferedReader br=null;
		try {
			br = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    String line = null;

	    try {
			while ((line = br.readLine()) != null) {
			  String[] values = line.split(";");
			  str = new String[values.length];
			  for (int i=0;i<values.length;i++) {
			    str[i]=values[i];
			  }
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    return str;
	}
}