package autodriver;
import utilis.ConfigUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Properties;

public class autodriver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client"); //use for Ip configured
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Properties prop = ConfigUtils.getsprop("data");

        driver.get(prop.getProperty("URL"));
        driver.quit();
    }
}
