package helpers;

import entities.Item;
import manager.AppManager;

public class ClothesHelper extends BaseHelper {
    public ClothesHelper(AppManager manager) {
        super(manager);
    }

    public void openManClothesCategory() {
        findElementBySelector(".hug.category-list.category-list--child > li:nth-child(2)").click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void chooseClothesSortOptions() {
        findElementBySelector(".sort-select > div").click();
        findElementBySelector(".in-focus > div > ul > li:nth-child(3)").click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void chooseItemOptions(Item item) {
        findElementBySelector(".radio-item.regular.text-characteristic:nth-child(" + item.getSizeOption() + ")").click();
    }

    public void addProductToCart() {
        findElementBySelector(".add-to-cart").click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void openProduct() {
        findElementBySelector(".product-card-image.noselect").click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
