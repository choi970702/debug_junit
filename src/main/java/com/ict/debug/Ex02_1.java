package com.ict.debug;

public class Ex02_1 {

	public int getSum(int kor, int eng, int math) {
		return (kor+ eng +math);
	}
	
	public double getAvg(int sum) {
		return (int)(sum/3.0*10)/10.0;
	}
	
	public String getHak(double avg) {
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
		return hak;
	}
}
