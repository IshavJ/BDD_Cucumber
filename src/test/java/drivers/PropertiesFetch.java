package drivers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFetch {
    public static String url,popup,searchbar,searchButton,itemDesc,addtoCart,PlaceOrder,totalCash,continueButton,sendingKeys;
    public static void prop() throws IOException {
        FileInputStream file = new FileInputStream("src/test/resources/ObjectRepo.properties");
        Properties proP = new Properties();
        proP.load(file);

        url = proP.getProperty("url");
        popup = proP.getProperty("popup");
        searchbar = proP.getProperty("searchBar");
        searchButton = proP.getProperty("searchButton");
        itemDesc = proP.getProperty("itemText");
        addtoCart = proP.getProperty("addTocart");
        PlaceOrder = proP.getProperty("placeOrder");
        totalCash = proP.getProperty("totalCash");
        continueButton = proP.getProperty("continueButton");
        sendingKeys = proP.getProperty("sendtxt");
    }
}
