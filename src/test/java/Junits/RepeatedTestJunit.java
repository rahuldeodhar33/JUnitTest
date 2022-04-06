package Junits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestJunit {
	@RepeatedTest(3)
	public void method() {
		assertEquals(10,Calc.minus(20, 10)); 
		System.out.println("Run test1 - method");
	}
	

}
