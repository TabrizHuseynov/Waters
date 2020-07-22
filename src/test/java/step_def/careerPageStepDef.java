package step_def;

import Pages.BasePage;
import Pages.CareerPage;
import io.cucumber.java.en.Given;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigurationReader;
import utils.Driver;


public class careerPageStepDef extends BasePage {
    private static Logger logger = Logger.getLogger(careerPageStepDef.class);
    CareerPage careerPage = new CareerPage() ;
    JavascriptExecutor js = (JavascriptExecutor) Driver.get();
    WebDriverWait wait = new WebDriverWait(Driver.get(), 30);// 1 minute


    @Given("user is on the career page")
    public void user_is_on_the_career_page() {
        logger.info("user opening the home page");
       Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Given("enters the job id {string} to searchbox")
    public void enters_the_job_id_to_searchbox(String jobID) {
        logger.info("user passing the 11688 job id to search box");
        Driver.get().switchTo().frame("icims_content_iframe").findElement(By.xpath("//input[@name='searchKeyword']")).sendKeys(jobID);

    }

    @Given("user verifies that the page displays the correct posting number")
    public void user_verifies_that_the_page_displays_the_correct_posting_number() {
        logger.info("user verifies that req.# 11688");
        careerPage.searchBox.sendKeys(Keys.ENTER);
        String num = careerPage.reqNum.getAttribute("innerHTML");
        Assert.assertTrue(num.contains("11688"));



}

}


