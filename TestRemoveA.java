package com.epam.test;A
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestRemoveA {
  
    	@Test
	public void test1() {
	RemoveA r = new RemoveA();
	String actual = r.removeA("A");
	assertEquals("",actual);
	
	}

	
	@Test
	public void test1() {
	RemoveA r = new RemoveA();
	String actual = r.removeA("AACD");
	assertEquals("CD",actual);
	
	}
	
	@Test
	public void test2() {
	RemoveA r = new RemoveA();
	String actual = r.removeA("BBAA");
	assertEquals("BBAA",actual);
	}
	
	@Test
	public void test3() {
	RemoveA r = new RemoveA();
	String actual = r.removeA("BACD");
	assertEquals("BCD",actual);
	}
	
	@Test
	public void test4() {
	RemoveA r = new RemoveA();
	String actual = r.removeA("AABAA");
	assertEquals("BAA",actual);
	}
	
	@Test
	public void test5() {
	RemoveA r = new RemoveA();
	String actual = r.removeA("ABCD");
	assertEquals("BCD",actual);
	}
	

}
