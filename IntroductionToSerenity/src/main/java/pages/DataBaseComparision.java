package pages;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
 

public class DataBaseComparision {
	public static void main(String[] args) throws IOException {
        // Provide the path to your Excel file
        String filePath = "C://Users//906688//eclipse-workspace//IntroductionToSerenity//ExcelData//DataBases.xlsx";

        // Load the Excel file
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fileInputStream);

        // Specify the sheets you want to compare
        Sheet sheet1 = workbook.getSheet("Sheet1");
        Sheet sheet2 = workbook.getSheet("Sheet2");

        // Compare data in the sheets
        boolean sheetsAreEqual = compareSheets(sheet1, sheet2);

        if (sheetsAreEqual) {
            System.out.println("Sheets are equal.");
        } else {
            System.out.println("Sheets are not equal.");
        }

        // Close the workbook
        workbook.close();
    }

    private static boolean compareSheets(Sheet sheet1, Sheet sheet2) {
        // Compare the number of rows
        if (sheet1.getPhysicalNumberOfRows() != sheet2.getPhysicalNumberOfRows()) {
            return false;
        }

        // Compare the data in each cell
        for (int i = 0; i < sheet1.getPhysicalNumberOfRows(); i++) {
            Row row1 = sheet1.getRow(i);
            Row row2 = sheet2.getRow(i);

            for (int j = 0; j < row1.getPhysicalNumberOfCells(); j++) {
                Cell cell1 = row1.getCell(j);
                Cell cell2 = row2.getCell(j);

                if (!getCellDataAsString(cell1).equals(getCellDataAsString(cell2))) {
                    return false;
                }
            }
        }

        return true;
    }

    private static String getCellDataAsString(Cell cell) {
        // Handle different cell types as needed
        if (cell.getCellType() == CellType.NUMERIC) {
            return String.valueOf(cell.getNumericCellValue());
        } else {
            return cell.getStringCellValue();
        }
    }
  


}
