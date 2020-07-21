package org.devops.cicdpipeline;

import org.devops.cicdpipeline.controller.Calculator;
import org.devops.cicdpipeline.controller.Message;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CicdPipelineApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testMessage() {
		Message msg = new Message();
		System.out.println("Testing If message is 'Hello, World'");
		Assertions.assertEquals(msg.sayHello(), "Hello, World");
	}
	
	@Test
	public void testNotMessage() {
		Message msg = new Message();
		System.out.println("Testing If message is not 'Hello'");
		Assertions.assertNotEquals("Hello", msg.sayHello());
	}
	
	@Test
	public void testAddition() {
		Calculator cal = new Calculator();
		System.out.println("Testing addition");
		Assertions.assertEquals(cal.addition(), 20);
	}
	
	@Test
	public void testNotAddition() {
		Calculator cal = new Calculator();
		System.out.println("Testing if addition is other than 20");
		Assertions.assertFalse(cal.addition()!=20);
	}
	
	@Test
	public void testMultiplication() {
		Calculator cal = new Calculator();
		System.out.println("Testing multiplication");
		Assertions.assertEquals(cal.multiplication(), 100);
	}
	
	@Test
	public void testNotMultiplication() {
		Calculator cal = new Calculator();
		System.out.println("Testing if multiplicationis other than 100");
		Assertions.assertFalse(cal.multiplication()!=100);
	}
	
	@Test
	public void testDivision() {
		Calculator cal = new Calculator();
		System.out.println("Testing division");
		Assertions.assertEquals(cal.division(), 10);
	}
	
	@Test
	public void testNotDivision() {
		Calculator cal = new Calculator();
		System.out.println("Testing if division is other than 10");
		Assertions.assertFalse(cal.division()!=10);
	}
	
	@Test
	public void testRemainder() {
		Calculator cal = new Calculator();
		System.out.println("Testing remainder");
		Assertions.assertEquals(cal.remainder(), 1);
	}
	
	@Test
	public void testNotRemainder() {
		Calculator cal = new Calculator();
		System.out.println("Testing if remainder is other than 1");
		Assertions.assertFalse(cal.remainder()!=1);
	}

}
