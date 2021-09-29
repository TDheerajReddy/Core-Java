//String Buffer
class Str_Buf
{
	public static void main(String ss[])
	{
		StringBuffer s=new StringBuffer(10);							//10 Characters
		StringBuffer s1=new StringBuffer("Hai");				//16+3=19
		StringBuffer s2=new StringBuffer("welcome");
		StringBuffer s3=new StringBuffer("361DM");
		StringBuffer s4=new StringBuffer("Malayalam");
		char ch[]={'P','r','o','g','r','a','m','m','e','r',' '};
		
		System.out.println("Capacity of s is: "+s.capacity());
		System.out.println("Capacity of s1 is: "+s1.capacity());	//default value is 16, that can be added to string
		System.out.println("Capacity of s2 is: "+s2.capacity());
		
		System.out.println("Append String: "+s1.append(" How r u "));
		System.out.println("Append Object: "+s1.append(s2));
		System.out.println("Append String: "+s1.insert(3," Students "));
		System.out.println("Append String: "+s1.insert(3,s3));	
		System.out.println("Append String: "+s1.insert(0,ch,0,7));
		System.out.println("Delete the Character: "+s1.deleteCharAt(5));
		System.out.println("Delete the String: "+s1.delete(0,6));
		
		System.out.println(s4.reverse());
		System.out.println(s1);
		
	}
}
