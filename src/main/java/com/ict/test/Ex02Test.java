package com.ict.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ict.junit.Ex02_1;
import com.ict.junit.Ex02_2;
import com.ict.junit.Ex02_3;
import com.ict.junit.Ex02_4;

// 여러개의 클래스도 가능
public class Ex02Test {
	Ex02_1 t1 ;
	Ex02_2 t2 ;
	Ex02_3 t3 ;
	Ex02_4 t4 ;
	
	@Before
	public void t_be() {
		t1 = new Ex02_1();
		t2 = new Ex02_2();
		t3 = new Ex02_3();
		t4 = new Ex02_4();
	}
	// 하나 또는 여러개 가능
	@Test
	public void test() {
		assertEquals(8, t1.plus(5, 3));
		assertEquals(2, t2.minus(5, 3));
		assertEquals(15, t3.multiple(5,3));
		assertEquals(3, t4.div(10, 3));

		// 실수처리 못함
		// assertEquals(5.5, t4.div2(11.0, 2.0));
		// assertEquals(5.5, t4.div2(11, 2));
		// assertEquals(5, t4.div2(11.0, 2.0));
		// assertEquals(5, t4.div2(11, 2));
	}

}









