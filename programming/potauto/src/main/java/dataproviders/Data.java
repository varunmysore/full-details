package dataproviders;

import org.testng.annotations.DataProvider;

import generic.ActionUtils;
import generic.Basetest;

public class Data {
	
	@DataProvider
	public Object[][] createData() {
		Object[][] d = new Object[1][5];
		d[0][0]=ActionUtils.getData(Basetest.excelpath, "exceldata",1 , 0);
		d[0][1]=ActionUtils.getData(Basetest.excelpath, "exceldata",1 , 1);
		d[0][2]=ActionUtils.getData(Basetest.excelpath, "exceldata",1 , 2);
		d[0][3]=ActionUtils.getData(Basetest.excelpath, "exceldata",1 , 3);
		d[0][4]=ActionUtils.getData(Basetest.excelpath, "exceldata",1 , 4);
		return d;
	}

}
