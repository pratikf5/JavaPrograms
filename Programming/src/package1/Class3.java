package package1;

public class Class3 {
	public static void main(String[] args) {
		Class3 o1=new Class3();
		o1.test();
		o1.test2(4, 5);
		Class3 o2=new Class3();
		//o2.test2();
	  Class3.calculator(9, 4);
	  //o2.calculator();
	}
	
public void test()
{
	int i=10;
	int n = 5;
	int sum;
	sum= i+n;
	System.out.println(sum);
}
public static void test2(int a, int b)
{
	int sum = a + b;
	System.out.println(sum);
	
}
public static int calculator(int c, int d)
{
int result = c+d;
return result;
}
}
