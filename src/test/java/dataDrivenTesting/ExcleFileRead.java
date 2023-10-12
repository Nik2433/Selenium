package dataDrivenTesting;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcleFileRead {

	public static void main(String[] args) throws Throwable {
		//Step1= open the document in java readleble formate
		//fis= file input streem
	 FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\XLSX Open File Tool.lnk");
		
		//Step2 create a work book
	 
	Workbook wb = WorkbookFactory.create(fis);
		
	//Step3 nagivate to required sheet
	 Sheet sh = wb.getSheet("sheet1");
		
		//Step4 : navigate to row
		Row rw = sh.getRow(2);

		//Step5 : navigate to cell
		     Cell cl = rw.getCell(3);
	
// Step 6 : captute the data inside the cell
		String data = cl.getStringCellValue();
		System.out.println(data);
	}

}
