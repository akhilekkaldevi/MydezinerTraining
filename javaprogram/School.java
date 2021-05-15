import java.util.*;
import java.io.*;
import java.util.Scanner;
interface Staff
{
    void teacherDetails();
    void teachersub();
    String displayTeacherDetails();
}
class StaffDetails implements Staff
{
    Scanner sc=new Scanner(System.in);
     String teachername,teacherteachsub;
     int teacherid;
    public void teacherDetails()
    {
       this.teachername=sc.nextLine();
       this.teacherid=101;
    }
    public void teachersub()
    {
    this.teacherteachsub=sc.nextLine();
    }
    public String displayTeacherDetails()
    {
        return(this.teachername+" and his id "+this.teacherid+" and teaches"+" "+this.teacherteachsub+" to class X");
    }
}
class Management
{
    Scanner sc=new Scanner(System.in);
    String principalname,asstprincipalname;
    void managementDetails()
    {
        this.principalname=sc.nextLine();
        this.asstprincipalname=sc.nextLine();
    }
    String display()
    {
        return(this.principalname+" and the vice principal is "+this.asstprincipalname);
    }
}
class School
{
   School()
   {
       Management m=new Management();
       m.managementDetails();
        StaffDetails st=new StaffDetails();
       st.teacherDetails();
       st.teachersub();
       //System.out.println("The principal alloted teacher to student is"+st.teachersub());
       System.out.println("The Principal of Hyderabad public school is"+" "+m.display());
       System.out.println("The principal alloted teacher to student is"+st.displayTeacherDetails());

}
}
 class Sample{
    public static void main(String[] a)
    {
        Scanner sc=new Scanner(System.in);
        School s=new School();
    }
    
}
