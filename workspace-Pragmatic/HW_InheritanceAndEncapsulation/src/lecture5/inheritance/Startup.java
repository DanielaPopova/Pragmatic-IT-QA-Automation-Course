package lecture5.inheritance;

public class Startup {

	public static void main(String[] args) {
		Person[] people =  {
				new Student("Ivan", 20, Gender.male, 4.0),
				new Student("Maria", 18, Gender.female, 6.0),
				new Student("Peter", 19, Gender.male, 5.0),
				new Student("Tania", 21, Gender.female, 5.5),
				new Student("George", 20, Gender.male, 3.0),
				new Employee("Petrov", 17, Gender.male, 40.0),
				new Employee("Ivanova", 26, Gender.female, 55.0),
				new Employee("Kirov", 30, Gender.male, 60.0),
				new Employee("Simova", 33, Gender.female, 90.0),
				new Employee("Peshev", 22, Gender.male, 50.0)};	
		
		for (Person person : people) {
			System.out.println(person.showInfo());
		}
		
		for (Person person : people) {
			if (person instanceof Employee) {
				double overtimePayment = ((Employee) person).calculateOvertime(2.0);
				System.out.println(person.getName() + " due payment: " + overtimePayment + "lv.");
			}
		}
	}
}
