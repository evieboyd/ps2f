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

	@Test
	public void test_isEven() {
		assertEquals(5, false);
	}
	
	@Test
	public void test_isOdd() {
		assertEquals(7, true);
	}
	
	@Test
	public void test_isPrime() {
		assertEquals(7, true);
	}
	
	@Test
	public void test_isEven(int i) {
		assertEquals(8, true);
	}
	
	@Test
	public void test_isOdd(int i) {
		assertEquals(8, false);
	}
	
	@Test
	public void test_isPrime(int i) {
		assertEquals(8, false);
	}
	
	@Test
	public void test_isEven(MyInteger i) {
		assertEquals(8, true);
	}
	
	@Test
	public void test_isOdd(MyInteger i) {
		assertEquals(8, false);
	}
	
	@Test
	public void test_isPrime(MyInteger i) {
		assertEquals(8, false);
	}
	
	@Test
	public void test_equals(int i, int v) {
		int o = 6;
		int p = 6;
		assertEquals(o, p);
	}	
	
	@Test
	public void test_equals(MyInteger i, int v) {
		MyInteger k = new MyInteger(3);
		int m = 7;
		assertEquals(k.getIValue(k), m);
	}
}
