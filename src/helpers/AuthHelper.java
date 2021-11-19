package helpers;

import entities.User;
import manager.AppManager;

public class AuthHelper extends BaseHelper {
    public AuthHelper(AppManager manager) {
        super(manager);
    }

    private void openLoginForm() {
        findElementByLinkText("Войти").click();
    }

    public void logout() {
        manager.getNavigationHelper().goToSettings();
        findElementBySelector(".top-mbs > .noselect").click();
    }

    public void auth(User user) {
        openLoginForm();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        findElementBySelector("form > div:nth-child(1) > div > input").sendKeys(user.getLogin());
        findElementBySelector("form > div:nth-child(2) > div > input").sendKeys(user.getPassword());
        findElementBySelector(".wide:nth-child(3)").click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
