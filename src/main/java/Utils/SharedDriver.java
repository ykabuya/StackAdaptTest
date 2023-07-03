package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;


// This class is used to set up the driver
public class SharedDriver {

    private static WebDriver webDriver;

    public enum Browser {
        CHROME,
        FIREFOX,
        IE
    }

    //This method is used to create the driver
    //It returns the driver
    protected static WebDriver getWebDriver(Browser browser) {
        switch (browser) {

            case CHROME:
                ChromeOptions options = new ChromeOptions();
//                options.addArguments("--no-sandbox");
//                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--headless");


                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver();
                break;


            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                webDriver = new FirefoxDriver();
                break;

            case IE:
                WebDriverManager.iedriver().setup();
                webDriver = new InternetExplorerDriver();
                break;
        }
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return webDriver;
    }

    protected static void closeDriver() {
        if (webDriver != null) {
            webDriver.close();
        }
    }
}