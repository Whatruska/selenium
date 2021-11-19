package tests;

import entities.*;
import org.junit.jupiter.api.Test;
import utils.BaseTest;

public class CartCycleTest extends BaseTest {

  @Override
  @Test
  public void test() {
    createCartRecord();
    app.getCartHelper().removeProductFromCart();

    app.getAuthHelper().logout();
  }

  protected void createCartRecord() {
    Item item = new Item(2);

    app.getAuthHelper().auth(app.getDefaultUser());

    app.getNavigationHelper().goToClothesPage();

    app.getClothesHelper().openManClothesCategory();
    app.getClothesHelper().chooseClothesSortOptions();
    app.getClothesHelper().openProduct();

    app.getClothesHelper().chooseItemOptions(item);
    app.getClothesHelper().addProductToCart();

    app.getNavigationHelper().goToCartPage();
  }
}
