package helpers;

import manager.AppManager;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.*;
import java.util.function.Function;

public abstract class BaseHelper {
    private final WebDriver driver;
    protected AppManager manager;

    public BaseHelper(AppManager manager) {
        this.manager = manager;
        this.driver = manager.getDriver();
    }

    private WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public WebElement findElementBySelector(String selector) {
        return findElement(By.cssSelector(selector));
    }

    public WebElement findElementById(String id) {
        return findElement(By.id(id));
    }

    public WebElement findElementByLinkText(String text) {
        return findElement(By.linkText(text));
    }
}
