
public class TestConstructors
{
TestConstructors()//Empty constructor 
{
	System.out.println("This is an Empty constructor");
	int a=1;//initializing values to the instance variables
	int b=2;
	System.out.println("the value of a="+a);
	System.out.println("the value of b="+b);
}
TestConstructors(int a,int b)//2 parameeterized constructor using integer
{
	System.out.println("This is a 2 parameterized constructor using integer");
	int x=a-b;//diff of a&b stored in x
	
	if(x>0)
	{
		
		System.out.println(+a+"is the biggest value");
		
	}
	else 
	{
		System.out.println(+b+"is the biggest value");
	}
}
TestConstructors(String n,String t)//2 parameterized constructor using strings
{
	System.out.println("This is a 2 parameterized constructor using strings");
	
	System.out.println("name="+n+","+"type="+t);
}
public static void main(String[] args)
{
	TestConstructors t1=new TestConstructors();//object is created,no parameters are passed
	TestConstructors t2=new TestConstructors(7,5);
	TestConstructors t3=new TestConstructors("java","language");
	
}
}
