import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class barclays {

    public static void main(String[] args) {

        String baseUrl = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(title.length());
        boolean verifyTitle = title.equals("Personal banking | Barclays");
        boolean verifyContains = title.contains("Barclays");
        System.out.println(verifyContains);
        System.out.println(verifyTitle);

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

       driver.close();

    }
}
