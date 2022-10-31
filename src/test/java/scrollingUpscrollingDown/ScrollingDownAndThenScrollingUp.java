package scrollingUpscrollingDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;

public class ScrollingDownAndThenScrollingUp {
    WebDriver driver;
    @Test
    public void SrollingUpAndDown() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");

        driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("orlandoHealth.properties","orlandoHealth.url"));
        JavascriptExecutor st=(JavascriptExecutor)driver;
        st.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(5000);
        st.executeScript("window.scrollBy(-0,5000)");

       // st.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[text()='REFILL MY PRESCRIPTION']")));


    }
    @Test(groups = {"smoke"})
    public void dfjk(){
        System.out.println("this is test4");
    }
}
