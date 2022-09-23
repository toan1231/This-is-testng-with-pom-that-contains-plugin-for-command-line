package scrollingUpscrollingDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;

public class OrlandoHealthScrolling {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("our method is starting working");
    }
    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
    @Test(groups = "smoke")
    public void SrollingUpAndDown(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("orlandoHealth.properties","orlandoHealth.url"));
        JavascriptExecutor st=(JavascriptExecutor)driver;
        st.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[text()='REFILL MY PRESCRIPTION']")));
    }


}
