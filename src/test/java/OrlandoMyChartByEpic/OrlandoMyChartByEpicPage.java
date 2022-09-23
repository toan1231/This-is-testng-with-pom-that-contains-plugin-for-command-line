package OrlandoMyChartByEpic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrlandoMyChartByEpicPage {
    WebDriver driver;
    public OrlandoMyChartByEpicPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[text()='Find a Doctor']")
    public WebElement findADoctorButton;
}
