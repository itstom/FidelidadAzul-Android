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
public class registrarUsuario extends base {
    public static void main (String[] args) throws MalformedURLException {
    AndroidDriver<AndroidElement> driver = capabilities();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElementByXPath("").click(); //Click en Registrar
    //Llenando el formulario
    driver.findElementByXPath("").sendKeys("");
    driver.findElementByXPath("").sendKeys("");
    driver.findElementByXPath("").sendKeys("");
    driver.findElementByXPath("").sendKeys("");
    driver.findElementByXPath("").click(); //Find element in dropdown and click again on next step
    driver.findElementByXPath("").click();
    driver.findElementById("").click(); //Checkbox Términos y condiciones
}
}
