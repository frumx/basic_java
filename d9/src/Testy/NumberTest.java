package Testy;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NumberTest {
	private Number number;
	private List<Integer> testData;

	@Before
	public void setUp() throws Exception {
		number = new Number();
		testData = new ArrayList<Integer>();
		testData.add(2);
		testData.add(5);
		testData.add(3);
	}

	@After
	public void tearDown() throws Exception {
		number = null;
	}

	@Test
	public void testSum() {
		int score = number.sumNmbers(testData);
		assertEquals(10, score);
	}
	
	@Test
	public void testNWD() {
		int score = Number.NWD(15,10);
		assertEquals(5, score);
	}	
}
