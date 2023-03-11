package dataproviders;

import org.testng.annotations.DataProvider;

import generic.ActionUtil_fp2;
import generic.BaseTest_fp2;

public class Actidata_fp2 {
	
@DataProvider
public void userData_mtd() {
	
	Object [][] d=new Object[1][5];
	d[0][0]=ActionUtil_fp2.getData_mtd(BaseTest_fp2.excelPath, "adduser", 1, 0);
	d[0][1]=ActionUtil_fp2.getData_mtd(BaseTest_fp2.excelPath, "adduser", 1, 1);
	d[0][2]=ActionUtil_fp2.getData_mtd(BaseTest_fp2.excelPath, "adduser", 1, 2);
	d[0][3]=ActionUtil_fp2.getData_mtd(BaseTest_fp2.excelPath, "adduser", 1, 3);
	d[0][4]=ActionUtil_fp2.getData_mtd(BaseTest_fp2.excelPath, "adduser", 1, 4);
}
}
