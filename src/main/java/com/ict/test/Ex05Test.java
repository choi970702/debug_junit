package com.ict.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// Ex04_1 Ex04_4를 한번에 테스트 하기
// Ex02Test의 변형

@RunWith(Suite.class)
@SuiteClasses({Ex04_1Test.class, Ex04_2Test.class, Ex04_3Test.class, Ex04_1Test.class})
public class Ex05Test
{
	
}
