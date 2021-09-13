package bt;
import java.util.Scanner;

public class oop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float p;
		
		hv hv1 = new hv();
		System.out.println("Canh cua hinh vuong : ");
		hv1.x = input.nextInt();
		System.out.println("Dien tich hinh vuong la : " + hv1.x*hv1.x);
		System.out.println("Chu vi hinh vuong la : " + hv1.x*4);
		
		hbh hbh1 = new hbh();
		System.out.println("Canh day cua hinh binh hanh : ");
		hbh1.a = input.nextInt();
		System.out.println("Canh ben cua hinh binh hanh : ");
		hbh1.b = input.nextInt();
		System.out.println("Chieu cao cua hinh binh hanh : ");
		hbh1.c = input.nextInt();
		System.out.println("Chu vi cua hinh binh hanh :"  + 2*(hbh1.a + hbh1.b));
		System.out.println("Dien tich cua hinh binh hanh : " + hbh1.a*hbh1.c  );
		
		hch hcn1 = new hch();
		System.out.println("Chieu dai cua hinh chu nhat : ");
		hcn1.a = input.nextInt();
		System.out.println("Chieu rong cua hinh chu nhat : ");
		hcn1.b = input.nextInt();
		System.out.println("Chu vi cua hinh chu nhat :"  + 2*(hcn1.a + hcn1.b));
		System.out.println("Dien tich cua hinh chu nhat : " + hcn1.a*hcn1.b  );
		
		tg tg1 = new tg();
		System.out.println("Do dai 3 canh cua tam giac la  : ");
		tg1.a = input.nextInt();
		tg1.b = input.nextInt();
		tg1.c = input.nextInt();
		System.out.println("Chu vi cua tam giac  :"  + (tg1.a + tg1.b + tg1.c) );
		p = tg1.a + tg1.b + tg1.c;
		p = p/2;
		System.out.println("Dien tich cua tam giac : " + Math.sqrt(p*(p-tg1.a)*(p-tg1.b)*(p-tg1.c))  );
		
		ht ht1 = new ht();
		System.out.println("Canh cua hinh thoi : ");
		ht1.a = input.nextInt();
		System.out.println("Duong cheo cua hinh thoi : ");
		ht1.b = input.nextInt();
		ht1.c = input.nextInt();
		System.out.println("Chu vi hinh thoi la  :" + 4*ht1.a);
		System.out.println("Dien tich hinh thoi la  :" + (float)1/2*(ht1.b*ht1.c));
		
		
		
		
		

		

	}
}
