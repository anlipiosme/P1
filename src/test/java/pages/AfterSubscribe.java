package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterSubscribe extends BasePage {
    @FindBy(xpath = "//div[class='toast-content-title']")
    private WebElement title;

    @FindBy(xpath = "//div[@class='toast-content-text']")
    private WebElement text;

    public AfterSubscribe() {
        PageFactory.initElements(driver, this);
    }

    public String getTitle () {
        return title.getText();
    }

    public String getText () {
        return text.getText();
    }
}