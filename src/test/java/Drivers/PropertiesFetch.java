package Drivers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFetch {
    public static String url,popup,searchbar,searchButton,itemDesc,addtoCart,PlaceOrder,totalCash,continueButton,sendingKeys;
    public static String eng,Continue,SearchBar,Sec_bar,locPop,item,Add,Apply,GoToCart,Color,Price,placeOrder,LoginF;
    public static void prop() throws IOException {
        FileInputStream file = new FileInputStream("src/test/resources/ObjectRepo.properties");
        Properties proP = new Properties();
        proP.load(file);

        //Web Objects
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

        //App Objects
        eng = proP.getProperty("english");
        Continue = proP.getProperty("Continue");
        SearchBar = proP.getProperty("SearchBar");
        Sec_bar = proP.getProperty("SecondBar");
        locPop = proP.getProperty("LocationPop");
        item = proP.getProperty("Item");
        Add = proP.getProperty("Add_Button");
        Apply = proP.getProperty("apply_Button");
        GoToCart = proP.getProperty("GotoCart");
        Color = proP.getProperty("ColorItem");
        Price = proP.getProperty("PriceofItem");
        placeOrder = proP.getProperty("placeOrderButton");
        LoginF = proP.getProperty("Login");
    }
}
