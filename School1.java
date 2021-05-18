import java.util.*;
import java.io.*;
import java.security.cert.TrustAnchor;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

//Interface
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
    //override
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
    //Constructor
    Scanner sc=new Scanner(System.in);
   School()
   { 
       String scname=sc.nextLine();
       System.out.println("School name is"+scname);
}
}
class Student{
    String sname,shtno,sclass;
    Student(String sname,String shtno,String sclass)
    {
        this.sname=sname;
        this.shtno=shtno;
        this.sclass=sclass;
    }
    void getStudentDetails()
    {
        System.out.println(this.sname+" "+this.shtno+" "+this.sclass);
    }
}
 class Sample{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        School sco=new School();
        int choice;
        while(true)
        {
            try{
                choice=sc.nextInt();
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("choice:");
                sc.next();
            }
        }
        while(true)
        {
            if(choice==1)
            {
                String sname,shtno,sclass;
                System.out.println("Get Student Details");
                sname=sc.nextLine();
                shtno=sc.nextLine();
                sclass=sc.nextLine();
                Student st=new Student(sname,shtno,sclass);
                st.getStudentDetails();
            }
            else if(choice==2)
            {
                System.out.println("Get Employee Details");
                StaffDetails st1=new StaffDetails();
                st1.teachersub();
                st1.teacherDetails();
            }
            else{
                System.out.println("Get Management Details");
                Management m=new Management();
                m.display();
            }
        }
    }
    
}
