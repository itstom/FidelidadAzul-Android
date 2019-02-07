/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prometheus;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import java.net.MalformedURLException;
import static java.time.Duration.ofSeconds;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;

/**
 *
 * @author tomascruz
 */
public class onboarding extends base {
    
    public static void main (String[] args) throws MalformedURLException {
            AndroidDriver<AndroidElement> driver = capabilities();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
            TouchAction t = new TouchAction(driver);
            WebElement ds1 = driver.findElementByXPath("");
            WebElement ds2 = driver.findElementByXPath("");
            WebElement ds3 = driver.findElementByXPath("");
            t.longPress(longPressOptions().withElement(element(ds1)).withDuration(ofSeconds(1))).moveTo(element(ds2)).release().perform();
            t.longPress(longPressOptions().withElement(element(ds1)).withDuration(ofSeconds(1))).moveTo(element(ds2)).release().perform();
            t.longPress(longPressOptions().withElement(element(ds1)).withDuration(ofSeconds(1))).moveTo(element(ds2)).release().perform();

    
}
    }