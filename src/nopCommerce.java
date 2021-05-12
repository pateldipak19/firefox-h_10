import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import java.util.concurrent.TimeUnit;

public class nopCommerce {

    public static void main(String[] args) {

        String baseUrl = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(baseUrl);

        String title = driver.getTitle();
        System.out.println(title.length());
        System.out.println(title);
        boolean verifyTitle = title.equals("Store Demo - nopCommerce");
        boolean verifyContains = title.contains("Demo");
        System.out.println(verifyContains);
        System.out.println(verifyTitle);

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        driver.close();


    }
}
