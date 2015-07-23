
public class TestMethods {
	
	String n;
	String b;
	public static float totalMethod(float balance,float deposit)
	{
		
		return (balance+deposit);//returns the result value
		
	}
	public void detailsMethod(String name,String bank)
	{
		n=name;
	    b=bank;
		System.out.println("Customer name="+name);
		System.out.println("Bank name="+bank);
	}
	
	public static void main(String[] args)
	{
		TestMethods t1=new TestMethods();
		
		t1.detailsMethod("xyz" ,"abc");
		
		System.out.println("TotalBalance="+TestMethods.totalMethod(100.50f,500.50f));

	
}
}
