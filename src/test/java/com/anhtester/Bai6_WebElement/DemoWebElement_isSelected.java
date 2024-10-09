package com.anhtester.Bai6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebElement_isSelected {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");
        driver.findElement(By.xpath("//button[normalize-space()='Run this project']")).click();
        System.out.println(driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//button[normalize-space()='\"Hacked\" Submit button']")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//button[normalize-space()='\"Hacked\" Submit button']")).getText());

        driver.quit();
    }
}
