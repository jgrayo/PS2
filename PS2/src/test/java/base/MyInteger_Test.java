package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
//tests for methods with no parameter
	@Test
	//should return true
	public void test() {
		assertTrue(MyInteger.isEven(4));
	}
	
	@Test
	//should return false 
	public void test2() {
		assertTrue(MyInteger.isEven(5));
	}
	
	@Test
	//should return false
	public void test3() {
		assertTrue(MyInteger.isOdd(2));
	}
	
	@Test
	//should return true
	public void test4() {
		assertTrue(MyInteger.isOdd(7));
	}
	
	@Test
	//should return True
	public void test5(){
		assertTrue(MyInteger.isPrime(5));
	}
	
	@Test
	//should return False
	public void test6(){
		assertTrue(MyInteger.isPrime(8));
	}
	
	@Test
	//should return False
		public void test7(){
			assertTrue(MyInteger.isPrime(10));
		}
	@Test
	//should return True
		public void test8(){
			assertTrue(MyInteger.isPrime(11));
	}
	
}










