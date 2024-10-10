package com.anhtester.Bai7_WebDriver;

import com.anhtester.Bai5_LocatorElement.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DemoAddCookie {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/clients");
//        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
//        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).clear();
//        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
//        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
//        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        //Thread.sleep(1000);
        Cookie newCookie = new Cookie("sp_session", "994344b20bdd5dc743376a3a1ff41cade55eaa31");
        driver.manage().addCookie(newCookie);
        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.quit();
    }
}
