package Utilities;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils extends BaseClass {

    private static WebElement element;

    public static void toClick(WebElement element){
        element.click();
    }

    public static void toSend(WebElement element, String text){
        element.sendKeys(text);
    }

    public static String toAlertText(){

        return getDriver().switchTo().alert().getText();
    }

    private static WebDriver getDriver() {
        return null;
    }

    public static void toAlertAccept(){

        getDriver().switchTo().alert().accept();
    }
}
