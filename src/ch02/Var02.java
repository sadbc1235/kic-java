package ch02;

public class Var02 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c;
		
		c = a + b;
		System.out.println(c);
		
		name01("현미");
		name02();

	}
	
	public static void name01(String line) {
		System.out.println(line+"밥 했습니다.");
	}
	public static void name02() {
		System.out.println("콩나무 했습니다.");
	}

}
