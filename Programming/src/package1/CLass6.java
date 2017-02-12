package package1;

public class CLass6
{
	public String collegeName = "ssn";
	int rollNumber;
    double localMarks;

public CLass6(int a, String b, double c){
	rollNumber = a;
	localMarks = c;
	collegeName = b;
}
public void test(){
	System.out.println("Print the rollnumbers");
	System.out.println("Print thre local marks");
	System.out.println("Print the collegename");
}
public int returnRollNum()
{
	return rollNumber;
}
public String returnCollegeName()
{
	return collegeName;
}
public double returnLocalMarks()
{
	return localMarks;
}
}
