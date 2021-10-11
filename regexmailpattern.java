import java.io.*;
import java.util.regex.*;
class regexmailpattern
{
	public static void main(String[] args) throws Exception
	{
		PrintWriter out = new PrintWriter("output.txt");
		Pattern p = Pattern.compile("[a-zA-z0-9][a-zA-z0-9]*@[a-zA-Z0-9]+(([.][a-zA-Z])+)+");
		BufferedReader br = new BufferedReader(new FileReader("myfilehari.txt"));
		String line = br.readLine();
		while ( line != null)
		{
			Matcher m = p.matcher(line);
			if (m.find())
			{
				out.println(m.group());
			}
			line = br.readLine();
		}
		out.flush();
	}
}