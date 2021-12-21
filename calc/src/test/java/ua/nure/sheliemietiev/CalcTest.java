package ua.nure.sheliemietiev;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
	
	@Test
	public void addPositiveNumbers() {
		final int x = 5;
		final int y = 4;
		
		int result = Calc.add(x, y);
		
		Assert.assertEquals(9, result);
	}

	@Test
	public void addNegativeNumbers() {
		final int x = -1;
		final int y = -10;
		
		int result = Calc.add(x, y);
		
		Assert.assertEquals(-11, result);
	}
	
	@Test
	public void addPositiveAndNegativeNumbers() {
		final int x = 1;
		final int y = -10;
		
		int result = Calc.add(x, y);
		
		Assert.assertEquals(-9, result);
	}
	
	@Test
	public void subPositiveNumbers() {
		final int x = 5;
		final int y = 4;
		
		int result = Calc.sub(x, y);
		
		Assert.assertEquals(1, result);
	}

	@Test
	public void subNegativeNumbers() {
		final int x = -1;
		final int y = -10;
		
		int result = Calc.sub(x, y);
		
		Assert.assertEquals(9, result);
	}
	
	@Test
	public void subPositiveAndNegativeNumbers() {
		final int x = 1;
		final int y = -10;
		
		int result = Calc.sub(x, y);
		
		Assert.assertEquals(11, result);
	}
	
	@Test
	public void divPositiveNumbers() {
		final int x = 10;
		final int y = 2;
		
		int result = Calc.div(x, y);
		
		Assert.assertEquals(5, result);
	}

	@Test
	public void divNegativeNumbers() {
		final int x = -100;
		final int y = -10;
		
		int result = Calc.div(x, y);
		
		Assert.assertEquals(10, result);
	}
	
	@Test
	public void divWhenDivisorIsZero() {
		final int x = 1;
		final int y = 0;
		
		Assert.assertThrows(ArithmeticException.class, () -> Calc.div(x, y));
	}
	
	@Test
	public void mulPositiveNumbers() {
		final int x = 5;
		final int y = 4;
		
		int result = Calc.mul(x, y);
		
		Assert.assertEquals(20, result);
	}

	@Test
	public void mulNegativeNumbers() {
		final int x = -1;
		final int y = -10;
		
		int result = Calc.mul(x, y);
		
		Assert.assertEquals(10, result);
	}
	
	@Test
	public void mulPositiveAndNegativeNumbers() {
		final int x = 1;
		final int y = -10;
		
		int result = Calc.mul(x, y);
		
		Assert.assertEquals(-10, result);
	}
}
