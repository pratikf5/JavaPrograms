package package2;

public class Class3 {
	static int a = 0;
	static int b = 0;
	static int result = 0;
	static char[] chr = new char[3];

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		try {
			result = a / b;
			System.out.println("Print the result" + result);

			chr[4] = 'b';

			result = a * b;
			System.out.println("Print the result multiply" + result);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Execute");
			// throw new Exception("arithmatic error happend during the divide
			// operation");//Handling the
		} finally {
			System.out.println("Execute the finally block");
		}
		System.out.println("Execute the whole program");

	}

}
