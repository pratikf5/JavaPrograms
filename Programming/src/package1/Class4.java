package package1;

public class Class4 {

	int a = 0;
	int b = 0;
	int result;
	static int result1;

	public Class4(int value1, int value2) {
		a = value1;
		b = value2;
	}

	public void add() {
		result = a + b;
		System.out.println(result);
	}

	public void multiply() {
		result = a * b;
		System.out.println(result);
	}

	
}
