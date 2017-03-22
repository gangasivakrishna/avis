/*
F = Gm1m2/r2;
F = gravitational force of attraction (N) m1,m2are the interacting masses (kg) 
 r is the separation of the masses (m) 
G = 6.67×10-11Nm2kg-2
*/
import java.util.Scanner;
public class Newtons_Law{

	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

		System.out.println("enter m1 value: ");
		
		int m1=sc.nextInt();

		System.out.println("enter m2 value: ");

		int m2=sc.nextInt();

		System.out.println("enter r value: ");

		int r=sc.nextInt();
		
		double F =((6.67*Math.pow(10,-11))*(m1)*(m2))/(r*r);

		System.out.println(F);
		
		

	}


}
