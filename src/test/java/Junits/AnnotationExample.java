package Junits;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AnnotationExample {
	
	//private static final BooleanSupplier true = null;
	@BeforeAll
	public static void method3() {
		System.out.println("Run before all tests");
	} 
	@BeforeEach
	public void method2() {
		System.out.println("Run before each test");
	}
	@Test
	public void method1() {
		assertEquals(30,Calc.add(20, 10)); 
		System.out.println("Run test1 - Method 1");
		String[] arr1 = {"one","two","three"};
		String[] arr2 = {"one","two","three"};
		//String result = new String();
		assertArrayEquals(arr1,arr2);
	} 
	
	@Test
	public void method4() {
		assertEquals(10,Calc.minus(20, 10)); 
		System.out.println("Run test2 - method 4");
	}
	@Disabled
	@Test
	public void method5() {
		assertEquals(2.0,Calc.div(20, 10)); 
		System.out.println("Run test3 - method 5");
	} 
	@Disabled
	@Test
	public void method6() {
		assertEquals(200,Calc.mult(20, 10));
		assertTrue(true);
		
		System.out.println("Run test4 - method 6");
	}
	@AfterAll
	public static void method7() {
		System.out.println("Inside After All");		
	}

	
}
