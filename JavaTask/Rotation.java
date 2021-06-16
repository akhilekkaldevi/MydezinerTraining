import java.util.*;
import java.io.*;
class Rotation
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt();
	    int rotateTime=sc.nextInt();
		List<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<size;i++)
		{
		    arr.add(sc.nextInt());
		}
		for(int j=0;j<rotateTime;j++)
		{
		   int temp=arr.get(0);
		for(int i=0;i<size-1;i++)
		{
		    arr.set(i,arr.get(i+1));
		}
		    arr.set(size-1,temp);
		}
		for(Integer i:arr)
		{
		    System.out.println(i);
		}
		System.out.println();
	}
}

