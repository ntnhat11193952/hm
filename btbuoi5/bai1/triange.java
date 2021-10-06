package btbuoi5;
import java.util.Scanner;
public class triange  extends getnumberofsides{
	Scanner input = new Scanner(System.in);
	public void input() {
		System.out.println("canh thu nhat : ");
		a=input.nextInt();
		System.out.println("chieu thu hai : ");
		b=input.nextInt();
		System.out.println("chieu thu ba : ");
		c=input.nextInt();
	}
}
