package Pages;

import Constants.Consts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Constants.Consts.COUNTRY_DROPBOX;

public class RequestADemoPage extends BasePage {

    private static RequestADemoPage requestADemoPage;

    public void navigateToMainPage() {
        webDriver.get(Consts.MAIN_URL);
    }
    public void clickOnRequestADemoButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Consts.REQUEST_A_DEMO_BUTTON)));
        clickElementByXpath(Consts.REQUEST_A_DEMO_BUTTON);
    }
    public void cookieInfoClose() {
        clickElementByXpath(Consts.COOKIE_INFO_CLOSE);
    }
    public void firstNameInput() {
        sendTextToElementByXpath(Consts.FIRST_NAME_FIELD, Consts.TEST_FIRST_NAME);
    }
    public void lastNameInput() {
        sendTextToElementByXpath(Consts.LAST_NAME_FIELD, Consts.TEST_LAST_NAME);
    }
    public void businessEmailInput() {
        sendTextToElementByXpath(Consts.BUSINESS_EMAIL_FIELD, Consts.TEST_EMAIL);
    }
    public void phoneNumberInput() {
        sendTextToElementByXpath(Consts.PHONE_NUMBER, Consts.TEST_PHONE_NUMBER);
    }
    public void companyNameInput() {
        sendTextToElementByXpath(Consts.COMPANY_NAME, Consts.TEST_COMPANY_NAME);
    }
    public void jobTitleInput() {
        sendTextToElementByXpath(Consts.JOB_TITLE, Consts.TEST_JOB_TITLE);
    }

    public void chooseCompanyTypeDropbox() {
        findElementByXpath(Consts.COMPANY_TYPE_DROPBOX);
        clickElementByXpath(Consts.COMPANY_TYPE_DROPBOX);
        findElementByXpath(Consts.COMPANY_TYPE_CHOICE);
        clickElementByXpath(Consts.COMPANY_TYPE_CHOICE);
    }

    public void chooseCompanySizeDropbox() {
        clickElementByXpath(Consts.COMPANY_SIZE_DROPBOX);
        clickElementByXpath(Consts.COMPANY_SIZE_CHOICE);
    }

    public void chooseCountryDropbox() {
        WebElement dropdown = webDriver.findElement(By.name("country"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Canada");

    }
    public void chooseProvinceDropbox() {
        clickElementByXpath(Consts.PROVINCE_DROPBOX);
        clickElementByXpath(Consts.PROVINCE_CHOICE);

    }
    public void clickOnAgreementCheckBox() {
        findElementByXpath(Consts.AGREEMENT_LABEL);
        clickElementByXpath(Consts.AGREEMENT_LABEL);
    }
    public void clickOnSubmitButton() {
        clickElementByXpath(Consts.SUBMIT_BUTTON);
    }

    public boolean isDemoPageVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Consts.REQUEST_DEMO_LABEL)));
        return elementExist(Consts.REQUEST_DEMO_LABEL);
    }

}