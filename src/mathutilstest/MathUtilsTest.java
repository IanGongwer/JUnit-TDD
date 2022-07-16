package mathutilstest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import mathutils.MathUtils;

public class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils mathUtils = new MathUtils();
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, "The add method should add the two defined numbers.");
	}

	@Test
	void testSubstract() {
		MathUtils mathUtils = new MathUtils();
		int expected = 10;
		int actual = mathUtils.subtract(30, 20);
		assertEquals(expected, actual, "The substract method should substract the two defined numbers.");
	}

	@Test
	void testMultiply() {
		MathUtils mathUtils = new MathUtils();
		int expected = 150;
		int actual = mathUtils.multiply(15, 10);
		assertEquals(expected, actual, "The multiply method should multiply the two defined numbers.");
	}

	@Test
	void testDivide() {
		MathUtils mathUtils = new MathUtils();
		int expected = 2;
		int actual = mathUtils.divide(8, 4);
		assertEquals(expected, actual, "The divide method should divde the two defined numbers.");
	}

	@Test
	void testComputercircleRadius() {
		MathUtils mathUtils = new MathUtils();
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return the correct circle area.");
	}

}
