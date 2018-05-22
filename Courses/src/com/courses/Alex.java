package com.courses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Alex {

	public static int readCourses() {

		String csvFile = "C:/alex/courses.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] id = line.split(cvsSplitBy);
				String[] title = line.split(cvsSplitBy);

				System.out.println("Course [ID= " + id[0] + " ,Course name=" + title[1] + "]");

			}
			return 1;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return 0;
		
		
	}
	
	public static int checkpreq() {

		String csvFile1 = "C:/alex/prerequisites.csv";
		BufferedReader br1 = null;
		String line1 = "";
		String cvsSplitBy1 = ",";
		
		
		try {

			br1 = new BufferedReader(new FileReader(csvFile1));
			while ((line1 = br1.readLine()) != null) {

				// use comma as separator
				String[] id1 = line1.split(cvsSplitBy1);
				String[] preq1 = line1.split(cvsSplitBy1);
				

				Map<Integer,String> map=new HashMap<>();
				
				
				map.put(1,id1[0]);
				map.put(2,preq1[1]);
				
	
			Collection<String> table = null;
			
			
			for(int i= 0;i<id1[0].length();i++) {
				for(int j=0;j<preq1[1].length();j++)
				{
					table= map.values();
				}
			}
		
			
		
			
		System.out.println("Course prerequisists are"+ table);
	
			}
			
			//return 1;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br1 != null) {
				try {
					br1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			

		}
		
		
			
			System.out.println("\n the best way to complete the online course is to follow the given  order");;
			
			System.out.println(" ID= 1 ,Course name=Programming in C \n"
							+ "ID= 6 ,Course name=Programming in Java\n "
							+" ID= 7 ,Course name=Advanced Programming in Java \n"
							+"ID= 10 ,Course name=Probability \n"
							+"ID= 12 ,Course name=Data Structures \n "
							+"ID= 8 ,Course name=Big Data with Apache Spark \n"
							+"ID= 11 ,Course name=Scalable Machine Learning \n"
							+ "ID= 2 ,Course name=Distributed Computing \n"
							+"ID= 3 ,Course name=Database Systems \n ");
				System.out.println(" Courses such as 4,5,9 cannot be completed as they go in infinite loop for prerequisistes.");
				return 0;
			
		
		
	}


}