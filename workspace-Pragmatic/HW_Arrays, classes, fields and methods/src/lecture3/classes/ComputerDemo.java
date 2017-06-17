package lecture3.classes;

public class ComputerDemo {

	public static void main(String[] args) {
		
		Computer lenovo = new Computer();
		lenovo.setYear(2015);
		lenovo.setPrice(500);
		lenovo.setNotebook(true);
		lenovo.setHardDiskMemory(650);
		lenovo.setFreeMemory(300);
		lenovo.setOperationSystem("Windows 8");
		
		System.out.println(lenovo.toString());
		
		Computer asus = new Computer();
		asus.setYear(2016);
		asus.setPrice(1000);
		asus.setNotebook(false);
		asus.setHardDiskMemory(1128);
		asus.setFreeMemory(500);
		asus.setOperationSystem("Windows 7 Utimate");
		
		System.out.println(asus.toString());
		
		lenovo.useMemory(100);
		System.out.println(lenovo.getFreeMemory());
		lenovo.useMemory(300);
		System.out.println(lenovo.getFreeMemory());
		
		asus.setOperationSystem("Windows 10");
		System.out.println(asus.getOperationSystem());
		
		// task from lecture 4
		Computer acer = new Computer();
		Computer toshiba = new Computer(2016, 550, 500, 200);
		Computer apple = new Computer(2014, 800, true, 256, 120, "OS X Yosemite");
		
		int comparator = toshiba.comparePrice(apple);
		
		if(comparator == 1){
			System.out.println("Apple has bigger price than toshiba");
		} else if (comparator == -1){
			System.out.println("Toshiba has bigger price than apple");
		} else {
			System.out.println("Both computers have equal price");
		}
	}
}
