package pages.realt_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class RealtHomePage extends BasePage {

    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    private final By countRooms = By.xpath("/html/body/app-root/div/div/rz-super-portal/div/main/section/div[2]/rz-dynamic-widgets/rz-widget-list[1]/section/ul/li[1]/rz-list-tile/div/a[1]");
//    private final By option2rooms = By.xpath("//*[@id=\"bottom1532\"]/ul/li[1]/a/span/span");
//    private final By findBtn = By.xpath("//*[@id=\"filtering\"]");
    public RealtHomePage enterCountRooms(){
        driver.findElement(countRooms).click();
        return this;
    }

//    public RealtHomePage clickToFind(){
//        WebElement btnFind = driver.findElement(findBtn);
//        waitElementIsVisible(btnFind).click();
//        return this;
//    }
}
