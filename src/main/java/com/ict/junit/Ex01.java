package com.ict.junit;

// JUnit : 단위 테스트(TDD) 프레임워크 중 하나이다. 
//         테스크 중 블랙박스 모델이다.(화이트박스와 블랙박스가 존재)
//         입력값에 대한 결과값을 성공, 실패으로 평가한다.
//         성공이면 녹색, 실패 붉은색 

//- 이클립스에서 JUnit 설정하기
//- 프로젝트에서 마우스 오른쪽 - Properties - Java Buildpath 선택
//  Libraries 탭을 선택하고 Add Library 선택 - JUnit 선택

// 방법1) 해당 클래스에서 마우스 오른쪽
public class Ex01 {
	private int result;
	
	// 테스트할 메소드
	public int add(int s1, int s2) {
		return s1 + s2 ;
	}
	
	public void sub (int s1, int s2) {
		result = s1 - s2 ;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
}
