import java.io.*;
import java.util.Scanner;

class Files extends Thread{
	public void run(){
		try{
			Scanner sc = new Scanner(System.in);
			String file1 = sc.nextLine();
			File fil1 = new File(file1);
			String file3 = sc.nextLine();
			File fil3 = new File(file3);
			String file2 = sc.nextLine();
			File fil2 = new File(file2);
			
		    FileInputStream in = new FileInputStream(fil1);
			FileInputStream in1 = new FileInputStream(fil2);
			FileOutputStream out = new FileOutputStream(fil3);
			int n;
			while((n=in.read()) != -1){
				out.write(n);
			}
			
			while((n=in1.read()) != -1){
				out.write(n);
			}
			in.close();
			in1.close();
			out.close();
		}
		catch(IOException ex){
			System.out.println("Some Error Occured with files");
			ex.printStackTrace();
		}
	}
}

public class FileThread
{
	public static void main(String[] args) {
		
		Files fl = new Files();
		fl.start();
	}
}
