package Steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Hooks {

    public static WebDriver driver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }
    public static JavascriptExecutor js() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        return js;
    }
    public static WebDriver driver = driver();
    public static JavascriptExecutor js = js();


}
