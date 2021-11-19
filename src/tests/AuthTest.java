package tests;

import org.junit.jupiter.api.Test;
import utils.BaseTest;

public class AuthTest extends BaseTest {
    @Override
    @Test
    public void test() {
        app.getAuthHelper().auth(app.getDefaultUser());

        app.getAuthHelper().logout();
    }
}
