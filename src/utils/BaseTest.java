package utils;

import manager.AppManager;
import org.junit.jupiter.api.BeforeAll;

public abstract class BaseTest {
    protected static AppManager app;

    @BeforeAll
    public static void setUp() {
        app = AppManager.getInstance();
        app.openSite();
    }

    public abstract void test();
}
