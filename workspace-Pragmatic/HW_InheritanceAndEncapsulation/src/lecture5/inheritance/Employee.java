package lecture5.inheritance;

public class Employee extends Person{	
	
	private double dailySalary;
	
	public Employee(String name, int age, Gender gender, double daySalary) {
		super(name, age, gender);
		this.dailySalary = daySalary;
	}
	
	public double getDailySalary() {
		return this.dailySalary;
	}

	public double calculateOvertime(double hours){
		if(this.getAge() <= 18){
			this.dailySalary += 0;
		} else {
			double paymentPerHour = this.calculateDailyPaymentPerHour(8.0);
			this.dailySalary += paymentPerHour * hours;
		}		
		
		return this.dailySalary;
	}
	
	@Override
	public String showInfo() {
		StringBuilder info = new StringBuilder(super.showInfo());
		info.append("Daily Salary: " + this.dailySalary);
		info.append(System.lineSeparator());
		
		return info.toString();
	}
	
	private double calculateDailyPaymentPerHour(double standardWorkingHours){
		double paymentPerHour = this.dailySalary / standardWorkingHours;
		
		return paymentPerHour;
	}
}
