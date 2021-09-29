//Inheritance		28-10-20
class Abca
{
	private int x=10;				//it is not going to class B
	protected int y=20;
	public int z=30;
	int w=40;						//Default Access Modifier
	
}
class Bbca extends Abca
{
	int x1=50;
}
class Cbca extends Bbca
{
}
