package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebSiteMainPage {
     @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
     private WebElement submitButton;

     @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
     private WebElement emailField;

     @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
     private WebElement readMoreButtonOfFundamentalArea;

     @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
     private WebElement submitQuestionButton;

     @FindBy(xpath = "//*[@id=\"questions\"]")
     private WebElement scrollToFrequentlyAskedQuestions;

     @FindBy(xpath = "//*[@id=\"questions\"]/div[2]/h3/button")
     private WebElement howMuchDoesItCostToAttendButton;

     @FindBy(xpath = "//*[@id=\"questions\"]/div[1]/h3/button")
     private WebElement WhereIsYourInstitutionLocatedButton;

     @FindBy(xpath = "//*[@id=\"learn-selenium\"]")
     private WebElement scrollToSeleniumSection;

     @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/a")
     private WebElement readMoreButton;

     @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
     private WebElement submitInstructorsButton;

     @FindBy (xpath = "//*[@id=\"instructors\"]")
     private WebElement scrollToInstructorsArea;

     @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[1]/i")
     private WebElement clickOnJohnDoeTwitterButton;

     @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[2]/div/div/a[2]/i")
     private WebElement clickOnJaneDoeFacebookButton;

     @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[3]/div/div/a[3]/i")
     private WebElement clickOnSteveSmithLinkedInButton;

     @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[4]/div/div/a[4]/i")
     private WebElement clickOnSaraSmithInstagramButton;

     public WebSiteMainPage(WebDriver driver){
          PageFactory.initElements(driver, this);
     }

     public void clickOnTheSubmitButton(){
          this.submitButton.click();
     }

     public void inputEmail(String string){
          this.emailField.sendKeys(string);
     }

     public void clickOnTheReadMoreButtonOfTheFundamentalArea(){this.clickOnTheReadMoreButtonOfTheFundamentalArea();}

     public void clickOnTheQuestionButton(){this.submitQuestionButton.click();}

     public WebElement getScrollToFrequentlyAskedQuestions(){return this.scrollToFrequentlyAskedQuestions;}

     public void clickOnHowMuchDoesItCostToAttendButton(){this.howMuchDoesItCostToAttendButton.click();}

     public void clickOnWhereIsYourInstitutionLocatedButton(){this.WhereIsYourInstitutionLocatedButton.click();}

     public WebElement getScrollToSeleniumSection(){return this.scrollToSeleniumSection; }

     public void clickOnReadMoreButton(){this.readMoreButton.click();}

     public void clickOnTheInstructorsButton(){this.submitInstructorsButton.click();}

     public WebElement getScrollToInstructorsArea(){return this.scrollToInstructorsArea;}

     public void clickOnJohnDoeTwitterButton() {this.clickOnJohnDoeTwitterButton.click();}

     public void setClickOnJaneDoeFacebookButton() {this.clickOnJaneDoeFacebookButton.click();}

     public void setClickOnSteveSmithLinkedInButton() {this.clickOnSteveSmithLinkedInButton.click();}

     public void setClickOnSaraSmithInstagramButton() {this.clickOnSaraSmithInstagramButton.click();}

     }

