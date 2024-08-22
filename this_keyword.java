package java5i4;

public class this_keyword {
public  void name()
{   //this.age();
	String Name="Shreya";
	System.out.println("my name is " + Name);
}
public void age()
{   this.name();
	int age=19;
	System.out.println("my age is " + age);
	
}
public static void main(String[] args)
{
	this_keyword obj= new this_keyword();
	obj.age();
	//obj.name();
}
}
