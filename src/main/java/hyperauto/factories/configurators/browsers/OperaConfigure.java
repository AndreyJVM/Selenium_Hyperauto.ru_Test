package hyperauto.factories.configurators.browsers;

import hyperauto.factories.configurators.IBrowserConfigure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class OperaConfigure implements IBrowserConfigure {
    @Override
    public WebDriver configure() {
        OperaOptions operaOptions = new OperaOptions();

        operaOptions.addArguments("start-maximized");

        return new OperaDriver(operaOptions);
    }
}
