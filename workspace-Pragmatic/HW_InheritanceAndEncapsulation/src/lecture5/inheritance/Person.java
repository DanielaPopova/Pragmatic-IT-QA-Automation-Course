package lecture5.inheritance;

public abstract class Person {
	
	private String name;
	private int age;
	private Gender gender;
	
	public Person(String name, int age, Gender gender) {
		this.setName(name);
		this.setAge(age);
		this.gender = gender;
	}	

	public String getName() {
		return this.name;
	}
	
	private void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("Name cannot be null!");
		}
		
		if (name.length() < 3 || name.length() > 30) {
			throw new IllegalArgumentException("Invalid length for name!");
		}
		
		if(!name.matches("[a-zA-Z]+")){
			throw new IllegalArgumentException("Invalid symbols for name!");
		}
		
		this.name = name;
	}	

	public int getAge() {
		return this.age;
	}	

	private void setAge(int age) {
		if (age < 0 || age > 120) {
			throw new IllegalArgumentException("Invalid age!");
		}
		
		this.age = age;
	}
	
	public Gender getGender() {
		return this.gender;
	}
	
	public String showInfo(){
		StringBuilder info = new StringBuilder();		
		info.append("Name: " + this.name);
		info.append(System.lineSeparator());
		info.append("Age: " + this.age);
		info.append(System.lineSeparator());
		info.append("Gender: " + this.gender);
		info.append(System.lineSeparator());
		
		return info.toString();
	}
}
