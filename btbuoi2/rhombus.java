package btbuoi2;

import java.util.ArrayList;
import java.util.Scanner;

public class rhombus {
	
	ArrayList<segment> lssegment ;
	
	public void name() {
		
	}
	public rhombus() {
		
		lssegment = new ArrayList<segment>();
		int temp1, temp2, temp3, temp4;
		
		Scanner input = new Scanner(System.in);
		
		
		
		//canh hinh thoi
		System.out.println("Nhập toa do canh  : ");
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
		
		//duong cheo 1
		System.out.println("Nhập toa do duong cheo 1: ");
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
		
		
		//duong cheo 2 
		System.out.println("Nhập toa do duong cheo 2  : ");
		System.out.println("x1 = ");
		temp1 = input.nextInt();
		System.out.println("y1 = ");
		temp2 = input.nextInt();
		System.out.println("x2 = ");
		temp3 = input.nextInt();
		System.out.println("y2 = ");
		temp4 = input.nextInt();	
		segment s3 = new segment(temp1,temp2,temp3,temp4);
		lssegment.add(s3);
		
		
		
		
		
	}
	public double area() {
		double b = lssegment.get(1).length();
		double c = lssegment.get(2).length();
		return b*c;
	}
	
	public double perimeter() {
		double a = lssegment.get(0).length();
		return 4*a;
	}

	

}
