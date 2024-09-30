package com.anhtester.Bai5_LocatorElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class XpathTuongDoi_1_5 {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        System.out.println(driver.findElement(By.xpath("//label[@for='email']")).getText());

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
        System.out.println(driver.findElement(By.xpath("//span[contains(normalize-space(),'Summary')]")).getText());
        driver.findElement(By.xpath("//a[starts-with(normalize-space(),'New Cus')]")).click();

        driver.quit();
    }
}
