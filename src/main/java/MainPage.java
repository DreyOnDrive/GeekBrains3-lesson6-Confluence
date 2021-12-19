import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class MainPage extends BaseView {
    public MainPage(WebDriver driver ) {
        super(driver);
    }

    private final static String createButtonXpath = "//span[text()[contains(.,'Создать')]]";
    @FindBy(xpath = createButtonXpath)
    private  WebElement createButton;
    public WikiPage clickCreateButton () throws InterruptedException {
        Thread.sleep(5000);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(createButtonXpath)));
        createButton.click();
        return new WikiPage(driver);
    }

    private final static String SECTION_BUTTON_XPATH = "//span[.='Разделы']";
    @FindBy(xpath = SECTION_BUTTON_XPATH)
    private  WebElement sectionButton;
    public MainPage clickSectionButton () {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(createButtonXpath)));
        sectionButton.click();
        return this;
    }

    private final static String NEW_SECTION_BUTTON_XPATH = "//span[.='Создать раздел']";
    @FindBy(xpath = NEW_SECTION_BUTTON_XPATH)
    private  WebElement newSectionButton;
    public NewSectionBlock clickNewSectionButton () {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NEW_SECTION_BUTTON_XPATH)));
        newSectionButton.click();
        return new NewSectionBlock(driver);
    }
}
