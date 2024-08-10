package com.ict.day10;

public class Ex17 {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private String hak;
	private int rank =1;
	
	public static int calSum(int kor, int eng, int math){
		
		return kor + eng + math;
	}
	public static double calAverage(int sum){
		return (int) (sum/3.0 *10)/10.0;
	}
	public static String calHak(double average){
		if (average >=90) {
			return "A 학점";
		} else if (average >=80) {
			return "B 학점";
		} else if (average >=70) {			
			return "C 학점";
		} else if (average >=60) {
			return "D 학점";
		} else {
			return "F 학점";
		} 
	}
	 
	public String getName(){
		return name;
	}
	public int getSum() {
		return sum;
	}
	public double getAverage() {
		return avg;
	}
	public String getHak() {
		return hak;
	}
	public int getRank() {
		return rank;
	}
	
	public void setName(String nm){
		name = nm;
	}
	public void setSum(int sm){
		sum =sm;
	}
	public void setAverage(double avrg){
		avg = avrg;
	}
	public void setHak(String hk) {
		hak = hk;
	}
	public void setRank(int rnk) {
		rank = rnk;
	}
}
