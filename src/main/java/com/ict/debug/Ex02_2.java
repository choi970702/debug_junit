package com.ict.debug;

public class Ex02_2 {
	private int sum ;
	private double avg;
	private String hak;
	
	public void getSum_1(int kor, int eng, int math) {
		sum = kor + eng + math ;
	}
	
	public void getAvg_1() {
		avg = (int)(sum/3.0*10)/10.0;
	}
	
	public void getHak_1() {
		if(avg>=90) {
			hak = "A학점";
		}else if(avg>=80) {
			hak = "B학점";
		}else if(avg>=70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
	}

	public int getSum() {
		return sum;
	}

	public double getAvg() {
		return avg;
	}

	public String getHak() {
		return hak;
	}
	
}
