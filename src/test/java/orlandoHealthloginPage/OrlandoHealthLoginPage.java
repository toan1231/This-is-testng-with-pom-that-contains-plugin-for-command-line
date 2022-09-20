package orlandoHealthloginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrlandoHealthLoginPage {
    WebDriver driver;
    public OrlandoHealthLoginPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
    @FindBy(css = ".btn.header-primary-btn.ohcontact")
    public WebElement contactButton;
    @FindBy(xpath = "//*[@class='header-bar header-bar-desktop']/div[2]/a")
    public List<WebElement>mainMenuList;
    @FindBy(id = "headerMenuButton")
    public WebElement menuSandwich;
    @FindBy(xpath ="//*[@class='desktop-head-logo']/img")
    public WebElement orlandoLogo;
    @FindBy(xpath = "//*[@title='Appointments']")
    public WebElement appointmentButton;
    @FindBy(xpath = "//*[@title='MyChart']")
    public WebElement myChartButton;
    @FindBy(id="waitTimeButton")
    public WebElement ERWaitTimeButton;
    public WebElement MyChartButton;
    public void login(String username,String password){
        myChartButton.sendKeys("");

    }




}
