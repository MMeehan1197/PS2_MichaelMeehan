package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import base.MyInteger;

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
	public void test() {
		MyInteger two = new MyInteger(2);
		MyInteger nine = new MyInteger(9);
		
		assertEquals(two.getiValue(), 2);
		
		assertEquals(two.isEven(), true);
		assertEquals(nine.isEven(), false);
		assertEquals(MyInteger.isEven(2), true);
		assertEquals(MyInteger.isEven(9), false);
		assertEquals(MyInteger.isEven(two), true);
		assertEquals(MyInteger.isEven(nine), false);
		
		assertEquals(two.isOdd(), false);
		assertEquals(nine.isOdd(), true);
		assertEquals(MyInteger.isOdd(2), false);
		assertEquals(MyInteger.isOdd(9), true);
		assertEquals(MyInteger.isOdd(two), false);
		assertEquals(MyInteger.isOdd(nine), true);
		
		assertEquals(two.isPrime(), true);
		assertEquals(nine.isPrime(), false);
		assertEquals(MyInteger.isPrime(2), true);
		assertEquals(MyInteger.isPrime(9), false);
		assertEquals(MyInteger.isPrime(two), true);
		assertEquals(MyInteger.isPrime(nine), false);
		
		assertEquals(two.isEqual(2), true);		
		assertEquals(nine.isEqual(2), false);
		assertEquals(two.isEqual(nine), false);
		assertEquals(two.isEqual(two), true);
		
	}

}
