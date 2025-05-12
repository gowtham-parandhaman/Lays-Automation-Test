
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By menu = By.xpath("//a[contains(text(),'Snacks')]");
    By chipsLink = By.linkText("LAY’S® Classic Potato Chips");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMenu() {
        driver.findElement(menu).click();
    }

    public void clickProduct() {
        driver.findElement(chipsLink).click();
    }
}
