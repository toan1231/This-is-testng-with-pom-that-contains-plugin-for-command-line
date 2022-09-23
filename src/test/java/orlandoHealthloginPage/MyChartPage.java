package orlandoHealthloginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyChartPage extends OrlandoHealthLoginPage {

    WebDriver driver;
    public MyChartPage(WebDriver driver){

       super(driver);
    }
    @FindBy(css = "[title='Schedule an Appointment']")
    public WebElement appointmentButton;
    @FindBy(xpath = "//*[@class='content-section content-section-desktop center-left']/div[1]/div[2]/a")
    public List<WebElement> signInSignUpNowAppoinment;
}
