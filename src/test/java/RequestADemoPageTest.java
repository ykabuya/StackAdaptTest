
import Pages.RequestADemoPage;
import Pages.HomePage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RequestADemoPageTest extends UseCaseBase {
    private static HomePage homePage;
    private static final Logger logger = LogManager.getLogger(HomePageTest.class);
    private static RequestADemoPage requestADemoPage;

    @BeforeAll
    public static void classSetup() {
        homePage = new HomePage();
    }

    @BeforeEach
    public void beforeTest() {
        homePage.navigateToMainPage();
        requestADemoPage = homePage.clickOnRequestADemoButton();
        requestADemoPage.cookieInfoClose();

    }

    @Test
    @DisplayName("Request a demo page test")
    public void requestADemoPageTest() {
        logger.info("request a demo page test");
        requestADemoPage.firstNameInput();
        requestADemoPage.lastNameInput();
        requestADemoPage.businessEmailInput();
        requestADemoPage.phoneNumberInput();
        requestADemoPage.companyNameInput();
        requestADemoPage.jobTitleInput();
        requestADemoPage.chooseCompanyTypeDropbox();
        requestADemoPage.chooseCountryDropbox();
        requestADemoPage.chooseProvinceDropbox();
        requestADemoPage.clickOnSubmitButton();
        requestADemoPage.takeScreenshot("request a demo page incomplete filling errors");
    }


}
