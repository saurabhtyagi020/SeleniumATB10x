package org.example.Ex_12_DataDriven;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class UtilExcel
{


    static Workbook book;
    static Sheet sheet;

    public static String Sheet_path=System.getProperty("user.dir")+"/src/test/resources/Untitled spreadsheet.xlsx";

    public static Object [][] getDataFromExcel(String sheetname)
    {
        FileInputStream file = null;
        try {
            file = new FileInputStream(Sheet_path);
            book = WorkbookFactory.create(file);
            sheet=book.getSheet(sheetname);
        } catch (IOException e) {
            System.out.println("File Not Found! or workbook not created!");
        }
        int totalRows = sheet.getLastRowNum(); // Excluding header
        int totalCols = sheet.getRow(0).getLastCellNum(); // Assuming row 0 has the most cells

        Object[][] data = new Object[totalRows][totalCols];

        for (int i = 0; i < totalRows; i++)
        {
            for (int j = 0; j < totalCols; j++) {

                data[i][j] = sheet.getRow(i+1).getCell(j).toString();
            }
        }

        return data;
    }
}
