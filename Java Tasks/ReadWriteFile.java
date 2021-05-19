

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteFile {
	public static void main(String[] args) {
		File destination = new File("C:\\Users\\ABHIN\\Desktop\\java_files\\output.txt");
		File f1 = new File("C:\\Users\\ABHIN\\Desktop\\java_files");
		File[] farr = f1.listFiles();
		for (File inputFile : farr) {
			Operation operation = new Operation(inputFile, destination);
			Thread thread = new Thread(operation);
			thread.start();
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Operation implements Runnable {
	File destination;
	File readableFile;
	public Operation(File readableFile, File destination) {
		this.destination = destination;
		this.readableFile = readableFile;
	}
	@Override
	public void run() {
		write(readableFile, destination);
	}
	public static void write(File readableFile, File destination) {
		try {
			String appendData = "";
			String content = "";
			BufferedReader br = new BufferedReader(new FileReader(readableFile));
			while ((appendData = br.readLine()) != null) {
				content += appendData + " ";
			}
			br.close();
			if (!destination.exists())
				destination.createNewFile();
			BufferedWriter bw = new BufferedWriter(new FileWriter(destination, true));
			bw.write(content);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}