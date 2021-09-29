//Character Methods
class Char_Fun
{
	public static void main(String str[])
	{
		char ch[]={'a','5','A',' '};
		for(int i=0;i<ch.length;i++)
		{
			System.out.println("\n"+ch[i]+" is Digit: "+Character.isDigit(ch[i]));			//'Character' is a Class(pre-defined) & 'isDigit' etc are Methods in 'Character' Class
			System.out.println(ch[i]+" is Letter: "+Character.isLetter(ch[i]));
			System.out.println(ch[i]+" is Upper Case: "+Character.isUpperCase(ch[i]));
			System.out.println(ch[i]+" is Lower Case: "+Character.isLowerCase(ch[i]));
			System.out.println(ch[i]+" is White Spaces: "+Character.isWhitespace(ch[i]));
		}
	}
}
