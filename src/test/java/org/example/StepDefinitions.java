package org.example;

import PageObjects.WebSiteMainPage;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class StepDefinitions {

    private final WebDriver driver = new ChromeDriver();

    private WebSiteMainPage mainPage;

    public StepDefinitions(){
        driver.manage().window().maximize();
        mainPage = new WebSiteMainPage(driver);
    }
    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        driver.get("file:///C:/Users/Marius/Desktop/De%20Mutat/Curs%2001.07.2022/Testing-Env/index.html");
    }
    @When("I enter the email address {string}")
    public void i_enter_an_valid_email_address(String string) {
        mainPage.inputEmail(string);
    }

    @Then("The email save pop-up message appear")
    public void the_email_save_pop_up_message_appear() {
        driver.switchTo().alert().accept();
    }

    @When("I click on the submit button")
    public void i_click_on_the_submit_button() {
        mainPage.clickOnTheSubmitButton();
    }
    @When("I click on the Read More button of the fundamental area")
    public void i_click_on_the_read_more_button_of_the_fundamental_area() {
    }
    @Then("The new main page appear")
    public void the_new_main_page_appear() {
    }
    @When("I click on the Questions button")
    public void i_click_on_the_questions_button() {
        mainPage.clickOnTheQuestionButton();
    }
    @Then("The main page scroll down to Frequently Asked Questions")
    public void the_main_page_scroll_down_to_frequently_asked_questions() {
    }
    @Then("I click on the How much does it cost to attend? Question")
    public void i_click_on_the_how_much_does_it_cost_to_attend_question() {
        Utils.scrollToElement(driver,mainPage.getScrollToFrequentlyAskedQuestions());
        mainPage.clickOnHowMuchDoesItCostToAttendButton();
    }
    @Then("The answer appear below the question")
    public void the_answer_appear_below_the_question() {
    }
    @Then("I click on the Where is your institution located? Question")
    public void i_click_on_the_where_is_your_institution_located_question() {
        Utils.scrollToElement(driver,mainPage.getScrollToFrequentlyAskedQuestions());
        mainPage.clickOnWhereIsYourInstitutionLocatedButton();
    }

    @When("I scroll down the page to Learn Selenium section")
    public void i_scroll_down_the_page_to_learn_selenium_section() {
        Utils.scrollToElement(driver, mainPage.getScrollToSeleniumSection());
    }
    @When("I click on the Read More button")
    public void i_click_on_the_read_more_button() {
        mainPage.clickOnReadMoreButton();
    }
    @Then("The new page title should start with Selenium")
    public void the_new_page_title_should_start_with_selenium() {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("selenium"));
    }
    @When("I click on the Instructors button")
    public void i_click_on_the_instructors_button() {
        mainPage.clickOnTheInstructorsButton();
    }
    @Then("The main page scroll down to Our Instructors area")
    public void the_main_page_scroll_down_to_our_instructors_area() {
        Utils.scrollToElement(driver, mainPage.getScrollToInstructorsArea());
    }
    @When("I click on John Doe twitter button")
    public void i_click_on_john_doe_twitter_button() {
        Utils.scrollToElement(driver, mainPage.getScrollToInstructorsArea());
        mainPage.clickOnJohnDoeTwitterButton();
    }
    @Then("The page should take me to {string} site")
    public void the_page_should_take_me_to_site(String string) {
        Utils.waitForElementToLoad(2);
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith(string));
    }

    @After
    public void closeBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "name");
        }
        driver.quit();
    }

}
