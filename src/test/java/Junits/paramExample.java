package Junits;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class paramExample {
	@ParameterizedTest
	@ValueSource(strings = {"rahul","radar","racecar"})
	public void test1(String name) {
		assertTrue(StringFunction.isPalindrom(name));
	}
	
	@ParameterizedTest
	@EnumSource (Month.class)
	public void test2(Month month) {
		int monVal = month.getValue();
		System.out.println(monVal);
		assertTrue(monVal<=12);
	}
	@ParameterizedTest
	@EnumSource (value=Month.class, names= {"APRIL","JUNE","SEPTEMBER","NOVEMBER"})
	public void test3(Month month) {
		assertEquals(30,month.length(false));
	}
	@ParameterizedTest
	@EnumSource (value=Month.class, names= {"FEBRUARY"})
	public void test4(Month month) {
		assertEquals(29,month.length(true));
	}
	
	@ParameterizedTest
	@MethodSource("DPData")
	public void test5(String name) {
		assertTrue(StringFunction.isPalindrom(name));
	}
	
	public static Stream<String> DPData(){
		return Stream.of("radar","mom","dad");
		
	}
	
}
