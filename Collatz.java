// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		String str = args[1];
		int var1 = Integer.parseInt(args[0]);
		int num = 0;
		int counter;
		boolean flag = true;
		if (str.equals("v")) {
			for (int i = 1; i <= (var1 + 1); i++) {
				counter = 0;
				num = i;

				System.out.print(i + " ");
				while (flag != false) {
					if (num % 2 == 0)
						num /= 2;
					else
						num = num * 3 + 1;

					if (num == 1) {
						flag = false;
						break;
					}
					System.out.print(num + " ");

					counter++;
				}
				System.out.print(1 + "(" + (counter + 2) + ")");
				System.out.println();

				flag = true;

			}
		}
		else
			System.out.print("Every one of the first "+ var1 +" hailstone sequences reached 1.");

		System.out.println("Every one of the first "+ var1 +" hailstone sequences reached 1.");

	}
}
// 1,4,2,1