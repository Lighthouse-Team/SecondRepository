package com.project;

public class Teacher {

	private Integer studentId; // id
	private String studentName;

	public Teacher() {
		super();
	}

	public Teacher(Integer studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public Integer getStudentId() {
		return studentId;
	}
	
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Teacher [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
}
