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
public class eliminarTarjeta extends base {
    public static void main (String[] args) throws MalformedURLException {
    AndroidDriver<AndroidElement> driver = capabilities();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElementByXPath("").click(); //Mis tarjetas
    driver.findElementByXPath("").click(); //Click en el botón de Eliminar
    driver.findElementByXPath("").click(); //Click en el botón de Confirmar
    driver.findElementByXPath("").click(); //Click en el botón de Inicio
    driver.close();
}
}
