package dataproviders;

import org.testng.annotations.DataProvider;

import generic.Basedata;
import generic.actionUtils;

public class DataFromXL {
	@DataProvider
	public void  data() {
		Object[][] d=new Object[1][9];
	d[0][0]=actionUtils.getData(Basedata.excelpath, "actidata1", 1, 0);
	d[0][0]=actionUtils.getData(Basedata.excelpath, "actidata1", 1, 1);
	d[0][0]=actionUtils.getData(Basedata.excelpath, "actidata1", 1, 2);
	d[0][0]=actionUtils.getData(Basedata.excelpath, "actidata1", 1, 3);
	d[0][0]=actionUtils.getData(Basedata.excelpath, "actidata1", 1, 4);
	d[0][0]=actionUtils.getData(Basedata.excelpath, "actidata1", 1, 5);
	d[0][0]=actionUtils.getData(Basedata.excelpath, "actidata1", 1, 6);
	d[0][0]=actionUtils.getData(Basedata.excelpath, "actidata1", 1, 7);
	d[0][0]=actionUtils.getData(Basedata.excelpath, "actidata1", 1, 8);
	}
	
	
}