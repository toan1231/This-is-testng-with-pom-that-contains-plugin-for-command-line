package orlandoHealthloginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class OrlandoHealthLoginPageTest {
    WebDriver driver;
   OrlandoHealthLoginPage orlandoHealthLoginPage;
   MyChartPage myChartPage;
    @BeforeClass
    public void dkjfd(){
       // System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    }




@BeforeMethod
    public void launchTheWebSite() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
     orlandoHealthLoginPage=new OrlandoHealthLoginPage(driver);
     myChartPage=new MyChartPage(driver);


        driver.get(ConfigurationReader.getProperty("orlandoHealth.properties", "orlandoHealth.url"));

    }
    @AfterMethod
    public void kjfd(){
        driver.quit();
    }
    @Test
    public void user_click_on_Mychart() throws InterruptedException {

        orlandoHealthLoginPage.myChartButton.click();


}
@Test
public void user_click_on_appointment(){
    orlandoHealthLoginPage.myChartButton.click();
       myChartPage.appointmentButton.click();


}
@Test
public void user_click_on_cardiology() throws InterruptedException {
    orlandoHealthLoginPage.myChartButton.click();
    myChartPage.appointmentButton.click();
    String mother=driver.getWindowHandle();
    Set<String> allWindow=driver.getWindowHandles();
    for(String child:allWindow){
        if(!child.equals(mother)){
            driver.switchTo().window(child);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"scheduling-workflow\"]/div[1]/div/div/div[2]/div[1]/div/a[1]/div")).click();
        }
    }
    Thread.sleep(4000);
    }

}




