 import java.io.*;

 class test
 {
	public static void main(String[] args)
	{
		File fp1 = new File("file1.txt");
		File fp2 = new File("file2.txt");


		// File Read
		try
		{
			FileReader fr = new FileReader(fp1);
			FileWriter fw = new FileWriter(fp2);
			
			int ch;
			while((ch = fr.read()) != -1)
			{
				fw.write((char) ch);
			}

			fr.close();
			fw.close();
		}	
		catch(Exception e)	
		{
			System.out.println(e.getMessage());
		}
	}
 }