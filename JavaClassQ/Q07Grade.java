package javaClass;

public class Q07Grade {
	private int math;
	private int science;
	private int english;
	Q07Grade(int math, int science, int english) {
	   this.math = math;
	   this.science = science;
	   this.english = english;
	}
	public int average() {
	   return (math + science + english) / 3;
	}
}
