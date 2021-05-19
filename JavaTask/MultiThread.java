import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
class FileConcept extends Thread
{
    public void run()
    {
    try {
    File file = new File("read.txt");
    File file1= new File("read1.txt");
    FileInputStream inputStream = new FileInputStream(file);
    FileInputStream inputstream1= new FileInputStream(file1);
    Scanner sc = new Scanner(inputStream);
    Scanner sc1= new Scanner(inputstream1);
    StringBuffer buffer = new StringBuffer();
    while(sc.hasNext()) {
       buffer.append(" "+sc.nextLine());
    }
    while(sc1.hasNext())
    {
       buffer.append(" "+sc1.nextLine());
    }
    System.out.println("Contents of the file: "+buffer);
    File dest = new File("write.txt");
    FileWriter writer = new FileWriter(dest);
    writer.write(buffer.toString());
    writer.flush();
    System.out.println("File copied successfully.......");
}
catch (Exception e) {
    System.out.println(e);
}
 }
}
class Fibonacci extends Thread
{
    public void run(){
    try{
    Scanner sc=new Scanner(System.in);
    int first=0,second=1,third;
    int n=sc.nextInt();
    while(n>0)
    {
    third=first+second;
    first=second;
    second=third;
    System.out.println(third);
    n--;
    }
}
    catch (Exception e) {  
    System.out.println(e);  
}
}
}
public class MultiThread  {
    public static void main(String []args)
    {
       Fibonacci fibonaccithread=new Fibonacci();
       FileConcept filethread=new FileConcept();
       fibonaccithread.start(); 
       filethread.start(); 

    }
}
