import java.util.*;
import java.io.*;
class Rotation
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt();
	    int rotation_time=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++)
		{
		    a[i]=sc.nextInt();
		}
		//int temp=a[0];
		for(int j=0;j<rotation_time;j++)
		{
		   int temp=a[0];
		for(int i=0;i<size-1;i++)
		{
		    a[i]=a[i+1];
		}
		    a[size-1]=temp;
		}
		for(int i=0;i<size;i++)
		{
		    System.out.println(a[i]+" ");
		}
		System.out.println();
	}
}

