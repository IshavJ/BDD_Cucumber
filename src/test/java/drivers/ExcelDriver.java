package drivers;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelDriver {
    public FileInputStream fis;
    public XSSFWorkbook workbook;
    public XSSFSheet sheet;
    public XSSFRow row;
    public XSSFCell cell;

    public ExcelDriver() throws Exception {
        fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/TstData.xlsx");
        workbook = new XSSFWorkbook(fis);
        fis.close();
    }

    public String getCellData(String sheetName, String colName, int rowNum) {
        try {
            int col_Num = -1;
            sheet = workbook.getSheet(sheetName);
            row = sheet.getRow(0);
            int r = sheet.getPhysicalNumberOfRows();
            System.out.println(r);
            for (int i = 0; i < row.getLastCellNum(); i++) {
                if (row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
                    col_Num = i;
            }

            row = sheet.getRow(rowNum - 1);
            cell = row.getCell(col_Num);

            if (cell.getCellTypeEnum() == CellType.STRING)
                return cell.getStringCellValue();
            else
                return String.valueOf(cell.getBooleanCellValue());
        } catch (Exception e) {
            e.printStackTrace();
            return "row " + rowNum + " does not exist  in Excel";
        }
    }

    public static void main(String args[]) throws Exception {
        ExcelDriver e = new ExcelDriver();
        System.out.println(e.getCellData("Sheet1","Data",2));
    }
}

