package JavaTask;
import java.util.*;
import java.io.*;
import java.util.Scanner;
//Interface
interface Staff
{
    void teacherDetails();
    void teachersub();
    String displayTeacherDetails();
}
class StaffDetails implements Staff
{
    Scanner sc3=new Scanner(System.in);
     String teachername,teacherteachsub;
     int teacherid;
    //override
    public void teacherDetails()
    {
       this.teachername=sc3.nextLine();
       this.teacherid=101;
    }
    public void teachersub()
    {
    this.teacherteachsub=sc3.nextLine();
    }
    public String displayTeacherDetails()
    {
        return(this.teachername+" and his id "+this.teacherid+" and teaches"+" "+this.teacherteachsub+" to class X");
    }
}
class Management
{
    Scanner sc1=new Scanner(System.in);
    String principalname,asstprincipalname;
    void managementDetails()
    {
        this.principalname=sc1.nextLine();
        this.asstprincipalname=sc1.nextLine();
    }
    String display()
    {
        return("principal is "+this.principalname+" and the vice principal is "+this.asstprincipalname);
    }
}
class School
{
    //Constructor
    Scanner sc2=new Scanner(System.in);
   School()
   { 
    String scname=sc2.nextLine();
    System.out.println("School name is"+scname);
}
}
class Student extends School{
    String sname,shtno,sclass;
    Student(String sname,String shtno,String sclass)
    {
        super();
        this.sname=sname;
        this.shtno=shtno;
        this.sclass=sclass;
    }
    void getStudentDetails()
    {
        System.out.println(this.sname+" "+this.shtno+" "+this.sclass);
    }
}
 class Sample
 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String sname,shtno,sclass;
        while(true)
        {
            int choice;
            choice=s.nextInt();
            if(choice==1)
            {
                System.out.println("Get Student Details");
                sname=s.nextLine();
                shtno=s.nextLine();
                sclass=s.nextLine();
                Student st=new Student(sname,shtno,sclass);
                st.getStudentDetails();
            }
            else if(choice==2)
            {
                System.out.println("Get Employee Details");
                StaffDetails st1=new StaffDetails();
                st1.teachersub();
                st1.teacherDetails();
                System.out.println(st1.displayTeacherDetails());
            }
            else if(choice==3){
                System.out.println("Get Management Details");
                Management m=new Management();
                m.managementDetails();
                System.out.println(m.display());
            }
            else {
                break;
            }
        }
    }
    
}
