package stepDefination;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HashMapTo_Excel
{
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();//Empty workbook
        XSSFSheet sheet = workbook.createSheet("Test_Data");//empty sheet

        HashMap<String,String> data=new HashMap<String,String>();

        data.put("user_1","Password_1");
        data.put("user_2","Password_2");
        data.put("user_3","Password_3");
        data.put("user_4","Password_4");
        data.put("user_5","Password_5");

        int row_no=0;

        for(Map.Entry  entry :data.entrySet())
        {
             XSSFRow row= sheet.createRow(row_no++);
             row.createCell(0).setCellValue((String)entry.getKey());
             row.createCell(1).setCellValue((String)entry.getValue());

        }
        FileOutputStream fos=new FileOutputStream(".\\Test_data.xlsx");
        workbook.write(fos);//add workbook to file
        fos.close();//close the file
    }
}
