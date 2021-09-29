//getBytes()		get character position(POS)
class Get_Char
{
	public static void main(String ar[])
	{
		String s="This is a demo of getchars";
		char ch[]=new char[5];
		s.getChars(5,10,ch,0);				//String start POS, String end POS, char array, char array start POS
		for(int i=0;i<ch.length;i++)
			System.out.println(ch[i]+" : "+i);		//print i also
	}
}
