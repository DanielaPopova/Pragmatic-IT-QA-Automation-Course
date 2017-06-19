package lecture5.inheritance;

public class Student extends Person{
	
	private static final double MIN_SCORE = 2;
	private static final double MAX_SCORE = 6;
	
	private double score;
	
	public Student(String name, int age, Gender gender, double score) {
		super(name, age, gender);
		this.setScore(score);
	}
	
	public double getScore() {
		return this.score;
	}

	private void setScore(double score){
		if(score < MIN_SCORE || score > MAX_SCORE){
			throw new IllegalArgumentException("Score is between 2 and 6!");
		}
		
		this.score = score;
	}
	
	@Override
	public String showInfo() {
		
		StringBuilder info = new StringBuilder(super.showInfo());
		info.append("Score: " + this.score);
		info.append(System.lineSeparator());
		
		return info.toString();
	}
}
