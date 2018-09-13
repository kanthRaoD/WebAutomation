package Library;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class GenericLibrary {

	static Properties p;
	FileReader reader;
	public GenericLibrary()
	{
		try {
			reader = new FileReader("ConfigProperties//config.properties");
			p=new Properties();  
			try {
				p.load(reader);

			} 		catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  

	}


	public String getDriverPath()
	{

		return 	p.getProperty("Chrome_driver_path");
	}

	public String getUrl()
	{

		return 	p.getProperty("Url");
	}


}
