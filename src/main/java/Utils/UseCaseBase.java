package Utils;
import Pages.BasePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;


// This class is used to set up the driver and the page for the tests
public class UseCaseBase {
    private static WebDriver webDriver;
    private static BasePage page;


    @BeforeAll
    public static void setUpMain() {
        page = new BasePage();
        webDriver = SharedDriver.getWebDriver(SharedDriver.Browser.CHROME);
        webDriver.getCurrentUrl();
        page.setWebDriver(webDriver);
    }

    @AfterAll
    public static void tearDownMain() {
        SharedDriver.closeDriver();
        webDriver = null;
    }

}


