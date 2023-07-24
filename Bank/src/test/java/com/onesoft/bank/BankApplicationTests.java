package com.onesoft.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BankApplicationTests {
	
	public static void method1() {
		System.out.println("senthil");
	}

	@Test
	void contextLoads() {
	}
	
	@Autowired
	BankController bc;
	
	@Test
	public void test() {
		assertEquals(10, bc.add(5, 5),"Completed");
	}
	
	@Test
	public void duplicates() {
		assertEquals("senthl", bc.get("senthili"));
	}
	


}
