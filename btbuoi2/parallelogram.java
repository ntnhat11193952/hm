package btbuoi2;

import java.util.ArrayList;
import java.util.Scanner;

public class parallelogram {
	ArrayList<segment> lssegment ;
	
	public void name() {
		
	}
	public parallelogram() {
		
		lssegment = new ArrayList<segment>();
		int temp1, temp2, temp3, temp4;
		
		Scanner input = new Scanner(System.in);
		
		
		
		//canh day
		System.out.println("Nhập cạnh đáy : ");
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
		
		//canh ben
		System.out.println("Nhập cạnh bên: ");
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
		
		
		//độ cao 
		System.out.println("Nhập độ cao : ");
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
		double a = lssegment.get(0).length();
		double c = lssegment.get(2).length();
		return a*c;
	}
	
	public double perimeter() {
		double a = lssegment.get(0).length();
		double b = lssegment.get(1).length();
		return 2*(a+b);
	}

	

}
