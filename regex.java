import java.util.regex.*;
class  regexdemo
{
	public static void main(String[] args) 
	{
		int count= 0;
		Pattern p = Pattern.compile("ab");          //creating an ab patternobject using compile method of pattern class 
		Matcher m = p.matcher("abbbabbabaabb");    // calling matcher method on patternobject, CREATING Matcher object from the return type  
     while (m.find())                              //if given pattern occurs 
     {
		 ++count;
		System.out.println(m.start()+"......."+m.end()+"....."+m.group());
		//print the start index  ..........print the end index[end+1].......print that pattern
	 }
	 System.out.println("the total number of occurrences:"+count);
    }
}