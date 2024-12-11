package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageA1 extends BasePage {
    private final By field = By.xpath("//input[@id='i-subscribe-input']");
    private final WebElement fieldElement = driver.findElement(field);

    private final By button = By.xpath("//button[@class='button button--primary is-icon-only']");
    private final WebElement buttonElement = driver.findElement(button);

    public PageA1() {
        PageFactory.initElements(driver, this);
    }

    public void makeSubscribe(String email) {
        fieldElement.sendKeys(email);
        buttonElement.click();
    }
}
