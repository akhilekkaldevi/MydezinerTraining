

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteFile {
	public static void main(String[] args) {
		Operation o = new Operation();
		Thread t=new Thread(o);
		t.start();
	}
}

class Operation implements Runnable{
	@Override
	public void run() {
		try {
			File output = new File("C:\\Users\\ABHIN\\Desktop\\java_files\\output.txt");
			File f1 = new File("C:\\Users\\ABHIN\\Desktop\\java_files");
			File[] farr = f1.listFiles();
			String append = " ";
			String data = "";
			for (File f : farr) {
				BufferedReader br = new BufferedReader(new FileReader(f));
				while ((append = br.readLine()) != null) {
					data += append + " ";
				}
				br.close();
			}
			output.createNewFile();
			FileWriter fw = new FileWriter("C:\\Users\\ABHIN\\Desktop\\java_files\\output.txt");
			fw.write(data);
			fw.close();
		} catch (Exception e) {
			System.out.println("IOException");
		}
	}
}