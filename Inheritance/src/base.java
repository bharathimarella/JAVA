
public class base {
	
	public String name;
	public long id;
	public double percentage;
	public base(String n,long i,double p){
		this.name=n;
		this.id=i;
		this.percentage=p;
	}
	
public void method1(){
	
	System.out.println("method is from base class");
	System.out.println("Name="+name+" "+"Id="+id+" "+"percentage="+percentage);
}
	
	
public String getName(){

return name;
}
public long getid(){

return id;
}
public double getpercentage(){
	
return percentage;
}

}

