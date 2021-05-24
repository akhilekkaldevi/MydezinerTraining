import java.io.*;
import java.
class Fibonaaci extends Thread{
    public void run(){
        try{
            int first = 0, second = 1;
            int third;
            System.out.println(first);
            System.out.println(second);
            for(int i = 0; i < 8; i++){
                third = first + second;
                first = second;
                second = third;
                System.out.println(third);
            }
        }
        catch(Exception e){
            System.out.println("Some Error Occured with fibonaaci");
        }
    }
}


public class Threads
{
	public static void main(String[] args) {
		Fibonaaci object = new Fibonaaci();
		object.start();
	}
}
