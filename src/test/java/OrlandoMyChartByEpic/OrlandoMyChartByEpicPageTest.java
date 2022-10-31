package OrlandoMyChartByEpic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import orlandoHealthSignUpPage.OrlandoSignUpPage;
import orlandoHealthloginPage.MyChartPage;
import orlandoHealthloginPage.OrlandoHealthLoginPage;
import utilities.ConfigurationReader;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class OrlandoMyChartByEpicPageTest {
    MyChartPage myChartPage;
    WebDriver driver;
    OrlandoSignUpPage orlandoSignUpPage;
    OrlandoHealthLoginPage orlandoHealthLoginPage;

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {

            System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
            driver=new EdgeDriver();
            driver.manage().window().maximize();

        driver.get(ConfigurationReader.getProperty("orlandoHealth.properties","orlandoHealth.url"));
        orlandoSignUpPage=new OrlandoSignUpPage(driver);
        orlandoHealthLoginPage=new OrlandoHealthLoginPage(driver);
        orlandoHealthLoginPage.myChartButton.click();
        myChartPage=new MyChartPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
    @Test
    public void userSeeMyChartByEpic(){
        myChartPage.appointmentButton.click();

    }
    @Test
    public void userCanSeeBackWord() throws InterruptedException {
        myChartPage.appointmentButton.click();
        String parent=driver.getWindowHandle();
        Set<String>allWindows=driver.getWindowHandles();
        for(String child: allWindows){
            if(!child.equals(parent)){
                driver.switchTo().window(child);
            }
            Thread.sleep(3000);
        }
        driver.findElement(By.xpath("//*[text()='Cardiology']")).click();
        driver.findElement(By.cssSelector(".summary-back")).getText();
        Assert.assertEquals(driver.findElement(By.cssSelector(".summary-back")).getText(),"Back");
        System.out.println(driver.findElement(By.cssSelector(".summary-back")).getText());
    }
    @Test
    public void testingWithNumber(){
        System.out.println("hellow world I am living in Florida");
    }
    @Test(groups = {"smoke"})
    public void dfjk(){
        System.out.println("this is test 3");
    }
}
