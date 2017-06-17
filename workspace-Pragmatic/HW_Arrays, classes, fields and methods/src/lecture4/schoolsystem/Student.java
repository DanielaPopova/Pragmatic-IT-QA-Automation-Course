package lecture4.schoolsystem;

public class Student {
	
	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;
	
	public Student() {
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}
	
	public Student(String name, String subject, int age){
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSubject() {
		return this.subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public double getGrade() {
		return this.grade;
	}
	
	public void setGrade(double grade) {
		if(grade < 2.0 || grade > 6.0){
			throw new IllegalArgumentException("Grade is between 2 and 6!");
		}
		
		this.grade = grade;
	}
	
	public int getYearInCollege() {
		return this.yearInCollege;
	}
	
	public void setYearInCollege(int yearInCollege) {
		this.yearInCollege = yearInCollege;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isDegree() {
		return this.isDegree;
	}
	
	public void setDegree(boolean isDegree) {
		this.isDegree = isDegree;
	}
	
	public double getMoney() {
		return this.money;
	}
	
	public void setMoney(double money) {
		this.money = money;
	}
	
	public void upYear(){		
		if (this.yearInCollege >= 4) {
			this.isDegree = true;
		}
		
		if(!this.isDegree){
			this.yearInCollege++;
		} else {
			System.out.println("Student has already graduated!");
		}	
	}
	
	public double receiveScholarship(double minResults, double amount){
		if(this.getGrade() >= minResults && this.age < 30){
			this.money += amount;
		} else {
			System.out.println(this.getName() + " cannot receive scholarship!");
		}
		
		return this.money;
	}
	
	@Override 
	public String toString() {
		
		StringBuilder info = new StringBuilder();
		
		info.append("Student name: " + this.getName());
		info.append(System.lineSeparator());
		info.append("Subject: " + this.getSubject());
		info.append(System.lineSeparator());
		info.append("Grade: " + this.getGrade());
		info.append(System.lineSeparator());
		info.append("Year in college: " + this.getYearInCollege());
		info.append(System.lineSeparator());
		info.append("Age: " + this.getAge());
		info.append(System.lineSeparator());
		info.append("Is graduated: " + this.isDegree());
		info.append(System.lineSeparator());
		info.append("Money: " + this.getMoney());
		info.append(System.lineSeparator());
		
		return info.toString();
	}	
}
