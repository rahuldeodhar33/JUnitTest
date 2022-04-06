package Junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;

public class CalcTest {
	@Tag("Sanity")
	@Test
	public void addTest1() {
		assertEquals(30,Calc.add(20, 10)); 
	}
	@Tag("Sanity")
	@Test
	public void minusTest1() {
		assertEquals(10,Calc.minus(20, 10)); 
	}
	@Tag("Sanity")
	@Test
	public void devTest1() {
		assertEquals(2.0,Calc.div(20, 10)); 
	}
	@Tag("Sanity")
	@Test
	public void multTest1() {
		assertEquals(200,Calc.mult(20, 10)); 
	}




}
