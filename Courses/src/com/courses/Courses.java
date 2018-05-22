package com.courses;

public class Courses {
	public static int num;

	public static void main(String[] args) {
		Integer i = Alex.readCourses();
		System.out.println(i);
		Integer a= Alex.checkpreq();
		System.out.println(a);
		
	}

}
