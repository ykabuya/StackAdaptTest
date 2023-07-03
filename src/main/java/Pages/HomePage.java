package Pages;

import Constants.Consts;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends BasePage {

    public void navigateToMainPage() {
        webDriver.get(Consts.MAIN_URL);
    }

    public RequestADemoPage clickOnRequestADemoButton() {
        clickElementByXpath(Consts.REQUEST_A_DEMO_BUTTON);
        return new RequestADemoPage();
    }
    public void cookieInfoClose() {
        clickElementByXpath(Consts.COOKIE_INFO_CLOSE);
    }
    public boolean isIntroBannerVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Consts.TEXT_CONTENT)));
        return elementExist(Consts.INTRO_BANNER);
    }

}

