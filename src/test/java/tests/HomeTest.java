
package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {

    @Test
    public void testHomeNavigation() {
        HomePage home = new HomePage(driver);
        home.clickMenu();
        home.clickProduct();
    }
}
