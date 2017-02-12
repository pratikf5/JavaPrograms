package package2;

import package1.AccessModifiers;

public class AccessSpecifier3 extends AccessModifiers {

	public void test5()
	{
		AccessModifiers o1= new AccessSpecifier3();
		o1.publicTest1();
		protectedTest2();
	}
}
