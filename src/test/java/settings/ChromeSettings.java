package settings;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;

public class ChromeSettings implements IWebDriverSettings {

    @Override
    public AbstractDriverOptions setting() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("headless");

        return chromeOptions;
    }
}

