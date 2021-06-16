import java.util.*;
import java.io.*;
import java.util.Scanner;
//Interface
interface Staff
{
    public void teacherDetails();
    void teacherSub();
    String displayTeacherDetails();
}
class StaffDetails implements Staff
{
    Scanner sc=new Scanner(System.in);
     String teacherName,teacherTeachSub;
     int teacherId;
    //override
    public void teacherDetails()
    {
       this.teacherName=sc.nextLine();
       this.teacherId=101;
    }
    /*access modifier*/
    public void teacherSub()
    {
    this.teacherTeachSub=sc.nextLine();
    }
    public String displayTeacherDetails()
    {
        return(this.teacherName+" and his id "+this.teacherId+" and teaches"+" "+this.teacherTeachSub+" to class X");
    }
}
class Management
{
    Scanner sc=new Scanner(System.in);
    String principalName,asstPrincipalName;
    void managementDetails()
    {
        this.principalName=sc.nextLine();
        this.asstPrincipalName=sc.nextLine();
    }
    String display()
    {
        return(this.principalName+" and the vice principal is "+this.asstPrincipalName);
    }
}
class School 
{
    //Constructor
    Scanner sc=new Scanner(System.in);
   School()
   {
    String schoolName=sc.nextLine();
    System.out.println("School name is"+schoolName);
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
    //polymorphism
    void getStudentDetails(String sadminno)
    {
        System.out.println("Student Admission Number is "+sadminno);
    }
}

 class Sample1
 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String sName,sHtno,sClass;
        String studentAdmissionNumber;
        while(true)
        {
            int choice;
            choice=sc.nextInt();
            if(choice==1)
            {
                System.out.println("Get Student Details");
                sName=sc.nextLine();
                sHtno=sc.nextLine();
                sClass=sc.nextLine();
                Student studentObject=new Student(sName,sHtno,sClass);
                studentObject.getStudentDetails();
                studentAdmissionNumber=sc.nextLine();
                studentObject.getStudentDetails(studentAdmissionNumber);
            }
            else if(choice==2)
            {
                System.out.println("Get Employee Details");
                StaffDetails staffObject=new StaffDetails();
                staffObject.teacherSub();
                staffObject.teacherDetails();
                System.out.println(staffObject.displayTeacherDetails());
            }
            else if(choice==3){
                System.out.println("Get Management Details");
                Management managementObject=new Management();
                managementObject.managementDetails();
                System.out.println(managementObject.display());
            }
            else {
                break;
            }
        }
    }
    
}
