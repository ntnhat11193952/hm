package btbuoi2;

import java.util.ArrayList;
import java.util.Scanner;

public class rectangle {
ArrayList<segment> lssegment ;
	
	public void name() {
		
	}
	public rectangle() {
		
		lssegment = new ArrayList<segment>();
		int temp1, temp2, temp3, temp4;
		
		Scanner input = new Scanner(System.in);
		
		
		
		//chieu dai
		System.out.println("Nhập toa do chieu dai : ");
		System.out.println("x1 = ");
		temp1 = input.nextInt();
		System.out.println("y1 = ");
		temp2 = input.nextInt();
		System.out.println("x2 = ");
		temp3 = input.nextInt();
		System.out.println("y2 = ");
		temp4 = input.nextInt();
		segment s1 = new segment(temp1,temp2,temp3,temp4);
		lssegment.add(s1);
		
		//chieu rong
		System.out.println("Nhập toa do chieu rong: ");
		System.out.println("x1 = ");
		temp1 = input.nextInt();
		System.out.println("y1 = ");
		temp2 = input.nextInt();
		System.out.println("x2 = ");
		temp3 = input.nextInt();
		System.out.println("y2 = ");
		temp4 = input.nextInt();
		segment s2 = new segment(temp1,temp2,temp3,temp4);
		lssegment.add(s2);
		
		
		
	}
	public double area() {
		double a = lssegment.get(0).length();
		double b = lssegment.get(1).length();
		return a*b;
	}
	
	public double perimeter() {
		double a = lssegment.get(0).length();
		double b = lssegment.get(1).length();
		return 2*(a+b);
	}
	

}
