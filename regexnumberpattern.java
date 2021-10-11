import java.io.*;
import java .util.regex.*;
class regexnumberpattern
{
	public static void main(String[] args) throws Exception
	{
		PrintWriter out = new PrintWriter("output.txt");
		Pattern p = Pattern.compile("(0/91)[789][0-9]{9}");
		BufferedReader br = new BufferedReader(new FileReader("myfilehari.txt"));
		String line = br.readLine();
		while ( line != null)
		{
			Matcher m = p.matcher(line);
			if (m.find())
			{
				out.println(m.group());
			}
		}

	}
}