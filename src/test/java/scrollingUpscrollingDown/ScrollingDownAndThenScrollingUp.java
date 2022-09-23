package scrollingUpscrollingDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;

public class ScrollingDownAndThenScrollingUp {
    WebDriver driver;
    @Test(groups = "smoke")
    public void SrollingUpAndDown() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("orlandoHealth.properties","orlandoHealth.url"));
        JavascriptExecutor st=(JavascriptExecutor)driver;
        st.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(5000);
        st.executeScript("window.scrollBy(-0,5000)");

       // st.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[text()='REFILL MY PRESCRIPTION']")));


    }
}
