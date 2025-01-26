import java.io.*;

class ByteStream
{
	public static void main(String[] args)
	{
		File fp = new File("file3.txt");

		// Write File
		try
		{
			FileOutputStream fos = new FileOutputStream(fp);

			String msg = "HI";

			fos.write(msg.getBytes());

			fos.close();
		}
		catch(Exception e)
		{
			//...
		}

		// Read File
		try
		{
			FileInputStream fis = new FileInputStream(fp);

			int ch;

			while((ch = fis.read()) != -1)
			{
				System.out.print((char) ch);
			}
			fis.close();
		}
		catch(Exception e)
		{
			//...
		}
	}
}