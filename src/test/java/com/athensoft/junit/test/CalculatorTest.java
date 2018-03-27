package com.athensoft.junit.test;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.athensoft.junittest.Calculator;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	 private static Calculator calculator = new Calculator();

	    // 复原操作，表明对每个Test方法测试以后都会进行这个方法操作。
	    @Before
	    public void setUp() throws Exception {
	        calculator.clear();// 结果清零
	    }

	    @Test
	    public void testAdd() {
	        // fail("Not yet implemented");
	        calculator.add(2);
	        calculator.add(3);
	        assertEquals(5, calculator.getResult());
	    }

	    @Test
	    public void testSubstract() {
	        // fail("Not yet implemented");
	        calculator.add(10);
	        calculator.substract(2);
	        assertEquals(8, calculator.getResult());
	    }

	    
	    @Test
	    public void testMultiply() {
	        calculator.add(3);
	        calculator.multiply(5);
	        assertEquals(15, calculator.getResult());
	    }

	    @Test
	    public void testDivide() {
	        // fail("Not yet implemented");
	        calculator.add(8);
	        calculator.divide(2);
	        assertEquals(4, calculator.getResult());
	    }

	    @Test
	    public void testSquareRoot() {
	        calculator.squareRoot(4);
	        assertEquals(2, calculator.getResult());

	    }

	   
	    @Test
	    public void testsquare1() {
	        calculator.square(2);
	        assertEquals(4, calculator.getResult());
	        
	    }

	    @Test
	    public void testsquare2() {
	        calculator.square(0);
	        assertEquals(0, calculator.getResult());
	    }

	    @Test
	    public void testsquare3() {
	        calculator.square(-3);
	        assertEquals(9, calculator.getResult());
	    }
}
