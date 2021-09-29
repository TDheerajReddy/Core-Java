//
class ClassDouble
{
	public static void main(String ar[])
	{
		double x=1.7,y=5.7;
		int z;			//take 'double z' to remove the error
		z=x+y;			/*E:\coljava>javac ClassDouble.java 
						ClassDouble.java:8: error: incompatible types: possible lossy conversion from double to int
						z=x+y;
						   ^ 	*/
		System.out.println(z);
		
	}
}
/*E:\coljava>javac ClassDouble.java
ClassDouble.java:8: error: incompatible types: possible lossy conversion from double to int
                z=x+y;                  /*E:\coljava>javac ClassDouble.java
                   ^	*/