import java.util.*;
import java.io.*;
class Rotation
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt();
	    int rotateTime=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
		    arr[i]=sc.nextInt();
		}
		//int temp=a[0];
		for(int j=0;j<rotateTime;j++)
		{
		   int temp=arr[0];
		for(int i=0;i<size-1;i++)
		{
		    arr[i]=arr[i+1];
		}
		    arr[size-1]=temp;
		}
		for(int i=0;i<size;i++)
		{
		    System.out.println(arr[i]);
		}
		System.out.println();
	}
}

