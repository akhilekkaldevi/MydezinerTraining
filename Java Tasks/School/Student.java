package School;

class Student {
	private int studentId;
	private String studentName;
	private String studentDob;
	private String studentBranch;

	public Student(int studentId, String studentName, String studentDob, String studentBranch) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentDob = studentDob;
		this.studentBranch = studentBranch;
	}

	@Override
	public String toString() {
		return "\nStudent : \n studentId=" + studentId + "\n studentName=" + studentName + "\n studentDob=" + studentDob
				+ "\n studentBranch=" + studentBranch + "\n";
	}
	
	public int getStudentId() {
		return studentId;
	}

	

	public String getStudentName() {
		return studentName;
	}


	public String getStudentDob() {
		return studentDob;
	}


	public String getStudentBranch() {
		return studentBranch;
	}


}
