import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseMethods {

    public static String readProperty(String property) {
        Properties prop;
        String value = null;
        try {
            prop = new Properties();
            prop.load(new FileInputStream(new File("config.properties")));

            value = prop.getProperty(property);

            if (value == null || value.isEmpty()) {
                throw new Exception("Value not set or empty");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return value;
    }

    public static AppiumDriver<?> returnDriver(String platform) throws Exception {

        String IOS_APP_PATH = System.getenv("IOS_APP_PATH");

        AppiumDriver<?> driver;

        DesiredCapabilities capabilities = new DesiredCapabilities();

        switch (platform.toLowerCase()) {

            case "android":
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("appium:deviceName", "pixel_5");
                capabilities.setCapability("appium:app", "/Users/dunice/Downloads/newsfeed.apk");
                capabilities.setCapability("appium:autoAcceptAlerts", "true");
                capabilities.setCapability("appium:autoGrantPermissions", "true");

                driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;

            case "ios":
                capabilities.setCapability("automationName", "XCUITest");
                capabilities.setCapability("platformName", "iOS");
                capabilities.setCapability("platformVersion", "15.5");
                capabilities.setCapability("deviceName", "iPhone 13");
                capabilities.setCapability("app", "Users/dunice/Downloads/newsfeed.app");
                capabilities.setCapability("autoAcceptAlerts", "true");
                capabilities.setCapability("autoGrantPermissions", "true");
              //  capabilities.setCapability("appium:autoAcceptAlerts", "true");
            //    capabilities.setCapability("appium:unicodeKeyboard", true);
              //  capabilities.setCapability("appium:resetKeyboard", true);
                capabilities.setCapability("no-reset", "true");

              //  capabilities.setCapability("udid", "");
              //  capabilities.setCapability("xcodeOrgId", "");
              //  capabilities.setCapability("xcodeSigningId", "");
              //  capabilities.setCapability("bundleID", "");

             //   capabilities.setCapability("language", "rus");

                driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;

            default:
                throw new Exception("Platform not supported");
        }

        return driver;
    }
}
//Запуск
//to generate allure report
// allure generate --clean --output allure-results
// allure serve -h localhost
//to restart appium
// adb uninstall io.appium.uiautomator2.server
// adb uninstall io.appium.uiautomator2.server.test
//to find simulator id
// xcrun simctl list | grep Booted
// xcrun simctl list
// instruments -s devices
//to find bundleID
// osascript -e 'id of app ".../Library/Developer/Xcode/DerivedData/Mobikey-aoboaebbptbmibhkbzctthzxbpta/Build/Products/Release-iphonesimulator/Mobikey.app"'
//show taps on simulator
// defaults write com.apple.iphonesimulator ShowSingleTouches 1
