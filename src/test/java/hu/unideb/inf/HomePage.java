package hu.unideb.inf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Optional;

public class HomePage {

    private static final String PAGE_URL = "http://automationpractice.com/";

    private static final By LOGIN_ERROR = By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li");
    private static final By CONTACT_ERROR = By.cssSelector("#center_column > div > ol > li");

    private static final By SEARCH_ERROR = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/p");
    public Optional<String> getSearchError() {
        return getErrorMessage(SEARCH_ERROR);
    }



    private static final By NEWS_ERROR = By.xpath("/html/body/div/div[2]/div/p");
    public Optional<String> getNewsError() {
        return getErrorMessage(NEWS_ERROR);
    }

    private static final By NEWS_ERROR2 = By.xpath("/html/body/div/div[2]/div/p");
    public Optional<String> getNewsError2() {
        return getErrorMessage(NEWS_ERROR2);
    }


    private static final By PrintedDress = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/h5/a");
    public static By getPrintedDress() {
        return PrintedDress;
    }

    private static final By newsletter_su = By.xpath("/html/body/div/div[3]/footer/div/div[1]/div/form/div/input[1]");
    public static By getNewsletter_su(){
        return newsletter_su;
    }

    private static final By createAccountError = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[1]/ol/li");
    public Optional<String> getcreateAccountError() {
        return getErrorMessage(createAccountError);
    }

    private static final By registererror = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/p");
    public Optional<String> getregistererrors() {
        return getErrorMessage(registererror);
    }

    public static final By welcomeToAccount = By.xpath("/html/body/div/div[2]/div/div[3]/div/h1");





    public void selectDropDown(String fieldName , String text){
        Select select = new Select(getField(By.id(fieldName)));
        select.selectByVisibleText(text);
    }



    @FindBy(className = "login")
    private WebElement signInLink;

    @FindBy(id = "SubmitLogin")
    private WebElement signInButton;

    @FindBy(id = "contact-link")
    private WebElement contactUsLink;

    @FindBy(id = "submitMessage")
    private WebElement sendButton;

    @FindBy(name = "submitNewsletter")
    private WebElement newsletter;

    public WebElement getNewsletter() {
        return newsletter;
    }
    public void clicknewsButton(){ newsletter.click();}

    @FindBy(name = "SubmitCreate")
    private WebElement SubmitCreate;

    public void clicksubmitcreate(){
        SubmitCreate.click();
    }

    //

    @FindBy(name ="submit_search")
    private WebElement searchButton;

    public WebElement getSearchButton() {
        return searchButton;
    }

    public void clicksearchButton(){searchButton.click();}

    @FindBy(id = "submitAccount")
    private WebElement submitAccount;

    public WebElement getSubmitAccount() {
        return submitAccount;
    }

    public void submitAccountClicked(){ submitAccount.click();}

//


    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void clickSignInLink() {
        signInLink.click();
    }

    public void clickSignInButton() {
        signInButton.click();
    }


    public Optional<String> getLoginError() {
        return getErrorMessage(LOGIN_ERROR);
    }

    public Optional<String> getContactError() {
        return getErrorMessage(CONTACT_ERROR);
    }

    public void fillField(String field, String value) {
        getField(By.id(field)).sendKeys(value);
    }

    public WebElement getField(By locator) {
        return driver.findElement(locator);
    }

    public WebElement getSignInLink() {
        return signInLink;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public WebElement getContactUsLink() {
        return contactUsLink;
    }

    public WebElement getSendButton() {
        return sendButton;
    }

    private Optional<String> getErrorMessage(By errorLocator) {
        Optional<WebElement> error = getError(errorLocator);
        if (error.isPresent()) {
            WebElement errorElement = error.get();
            return Optional.of(errorElement.getText());
        } else {
            return Optional.empty();
        }
    }

    private Optional<WebElement> getError(By errorLocator) {
        List<WebElement> elements = driver.findElements(errorLocator);
        if (elements.size() > 0) {
            return Optional.of(elements.get(0));
        } else {
            return Optional.empty();
        }
    }
}
