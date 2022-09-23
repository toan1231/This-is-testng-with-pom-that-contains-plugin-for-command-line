package orlandoHealthSignUpPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrlandoSignUpPage {
    WebDriver driver;
    public OrlandoSignUpPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
@FindBy(xpath = "//*[@class='header-bar header-bar--main']/div[3]/a")
   public List<WebElement> subMenu;
}
