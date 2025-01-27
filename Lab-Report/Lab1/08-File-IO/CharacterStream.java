import java.io.*;

class CharacterStream
{
	public static void main(String[] args)
	{
		File fp = new File("file1.txt");
		try
		{
			// Write File 
			FileWriter fw = new FileWriter("file1.txt");
			String msg = "Hello World";
			fw.write(msg);
			System.out.println("File written successfully.");

			fw.close();
		}
		catch(Exception err)
		{
			System.out.println(err.getMessage());
		}
		try
		{
			// Read File
			FileReader fr = new FileReader(fp);

			int ch;
			while((ch = fr.read()) != -1)
			{
				System.out.print((char) ch);
			}
			System.out.println("File read successfully.");

			fr.close();
		}
		catch(Exception err)
		{
			System.out.println(err.getMessage());
		}
		
	}
}