package week5;

public class LocalVariables {
	int fish = 5;
	static int banana =2;
	final int cake = 3;
	
	public static void main(String[]args) {
		LocalVariables cat = new LocalVariables();
		cat.show();
		cat.display();
		
	}
	public void show() {
		String cat1 = "fubuki " + fish + " ssr " + banana + "cake" + cake;
		System.out.println("gg = " + cat1);
		
	}
	public void display() {
		String cat2 = "fox";
		System.out.println(cat2);
	}
}
