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
	}

}
