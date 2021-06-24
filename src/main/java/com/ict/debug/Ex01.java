package com.ict.debug;

import java.util.Scanner;

// 디버깅 : 논리적인 오류를 잡기 위해서 실행하는 행위
//          해당 변수값을 조사 , 알아서 수정하지는 않는다.

// breakpoint(중단점) : 디버깅 실행 시 자동으로 실행이 중단되어 
//                      변수값을 조사 할 수 있는 특정 지점을 말한다.
//                      Line Numbers에 더블클릭으로 설정하거나 해제 된다.
//                     빈공간은 설정 및 해제할 수 없다.

// F11 : 디버그 실행 모드
// F8 : 중단점에서 중단점으로 이동
// F5 : 중단점에서 한 문장씩 실행 하면서 이동, 메소드를 만나면 안으로 진입 
// F6 : 중단점에서 한 문장씩 실행 하면서 이동, 메소드를 만나면 안으로 진입하지 않고 건너뜀
public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		System.out.print("수학 : ");
		int math = scan.nextInt();
		
		int sum = kor + eng + math ;
		double avg = (int)(sum/3.0*10)/10.0;
		String hak = "" ;
		if(avg>=90) {
			hak = "A학점";
		}else if(avg>=80) {
			hak = "B학점";
		}else if(avg>=70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}

		System.out.println("=================");
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hak);
	}
}
