public class CalcPi {
	public static void main(String[] args) {
		int var1 = Integer.parseInt(args[0]);
		double result = 0.0;
		double odd = 1.0;
		int count = 0;

		while (count < var1) {
			if (count % 2 == 0) {
				result += 1 / odd;
			} else {
				result -= 1 / odd;
			}
			odd += 2;
			count++;
		}

		result *= 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + result);
	}
}
