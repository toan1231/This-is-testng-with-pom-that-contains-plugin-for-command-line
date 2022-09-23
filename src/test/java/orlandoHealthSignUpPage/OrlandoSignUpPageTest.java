package orlandoHealthSignUpPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import orlandoHealthloginPage.OrlandoHealthLoginPage;
import utilities.ConfigurationReader;

import java.sql.Driver;
import java.sql.Wrapper;
import java.util.List;

public class OrlandoSignUpPageTest {
    OrlandoSignUpPage orlandoSignUpPage;
    OrlandoHealthLoginPage orlandoHealthLoginPage;
    WebDriver driver;


    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
      //  driver.get("https://www.orlandohealth.com/");
        driver.get(ConfigurationReader.getProperty("orlandoHealth.properties","orlandoHealth.url"));
        orlandoSignUpPage=new OrlandoSignUpPage(driver);
        orlandoHealthLoginPage=new OrlandoHealthLoginPage(driver);
        orlandoHealthLoginPage.myChartButton.click();
    }

    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
@Test(groups = "regression")
public void userShouldSeeSubMenu()  {

    List<WebElement>submenu=orlandoSignUpPage.subMenu;
    String[] expectedSubMenu={"Sign In","Sign Up Now","Schedule an Appointment"};
    for(int a=0;a<submenu.size();a++){
       String subMenuItem= submenu.get(a).getText();
        System.out.println(subMenuItem);

    }



         }




}


