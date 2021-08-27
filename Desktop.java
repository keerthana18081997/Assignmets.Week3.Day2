package week3assignments;

public class Desktop implements Hardware,Software {
public void desktopmodel() {
	System.out.println("HP Model");
	
}
public void softwareResources(int e, int f, String soft) {
	// TODO Auto-generated method stub
	System.out.println("the softwares are ************************ windows*************");
}
public void hardwareResources(int a, int b, String name) {
	// TODO Auto-generated method stub
System.out.println("**************************** cpu and keyboard and mouse *************************");	
}
public static void main(String[] args) {
	 Desktop obj=new Desktop();
	 obj.desktopmodel();
	 obj.softwareResources(5, 8, "software");
	 obj.hardwareResources(9, 8, "hardware");
}
}
