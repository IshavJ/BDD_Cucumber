package stepDefination;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Excel_toHashMap
{
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream(".\\Test_data.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(fis);
        XSSFSheet sheets=workbook.getSheet("Test_data");
         int row= sheets.getLastRowNum();

        HashMap<String,String> data=new HashMap<String,String>();

        for (int i=0;i<=row;i++)
        {
            String key=sheets.getRow(i).getCell(0).getStringCellValue();
            String value=sheets.getRow(i).getCell(1).getStringCellValue();
            data.put(key,value);


        }
        for(Map.Entry entry: data.entrySet())
        {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
}
