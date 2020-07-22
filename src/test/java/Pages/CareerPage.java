package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

import java.util.List;

public class CareerPage extends BasePage {

    @FindBy(xpath = "//input[@name='searchKeyword']")
    public WebElement searchBox ;

    @FindBy(xpath = "(//div//dl//dd[@class='iCIMS_JobHeaderData'])[1]")
    public WebElement reqNum ;

    public CareerPage() {
        //it's mandatory if you want to use @FindBy annotation
        //Driver.get() return webdriver object
        PageFactory.initElements(Driver.get(), this);
    }



}
