package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class RealtListingPage extends BasePage {


    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("/html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/div/section/rz-grid/ul/li");

    public void checkCountCards () {
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, 60);
    }
}
