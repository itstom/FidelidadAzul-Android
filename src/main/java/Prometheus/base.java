/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prometheus;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 *
 * @author tomascruz
 */
public class base {
    
    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
    {   
        AndroidDriver<AndroidElement> driver;
        //File appDir = new File("src");
        //File app = new File("prometheus-stag.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
        //capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability("appPackage", "com.gcs.prometheus.stag");
        capabilities.setCapability("appActivity", "com.gcs.prometheus.MainActivity");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       return driver;
}
    }
        }
           
        

