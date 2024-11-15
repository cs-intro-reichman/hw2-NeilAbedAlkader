// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		// Replace this comment with your code
		int var1 = Integer.parseInt(args[0]);
		int count = 2;
		double result =1;
		double odd = 3;
		while (var1 >= count+2) {
			if(count%2==0)
			result = result -(1 / odd);
			else
			result = result + (1 / odd);

		odd += 2;
		count++;

		}
		System.out.println("pi according to Java: "+ Math.PI);
		System.out.println("pi, approximated: " + result*4);


	}
}
