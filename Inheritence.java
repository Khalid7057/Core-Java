class Parent
{
	void show()
	{
		System.out.println("This Is Parent Class");
	}
}
class Child extends Parent
{
	void dis()
	{
		System.out.println("This Is Child Class");
	}
}
class Inheritence
{
	public static void main(String []args)
	{	
		Parent k=new Parent();
		k.show();
		Child s=new Child();
		s.dis();
		s.show();
	}
}