package com.devopsusach2020;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class DevOpsUsach2020ApplicationTests {

	@Test
	void contextLoads() {
		assertEquals(1,1);
	}

	@Test
	void contextLoadsTest1() {
		assertEquals(2,1+1);
	}

	@Test
	void contextLoadsTest2() {
		assertEquals(3,1+2);
	}

}
