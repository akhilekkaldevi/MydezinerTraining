import java.util.*;
class Fibonacci extends Thread{
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c;
        int n=sc.nextInt();
        while(n>0)
        {
        c=a+b;
        a=b;
        b=c;
        System.out.println(c);
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {  
        System.out.println(e);  
    } 
        n--;
        }
    }
}
class Main1{
public static void main(String []args)
{
    Fibonacci fb=new Fibonacci();
    fb.start();
}
}
