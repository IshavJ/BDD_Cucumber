package stepDefination;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Excel_DataRead_1
{
    @Test
    public void dataRead() throws IOException
    {
        File src=new File("C:\\Users\\HP\\Desktop\\New Microsoft Excel Worksheet.xlsx");
        FileInputStream fis=new FileInputStream(src);
        XSSFWorkbook xfs=new XSSFWorkbook(fis);
        XSSFSheet sheet=xfs.getSheetAt(0);

        int row= sheet.getLastRowNum();
        HashMap<String,String> data=new HashMap<String,String>();

        for (int i=0;i<=row;i++)
        {
            String key=sheet.getRow(i).getCell(0).getStringCellValue();
            String value=sheet.getRow(i).getCell(0).getStringCellValue();
            data.put(key,value);


        }

        for(Map.Entry entry: data.entrySet())
        {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

    }
}
