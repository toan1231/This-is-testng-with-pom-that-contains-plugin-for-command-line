package orlandoHealthSignUpPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OrlandoSignUpPage {
    WebDriver driver;
    public OrlandoSignUpPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

}
