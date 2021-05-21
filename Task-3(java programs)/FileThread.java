import java.io.*;

public class FileThread {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        File directory = new File("C:\\Users\\PremNarsimlu\\Desktop\\myTraining\\MydezinerTraining\\Task-3(java programs)\\sample");
        File destination = new File("C:\\Users\\PremNarsimlu\\Desktop\\myTraining\\MydezinerTraining\\Task-3(java programs)\\sample\\dest.txt");
		try{
			destination.createNewFile();
		}
		catch(IOException e){
			System.out.println("Error occurred with file creation");
			e.printStackTrace();
		}
        File[] files = directory.listFiles();
        for (File file : files) {
            ReadnWriter w1 = new ReadnWriter(file, destination);
            Thread t = new Thread(w1);
            t.setPriority(Thread.MAX_PRIORITY);
            t.start();
           
        }
		
    }
}
 
class ReadnWriter extends Thread{
	File source;
	File destination;
    public ReadnWriter(File source,File destination) {
		this.source = source;
		this.destination = destination;
    }
    @Override
    public void run() {
        String data;
        data =   readFromFile(source.getAbsolutePath());
        writeToFile(destination,data);      
    }
   
    static void writeToFile(File file,String data) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
            writer.write(data);
            writer.flush();
			writer.close();
        } catch (IOException e) {
			System.out.println("Error occured with I/O");
            e.printStackTrace();
        }
		
    }
 
    static String readFromFile(String filename){
        StringBuffer data = new StringBuffer();
        try {
            String text;
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            while((text = reader.readLine())!=null){
				data.append(text);
                data.append("\n");
            }
			reader.close();	
        } 
		catch (FileNotFoundException e) {
			System.out.println("File not found, create a new file or read from another file");
            e.printStackTrace();
        }
        catch (IOException e) {
			System.out.println("Error occured with I/O");
            e.printStackTrace();
        }
    return data.toString(); 
    }
 
   
}