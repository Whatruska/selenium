package manager;

import entities.User;
import helpers.AuthHelper;
import helpers.CartHelper;
import helpers.ClothesHelper;
import helpers.NavigationHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppManager {
    private static final ThreadLocal<AppManager> app = new ThreadLocal<>();

    private final WebDriver driver;

    private final AuthHelper authHelper;
    private final CartHelper cartHelper;
    private final ClothesHelper clothesHelper;
    private final NavigationHelper navigationHelper;

    private User user = new User("+79136560423", "qwerty12345A");
    private String baseUrl = "https://kazanexpress.ru/";

    private AppManager(WebDriver driver) {
        this.driver = driver;
        this.authHelper = new AuthHelper(this);
        this.cartHelper = new CartHelper(this);
        this.clothesHelper = new ClothesHelper(this);
        this.navigationHelper = new NavigationHelper(this);
    }

    private AppManager (WebDriver driver, String baseUrl) {
        this(driver);
        this.baseUrl = baseUrl;
    }

    private AppManager (WebDriver driver, String baseUrl, User user) {
        this(driver, baseUrl);
        this.user = user;
    }

    public static AppManager getInstance() {
        if (app.get() == null) {
            WebDriver driver = new ChromeDriver();
            AppManager instance = new AppManager(driver);
            app.set(instance);
        }
        return app.get();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public AuthHelper getAuthHelper() {
        return authHelper;
    }

    public CartHelper getCartHelper() {
        return cartHelper;
    }

    public ClothesHelper getClothesHelper() {
        return clothesHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public User getDefaultUser() {
        return this.user;
    }

    public void openSite() {
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    public void closeSite() {
        driver.close();
    }

    public void quit() {
        driver.quit();
    }
}
