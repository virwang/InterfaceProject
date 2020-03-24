package PublicMethod;

import java.beans.Statement;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DOReadfile implements PublicIn, DOInterface { 
	
	@Override
	public void readfile()  {
		// TODO Auto-generated method stub
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("select*from EXCELSQL");
		FileReader fr = new FileReader("D:\\Project\\project.csv");
		BufferedReader br = new BufferedReader(fr);
		String strLine = null;
		System.out.println("read files");
		
	}
	
} 
