package org.example.Ex_15_WebtableDDT;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtil {

    static Workbook workbook;
    static Sheet sheet;
    public static String path=System.getProperty("user.dir")+"/src/test/resources/Data Excel 4Row.xlsx";
    public static Object[][] getDatafromexcel(String sheetname)
    {
        try {
            FileInputStream file = new FileInputStream(path);
            workbook= WorkbookFactory.create(file);
            sheet = workbook.getSheet(sheetname);
        } catch (IOException e) {
            System.out.println("File error");
        }
        int totalrow= sheet.getLastRowNum();
        int totalcols= sheet.getRow(0).getLastCellNum();
        Object data [][]= new Object[totalrow][totalcols];
        for(int i=0;i<totalrow;i++)
        {
            for(int j=0;j<totalcols;j++)
            {
                data [i][j]=sheet.getRow(i+1).getCell(j).toString();
            }
        }
        return data;
    }
}
