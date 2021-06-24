package com.ict.debug;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Ex02_1 test01 = new Ex02_1();
		Ex02_2 test02 = new Ex02_2();
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		System.out.print("수학 : ");
		int math = scan.nextInt();
		
		// int sum =  test01.getSum(kor, eng, math);
		// double avg = test01.getAvg(sum);
		// String hak = test01.getHak(avg);
		test02.getSum_1(kor, eng, math);
		test02.getAvg_1();
		test02.getHak_1();
	
		
	}
}
