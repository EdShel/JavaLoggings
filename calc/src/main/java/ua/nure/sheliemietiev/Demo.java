package ua.nure.sheliemietiev;

public class Demo {
	public static void main(String[] args) {
		final int x = 100;
		final int y = 5;
		
		System.out.printf("x = %d, y = %d%n", x, y);
		System.out.printf("Calc.add %d%n", Calc.add(x, y));
		System.out.printf("Calc.sub %d%n", Calc.sub(x, y));
		System.out.printf("Calc.div %d%n", Calc.div(x, y));
		System.out.printf("Calc.mul %d%n", Calc.mul(x, y));
	}
}
