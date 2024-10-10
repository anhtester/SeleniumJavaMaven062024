package com.anhtester.Bai7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DemoBasicOperation {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to a page
        driver.navigate().to("http://anhtester.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='btn-login']")).click();
        Thread.sleep(1000);
        // Điều hướng về lịch sử trang trước đó
        driver.navigate().back();
        Thread.sleep(1000);
        // Làm mới trang hiện tại
        driver.navigate().refresh();
        Thread.sleep(1000);
        // Điều hướng đến trang tiếp sau
        driver.navigate().forward();
        Thread.sleep(1000);
        // Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // Get the current URL
        String url = driver.getCurrentUrl();
        System.out.println(url);
        // Get the current page HTML source
        String html = driver.getPageSource();
        System.out.println(html);

        driver.quit();
    }
}
