package helpers;

import entities.Order;
import manager.AppManager;

public class CartHelper extends BaseHelper{
    public CartHelper(AppManager manager) {
        super(manager);
    }

    public void removeProductFromCart() {
        findElementBySelector(".action-label").click();
        findElementBySelector(".action-button:nth-child(1) > .hidden-mbs").click();
    }

    public void increaseOrderNumber() {
        findElementBySelector("#tooltip>button.noselect.increment").click();
    }

    public Order getLastCreatedOrder() {
        String name = findElementBySelector(".product-title>a").getText();
        String seller = findElementBySelector(".info-container>.options>.option>a").getText();
        String price = findElementBySelector(".currency.new-price").getText();
        String number = findElementBySelector(".item-amount>div>div>input").getDomProperty("value");

        return new Order(name, seller, number, price);
    }
}
