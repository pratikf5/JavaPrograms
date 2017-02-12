package package2;

public class Class2 {//Exception handling operation(Unchecked exception)

	static int a=0;
	static int b=0;
	static int result=0;
	static char[] ch= new char[4];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try {
			result=a/b;
			 System.out.println("Print the result"+ result);
			 
			 ch[5]='t';
			 result=a*b;
			 System.out.println("Print the result multiply"+ result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println("Arithmatic operation happens while doing the divide operation");
		}
		 
		 System.out.println("Execute the whole program");
	}

}
