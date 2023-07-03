import Pages.HomePage;
import Pages.RequestADemoPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;

public class HomePageTest extends UseCaseBase {

    private static HomePage homePage;


    private static final Logger logger = LogManager.getLogger(HomePageTest.class);

    @BeforeAll
    public static void classSetup() {
        homePage = new HomePage();
    }

    @BeforeEach
    public void beforeTest() {
        homePage.navigateToMainPage();
    }

    @Test
    @DisplayName("Click on request a demo button")
    public void clickOnRequestADemoButton() {
        logger.info("request a demo page open test");
        homePage.cookieInfoClose();
        RequestADemoPage requestADemoPageTest = homePage.clickOnRequestADemoButton();
        homePage.takeScreenshot("request a demo page is opened");
        Assertions.assertTrue(requestADemoPageTest.isDemoPageVisible());

    }
}







