package apache_programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class P2 {
	
	public static void main(String[] args) throws Throwable {
		// reads the data from excel(binary form)
		FileInputStream f1=new FileInputStream("./data/actidata.xlsm");
		//out of data fetched, creates the workspace
		Workbook book = WorkbookFactory.create(f1);
		//edit(set) the data from specified sheet,row,col of workspace
		book.getSheet("demo").getRow(0).getCell(0).setCellValue("ramya");
		//writes the data  from workspace into excel
		FileOutputStream f2 = new FileOutputStream("./data/actidata.xlsm");
		book.write(f2);
	}

}
