package hyperauto.factories.configurators.browsers;

import hyperauto.factories.configurators.IBrowserConfigure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxConfigure implements IBrowserConfigure {
    @Override
    public WebDriver configure() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();

        firefoxOptions.addArguments("start-maximized");

        return new FirefoxDriver(firefoxOptions);
    }
}
