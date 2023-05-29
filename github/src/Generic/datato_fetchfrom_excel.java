package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class datato_fetchfrom_excel 
{
	public static String get_data (String sh,int r,int c)
	{
		String value="";
		try
		{
			
		FileInputStream fi=new FileInputStream("./Excel/data.xlsx");
	 Workbook book = WorkbookFactory.create(fi);
	 Sheet sheet=book.getSheet(sh);
	 Row row=sheet.getRow(r);
	Cell cl=row.getCell(c);
	 value=cl.toString();
		}
		catch (Exception e) {
			System.out.println(value);
		}
	return value;
	}

}
