import java.io.File;
import java.util.Scanner;

//import necessary packages

@SuppressWarnings("unchecked") // Do not delete this line
public class Main {
	public static void main(String[] args) {
		String record = "";
		int i = 0;
		spidy: while (i == 0) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter Name");
			String name = in.nextLine();
			System.out.println("Enter Phone Number");
			int phone = in.nextInt();
			in.nextLine();
			System.out.println("Enter Email");
			String email = in.nextLine();
			record += name + "," + phone + "," + email + ";";
			System.out.println("Do you want to enter another record(yes/no)");
			String check = in.next();
			if (check.equalsIgnoreCase("yes")) {
				continue spidy;
			} else {
				break;
			}
		}
		File f = FileManager.createFile();
		FileManager.writeFile(f, record);
		String arr[] = FileManager.readFile(f);
		for (String str : arr) {
	        System.out.println(str);
	      }
	}

}