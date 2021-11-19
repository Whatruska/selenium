package helpers;

import manager.AppManager;

public class NavigationHelper extends BaseHelper{

    public NavigationHelper(AppManager manager) {
        super(manager);
    }

    public void goToSettings() {
        goToOrdersPage();
        findElementByLinkText("Настройки").click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void goToOrdersPage() {
        findElementBySelector(".action-button.slightly.regular").click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void goToCartPage() {
        findElementById("cart-button").click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void goToClothesPage() {
        findElementBySelector("#category-2 > .slightly.transparent.regular.noselect").click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
