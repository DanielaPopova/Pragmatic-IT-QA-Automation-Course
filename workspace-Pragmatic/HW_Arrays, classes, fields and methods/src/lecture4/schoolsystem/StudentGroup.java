package lecture4.schoolsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentGroup {
	
	private static final int MAX_STUDENTS = 5;
	
	private String subject;
	private Student[] students;
	private int freePlaces;
	
	public StudentGroup() {
		this.students = new Student[MAX_STUDENTS];
		this.freePlaces = MAX_STUDENTS;
	}
	
	public StudentGroup(String subject){
		this();
		this.setSubject(subject);
	}
	
	public String getSubject() {
		return this.subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public int getFreePlaces() {
		return this.freePlaces;
	}
	
	public void setFreePlaces(int freePlaces) {
		this.freePlaces = freePlaces;
	}
	
	public void addStudent(Student student){
		if(this.getSubject().toLowerCase().equals(student.getSubject().toLowerCase()) && 
		   this.freePlaces > 0 && this.freePlaces <= MAX_STUDENTS){
			for (int i = 0; i < this.students.length; i++) {
				if(this.students[i] == null){
					this.students[i] = student;
					this.freePlaces--;
					break;
				}
			}
		} else {
			System.out.println(student.getName() + " cannot enter this group!");
		}
	}
	
	public void emptyGroup(){
		this.students = new Student[MAX_STUDENTS];
		this.freePlaces = MAX_STUDENTS;
	}
	
	// if more than one student has max grade
	public List<String> getBestStudents(){
		
		double maxGrade =  Arrays.asList(this.students).stream()
				.filter(st -> st != null)
				.max((st1, st2) -> Double.compare(st1.getGrade(), st2.getGrade()))
				.get()
				.getGrade();
		
		List<String> bestStudentsNames = new ArrayList<String>();
		
		for (Student student : this.students) {
			if(student != null){
				if(student.getGrade() == maxGrade){
					bestStudentsNames.add(student.getName());
				}
			}			
		}
		
		return bestStudentsNames;
	}
	
	public void printStudentsInGroup(){			
		for (Student student : this.students) {
			if(student != null){
				System.out.println(student.toString());
			}				
		}
	}
}
