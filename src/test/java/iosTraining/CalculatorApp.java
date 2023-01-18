package iosTraining;

import Constants.Constant;
import Drivers.Actions;
import Drivers.Driver;
import Pages.Calculator.CalculatorPage;

public class CalculatorApp {
    public static void main(String[] args) {
        Driver.invokeIOS(Constant.CALCULATOR);
        Actions.isElementVisible(CalculatorPage.result,"Result section");
        Actions.textAssertion(CalculatorPage.result,"0","Result section");
        Actions.taps(CalculatorPage.six,"Six button");
        Constant.first = Integer.parseInt(Actions.getText(CalculatorPage.six,"Six button"));
        Actions.taps(CalculatorPage.add,"+ button");
        Actions.taps(CalculatorPage.seven,"Seven button");
        Constant.second = Integer.parseInt(Actions.getText(CalculatorPage.seven,"Seven button"));
        Actions.getText(CalculatorPage.result,"Result section");
        Actions.taps(CalculatorPage.equals,"Equal button");
        Actions.textAssertion(CalculatorPage.result, String.valueOf(Constant.first+Constant.second),"Result section");
    }
}
