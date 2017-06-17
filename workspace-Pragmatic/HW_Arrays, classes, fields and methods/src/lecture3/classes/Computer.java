package lecture3.classes;

public class Computer {
	
	private int year;
	private double price;
	private boolean isNotebook;
	private double hardDiskMemory;
	private double freeMemory;
	private String operationSystem;
	
	public Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}
	
	public Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}
	
	public Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem) {
		this(year, price, hardDiskMemory, freeMemory);
		this.isNotebook = isNotebook;
		this.operationSystem = operationSystem;
	}
	
	// TODO: add validations
	public int getYear() {
		return this.year;
	}
	
	public void setYear(int year) {		
		this.year = year;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean isNotebook() {
		return this.isNotebook;
	}
	
	public void setNotebook(boolean isNotebook) {
		this.isNotebook = isNotebook;
	}
	
	public double getHardDiskMemory() {
		return this.hardDiskMemory;
	}
	
	public void setHardDiskMemory(double hardDiskMemory) {
		this.hardDiskMemory = hardDiskMemory;
	}
	
	public double getFreeMemory() {
		return this.freeMemory;
	}
	
	public void setFreeMemory(double freeMemory) {
		this.freeMemory = freeMemory;
	}
	
	public String getOperationSystem() {
		return this.operationSystem;
	}
	
	// basically changeOperasionSystem method
	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}
	
	public void useMemory(double memory){
		if(memory > this.freeMemory){
			System.out.println("Not enough free memory!");
		} else {
			this.freeMemory -= memory;
		}			
	}
	
	public int comparePrice(Computer computer){
		if(this.price > computer.price){
			return -1;
		} else if (this.price < computer.price){
			return 1;
		} else {
			return 0;
		}	
	}
	
	@Override
	public String toString() {
		String info = "Computer info:\n" + "Year: " + this.getYear() + "\nPrice: " + this.getPrice() + "$" + "\nIs notebook: " + this.isNotebook() + 
				"\nHard Disk Memory: " + this.getHardDiskMemory() + "\nFree memory: " + this.getFreeMemory() + "\nOS: " + this.getOperationSystem();
		
		return info;
	}
	
}
