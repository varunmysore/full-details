package apache_programs;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class P1 {
	
	public static void main(String[] args) throws Throwable {
		// reads the data from excel(binary form)
		FileInputStream f1=new FileInputStream("./data/actidata.xlsm");
		//out of data fetched, creates the workspace
		Workbook book = WorkbookFactory.create(f1);
		//retrieves the data from specified sheet,row,col of workspace
		String d = book.getSheet("demo").getRow(1).getCell(0).getStringCellValue();
		System.out.println(d);
	}

}
