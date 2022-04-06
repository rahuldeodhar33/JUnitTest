package Junits;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assumptions.assumeFalse;

public class Assumptions {
	
	@BeforeAll
	public static void setup() {
		System.setProperty("env", "dev");
	}
	@Test
	public void test1() {
		assumeTrue("dev".equals(System.getProperty("env")));
		assertTrue(StringFunction.isPalindrom("madam"));
		assertTrue(StringFunction.isPalindrom("rahul"));
	}
}
