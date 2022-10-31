package scrollingUpscrollingDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import java.util.List;

public class OrlandoHealthScrolling {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("our method is starting working");
    }
    @AfterMethod
   public void afterMethod(){
       // driver.quit();
    }
    @Test
    public void SrollingUpAndDown(){
        System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");

        driver = new EdgeDriver();


        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("orlandoHealth.properties","orlandoHealth.url"));
        JavascriptExecutor st=(JavascriptExecutor)driver;
        st.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[text()='REFILL MY PRESCRIPTION']")));


       driver.get("https://www.governmentjobs.com/jobs/3739742/software-engineer-i-ii-information-technology");
 driver.findElement(By.id("signup-button")).click();
 List<WebElement>m= driver.findElements(By.xpath("//*[@id=\"popup-register-email-field\"]"));
        m.get(0).sendKeys("hellow");
    }




}
