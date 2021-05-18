/*Write a program to generate threads 
-To display 10 terms of fibonacci series
-To Read multiple files from a location and write the content of each file to the same destination file by appending each time.
*/



public class FibonacciThread {
	public static void main(String[] args) {
		fibonacci f=new fibonacci();
		f.start();
	}
}

class fibonacci extends Thread {
	@Override
	public void run() {
		int a = 0, b = 1, c=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<10;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}
}
