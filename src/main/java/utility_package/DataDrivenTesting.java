package utility_package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

@Test
public class DataDrivenTesting {

	public static String un;
	public static String pswd;

	public void DTT() throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\USER\\eclipse-workspace\\Amazon_Project01\\DTT\\MProject01.xlsx");

		Workbook w1 = WorkbookFactory.create(f1);

		un = w1.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

		pswd = w1.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();

	}

	// DTT002 for 2nd testcase

	public static String uname;
	public static String pswd1;

	public void DTT01() throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\USER\\eclipse-workspace\\Amazon_Project01\\DTT\\MProject01.xlsx");

		Workbook w1 = WorkbookFactory.create(f1);

		uname = w1.getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();

		pswd1 = w1.getSheet("Sheet2").getRow(0).getCell(1).getStringCellValue();

	}

}
