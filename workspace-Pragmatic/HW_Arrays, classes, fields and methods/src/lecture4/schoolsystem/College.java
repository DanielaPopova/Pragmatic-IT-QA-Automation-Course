package lecture4.schoolsystem;

import java.util.List;

public class College {

	public static void main(String[] args) {
		
		Student ivan = new Student("Ivan", "Mathematics", 19);
		ivan.setGrade(5.0);
		Student gosho = new Student("Georgi", "mathematics", 19);
		gosho.setGrade(3.0);
		Student petia = new Student("Petia", "mathematics", 20);
		petia.setGrade(5.5);
		Student misho = new Student("Mihail", "mathematics", 22);
		misho.setGrade(5.5);
		Student mimi = new Student("Maria", "Analytical Chemistry", 18);
		Student pesho = new Student("Pesho", "Physics", 21);
		
		ivan.receiveScholarship(4, 120);
		System.out.println("Current amount of money " + ivan.getMoney());
		
		pesho.receiveScholarship(5,  120);
		System.out.println("Current amount of money " + pesho.getMoney());
		
		System.out.println("Year in college: " + mimi.getYearInCollege());
		mimi.upYear();
		System.out.println(mimi.isDegree());
		System.out.println("Year in college: " + mimi.getYearInCollege());
		
		mimi.setYearInCollege(4);
		mimi.upYear();
		System.out.println(mimi.isDegree());

		StudentGroup groupMaths = new StudentGroup("Mathematics");
		// won't print anything
		groupMaths.printStudentsInGroup(); 
		
		groupMaths.addStudent(ivan);
		groupMaths.addStudent(gosho);
		groupMaths.addStudent(petia);
		groupMaths.addStudent(misho);
		// message "... cannot enter"
		groupMaths.addStudent(mimi);
		groupMaths.printStudentsInGroup();
		
		System.out.println("Best student(s):");
		List<String> bestStudentsNames = groupMaths.getBestStudents();
		for (String studentName : bestStudentsNames) {
			System.out.println(studentName);
		}
	}
}
