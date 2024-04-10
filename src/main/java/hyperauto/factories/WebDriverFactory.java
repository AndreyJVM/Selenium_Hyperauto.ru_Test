package hyperauto.factories;

import hyperauto.exceptions.BrowserNotSupportedException;
import hyperauto.factories.configurators.browsers.ChromeConfigure;
import hyperauto.factories.configurators.browsers.FirefoxConfigure;
import hyperauto.factories.configurators.browsers.OperaConfigure;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import java.util.Locale;

public class WebDriverFactory implements IFactory<EventFiringWebDriver>{
    private final String browserName = System.getProperty("browser", "chrome").toLowerCase(Locale.ROOT);

    @Override
    public EventFiringWebDriver create() {

        return switch (browserName) {
            case "chrome" -> new EventFiringWebDriver(new ChromeConfigure().configure());
            case "firefox" -> new EventFiringWebDriver(new FirefoxConfigure().configure());
            case "opera" -> new EventFiringWebDriver(new OperaConfigure().configure());

            default -> throw new BrowserNotSupportedException(browserName);
        };
    }
}