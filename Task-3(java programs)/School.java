import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

interface Inter{
	void addDetails();
	void printDetails();
}

class Management{
    private String name;
    private int id;
    private String designation;
    private int salary;
    private String contactNo;
    private String birthDate;
    
    Management(String name, int id, String designation, int salary, String contactNo, String birthDate){
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.contactNo = contactNo;
        this.birthDate = birthDate;
    }
	
	@Override
	public String toString() {
		return "\nName: " + name + "\nId: " + id + "\nDesignation: " + designation + "\nSalary: " + salary + "\nContactNo: " + contactNo + "\nDOB: " + birthDate;
	}
    
    
}
class Students{
    private String name;
    private int id;
    private String department;
    private String contactNo;
    private String birthDate;
        
    Students(String name, int id, String department, String contactNo, String birthDate){
    this.name = name;
    this.id = id;
    this.department = department;
    this.contactNo = contactNo;
    this.birthDate = birthDate;
    }
		
    @Override
	public String toString() {
		return "\nName: " + name + "\nId: " + id + "\nDepartment: " + department + "\nContactNo: " + contactNo + "\nDOB: " + birthDate;
	}
}
class Teachers{
    private String name;
    private int id;
    private String department;
    private int salary;
    private String contactNo;
    private String birthDate;   
        
    Teachers(String name, int id, String department, int salary, String contactNo, String birthDate){
    this.name = name;
    this.id = id;
    this.department = department;
    this.salary = salary;
    this.contactNo = contactNo;
    this.birthDate = birthDate;
    }
		
	@Override
	public String toString() {
		return "\nName: " + name + "\nId: " + id + "\nDepartment: " + department + "\nSalary: " + salary + "\nContactNo: " + contactNo + "\nDOB: " + birthDate;
	}
        
}

class StudentAD{
	private static ArrayList<Students> student =new ArrayList<Students>();
	
	static void addDetails(Students studnt){
		student.add(studnt);
	}
	
	static ArrayList<Students> getStudentList(){
		return student;
	}
}

class ManagementAD extends StudentAD{
	public static ArrayList<Management> mgmt =new ArrayList<Management>();
	static void addDetails(Management mgmtObj){
		mgmt.add(mgmtObj);
	}
	static ArrayList<Management> getManagementList(){
		return mgmt;
	}
}

class TeachersAD extends StudentAD{
	public static ArrayList<Teachers> teacher =new ArrayList<Teachers>();
	
	static void addDetails(Teachers tObj){
		teacher.add(tObj);
	}
	static ArrayList<Teachers> getTeachersList(){
		return teacher;
	}
}

public class School
{
	public static void main(String[] args) {
		try
        {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } 
		catch (IOException | InterruptedException ex) {}
		System.out.println("Enter your Choice: ");
		System.out.println("1. Add Student Details\n2. Add Teachers Details\n3. Add Management Details\n4. Print Student Details\n5. Print Teachers Details\n6. Print Management Details\n7. Exit");
		
		int input;
		Scanner sc = new Scanner(System.in);
		Students obj1 = new Students("Rajesh",1,"CSE","7799397738","16/12/1999");
		StudentAD.addDetails(obj1);
		Students obj2 = new Students("Abhi",2,"ECE","1234567890","01/01/1999");
		StudentAD.addDetails(obj2);
		Teachers obj3 = new Teachers("Upendra",5201,"CSE",50000,"0987654321","01/01/1978");
		TeachersAD.addDetails(obj3);
		Teachers obj4 = new Teachers("Sathhesh",5202,"CSE",60000,"9876543210","02/02/1978");
		TeachersAD.addDetails(obj4);
		Management obj5 = new Management("Santhosh",0202,"Principal",90000,"8976543210","03/03/1970");
		ManagementAD.addDetails(obj5);
		Management obj6 = new Management("Rajesh V",0205,"Accounts",30000,"7896543210","04/04/1980");
		ManagementAD.addDetails(obj6);
		
		while(true){
			input = sc.nextInt();
			switch(input){
				case 1 : System.out.println("Enter Student Details:");
						 System.out.println("Enter Student's Id: ");
						 int id = sc.nextInt();
						 sc.nextLine();
						 System.out.println("Enter Student's Name: ");
						 String name = sc.nextLine();
						 System.out.println("Enter Student's Department: ");
						 String department = sc.nextLine();
						 System.out.println("Enter Student's phone number: ");
						 String contact = sc.nextLine();
						 System.out.println("Enter Student's Date of Birth: ");
						 String date = sc.nextLine();
						 Students sObj = new Students(name,id,department,contact,date);
						 StudentAD.addDetails(sObj);
						 break;
						 
				case 2 : System.out.println("Enter Teacher Details: ");
						 System.out.println("Enter Teacher's Id:");
						 int tid = sc.nextInt();
						 sc.nextLine();
						 System.out.println("Enter Teacher's Name: ");
						 String tname = sc.nextLine();
						 System.out.println("Enter Teacher's Department: ");
						 String dept = sc.nextLine();
						 System.out.println("Enter Teacher's Salary: ");
						 int tsalary = sc.nextInt();
						 System.out.println("Enter Teacher's PhoneNo: ");
						 String phone = sc.nextLine();
						 sc.nextLine();
						 System.out.println("Enter Teacher's DOB: ");
						 String dob = sc.nextLine();
						 Teachers obT = new Teachers(tname,tid,dept,tsalary,phone,dob);
						 TeachersAD.addDetails(obT);
						 break;
						 
				case 3 : System.out.println("Enter Management Details: ");
						 System.out.println("Enter Id:");
						 int mid = sc.nextInt();
						 sc.nextLine();
						 System.out.println("Enter Name: ");
						 String mname = sc.nextLine();
						 System.out.println("Enter Designation: ");
						 String des = sc.nextLine();
						 System.out.println("Enter Salary: ");
						 int msalary = sc.nextInt();
						 System.out.println("Enter PhoneNo: ");
						 String mphone = sc.nextLine();
						 sc.nextLine();
						 System.out.println("Enter DOB: ");
						 String mdob = sc.nextLine();
						 Management obM = new Management(mname,mid,des,msalary,mphone,mdob);
						 ManagementAD.addDetails(obM);
						 break;
						 
						 
				case 4 : System.out.println("Students Details: ");
						 System.out.println(StudentAD.getStudentList());
						 //StudentAD.printDetails();
						 break;
					
				case 5 : System.out.println("Teachers Details: ");
						 System.out.println(TeachersAD.getTeachersList());
						 //TeachersAD.printDetails();
						 break;
						 
				case 6 : System.out.println("Management Details: ");
						 System.out.println(ManagementAD.getManagementLists());
						 //ManagementAD.printDetails();
						 break;
						 
				case 7 : System.exit(0);
				
				case 8 : System.out.println(StudentAD.getStudentList());
						 break;
			}
			
	}
}
}
