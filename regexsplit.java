import java.util.regex.*;
class  regexdemospilt
{
	public static void main(String[] args) 
	{
	Pattern p = Pattern.compile("\\s");
	String[] s = p.split("java string split demo");
	for(String s1 : s )
		{
		System.out.println(s1);
		}
	}
}