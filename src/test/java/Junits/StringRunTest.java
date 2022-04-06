package Junits;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;


public class StringRunTest {
	@Tag("Sanity")
	@Test
	public void test1() {
		assertTrue(StringFunction.isPalindrom("madam"));
	}
	@Tag("Sanity")
	@Test
	public void test2() {
		assertFalse(StringFunction.isPalindrom("push"));
	}
		
}
