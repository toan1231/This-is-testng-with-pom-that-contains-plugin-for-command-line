package orlandoHealthloginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import java.sql.Driver;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class OrlandoHealthLoginPageTest {
    WebDriver driver;


    @BeforeClass
    public void dkjfd(){
       // System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    }




@BeforeMethod(groups = "regression")
    public void launchTheWebSite() {


        System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");

       // driver = new ChromeDriver();
        driver=new EdgeDriver();

        driver.manage().window().maximize();








    }
    @AfterMethod
    public void kjfd(){
        driver.quit();

    }
    @Test(groups = "regression")
    public void user_click_on_Mychart() throws InterruptedException {

driver.get("https://www.orlandohealth.com/");
        driver.findElement(By.xpath("//*[@title='MyChart']")).click();

}
@Test(groups = {"regression"})
public void user_click_on_appointment(){
    driver.get("https://www.orlandohealth.com/");

    driver.findElement(By.xpath("//*[@title='MyChart']")).click();
    driver.findElement(By.cssSelector("[title='Schedule an Appointment']")).click();



}
@Test(groups = "regression")
public void user_click_on_cardiology() throws InterruptedException {
    driver.get("https://www.orlandohealth.com/");
    driver.findElement(By.xpath("//*[@title='MyChart']")).click();
    driver.findElement(By.cssSelector("[title='Schedule an Appointment']")).click();

    String mother=driver.getWindowHandle();
    Set<String> allWindow=driver.getWindowHandles();
    for(String child:allWindow){
        if(!child.equals(child)){
            driver.switchTo().window(child);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"scheduling-workflow\"]/div[1]/div/div/div[2]/div[1]/div/a[1]/div")).click();

        }



    }


    }

    @Test(groups = "regression")
    public void userCanSeeSignUpNow() throws InterruptedException {

        driver.get("https://www.orlandohealth.com/");

        driver.findElement(By.xpath("//*[@title='MyChart']")).click();
        driver.findElement(By.cssSelector("[title='Schedule an Appointment']")).click();

    Thread.sleep(3000);
List<WebElement>subMenu=driver.findElements(By.xpath( "//*[@class='content-section content-section-desktop center-left']/div[1]/div[2]/a"));
   for (WebElement element:subMenu){

       System.out.println(element.getText());
   }

    }
    @Test(groups = "smoke")
    public void dfjk(){
        System.out.println("this is test1");
    }

}




