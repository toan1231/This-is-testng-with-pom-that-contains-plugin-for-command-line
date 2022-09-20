package orlandoHealthloginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyChartPage extends OrlandoHealthLoginPage {

    WebDriver driver;
    public MyChartPage(WebDriver driver){

       super(driver);
    }
    @FindBy(css = "[title='Schedule an Appointment']")
    public WebElement appointmentButton;
}
