/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prometheus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author tomascruz
 */
public class actualizarFechaExpiracionTarjeta extends base {
    public static void main (String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElementByXPath("using").click(); //Click en actualizar
        driver.findElementByXPath("using").sendKeys(""); //CVV2
        driver.findElementByXPath("").sendKeys(""); //Mes
        driver.findElementByXPath("").sendKeys(""); //Año
        driver.findElementByXPath("").click(); //Actualizar
        driver.close();
}
}
