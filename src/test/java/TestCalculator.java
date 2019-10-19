import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestCalculator {

    AndroidDriver driver;
    SimpleCalculatorPage simplePage;

    @Before
    public void setup() throws MalformedURLException {
        URL server = new URL("http://0.0.0.0:4723/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".Calculator");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        driver = new AndroidDriver(server, capabilities);
        simplePage = new SimpleCalculatorPage(driver);
    }

    @Test
    public void addTwoNumbers() throws MalformedURLException {
//
//         to jest kod z recordera Appium
//        MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_4");
//        el1.click();
//        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("plus");
//        el2.click();
//        MobileElement el3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_6");
//        el3.click();
//        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("equals");
//        el4.click();
//
//        to jest kod napisany przed utworzeniem klasy SimpleCalculatorPage
//        WebElement sixButton = driver.findElementById("digit_6");
//        WebElement twoButton = driver.findElementById("digit_2");
//        WebElement plusButton = driver.findElementById("op_add");
//        WebElement equalsButton = driver.findElementById("eq");
//        WebElement result = driver.findElementById("result");

//        twoButton.click();
//        plusButton.click();
//        sixButton.click();
//        equalsButton.click();
//        Assert.assertEquals("8", result.getText());
        simplePage.two.click();
        simplePage.plus.click();
        simplePage.six.click();
        simplePage.equals.click();
        Assert.assertEquals("8", simplePage.result.getText());
    }

    @Test
    public void multiplyTwoNumbers() throws MalformedURLException {

//        to jest kod napisany przed utworzeniem klasy SimpleCalculatorPage
//        WebElement sixButton = driver.findElementById("digit_6");
//        WebElement twoButton = driver.findElementById("digit_2");
//        WebElement multiplyButton = driver.findElementById("op_mul");
//        WebElement equalsButton = driver.findElementById("eq");
//        WebElement resultMultiply = driver.findElementById("result");
//
//        twoButton.click();
//        multiplyButton.click();
//        sixButton.click();
//        equalsButton.click();
//        Assert.assertEquals("12", resultMultiply.getText());
        simplePage.two.click();
        simplePage.multiply.click();
        simplePage.six.click();
        simplePage.equals.click();
        Assert.assertEquals("12", simplePage.result.getText());
    }
}
