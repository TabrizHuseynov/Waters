package Pages;

import org.apache.log4j.Logger;

import org.openqa.selenium.support.PageFactory;

import utils.Driver;


//everything that is in common among pages
//can go here
//so we can keep them here
public class BasePage {
    private static Logger logger = Logger.getLogger(BasePage.class);


    public BasePage() {
        //this method requires to provide webdriver object for @FindBy
        //and page class
        //this means this page class
        PageFactory.initElements(Driver.get(), this);
    }


}
