
public class Ex5 {

	public static void main(String[] args) {
		int firstNum = 0;
		int secNum = 1;
		int sum = 1;

		System.out.println("Fibonacci Series");
		for (int i = 0; i < 25; i++) {
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;

			System.out.println(sum);
		}

	}

}
