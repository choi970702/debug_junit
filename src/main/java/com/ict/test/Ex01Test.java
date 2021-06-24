package com.ict.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.junit.Ex01;

//assertEquals : 기본형 변수 또는 객체의 값이 예상값과 일치한지 검사
//assertSame : 두 객체가 같은 객체인지 검사 (주소가 같냐?)
//assertNull : null 검사 
//assertNotNull : not null 검사 
//assertTrue(a) : a가 참이지 검사 
//assertArrayEquals(a,b) : 배열a, 배열 b 가 일치한지 확인


public class Ex01Test {
	Ex01 t1;
	// 테스트 전 실행 (선택사항)
	@Before
	public void t_be() {
		System.out.println(1);
		t1 = new Ex01();
	}
	
	// 테스트
	/*
	@Test
	public void testAdd() {
		System.out.println("test1");
		
		// 해당 메소드가 리턴이 있음
		// int result =  t1.add(11, 5);
		// assertEquals(예상값, 결과값);
		// assertEquals(15, result);
		assertEquals(15, t1.add(16, 5));
	}
  
	@Test
	public void testSub() {
		System.out.println("test2");
		// 해당 메소드가 리턴이 없음
		t1.sub(11, 5);
		assertEquals(6, t1.getResult());
	}
	*/
	/*
	@Test
	public void testAdd() {
		System.out.println("test1");
		
		assertEquals(21, t1.add(16, 5));
		t1.sub(11, 5);
		assertEquals(11, t1.getResult());
	}
	*/
	@Test
	public void testAdd() {
	   assertEquals(21, t1.add(16, 5));
	   assertEquals(122, t1.add(16, -5));
	   assertEquals(-11, t1.add(-16, 5));
	   assertEquals(-21, t1.add(-16, -5));
	}
// 테스트 후 실행(선택사항)
	@After
	public void t_af() {
		System.out.println(2);
	}
}
