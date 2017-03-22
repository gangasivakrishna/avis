public class Evenly{

	public static void main(String args[]){
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		boolean result1,result2;
		result1= ((a%b == 0)&&(b%a ==0));
		System.out.println(result1);
		

	}


}
