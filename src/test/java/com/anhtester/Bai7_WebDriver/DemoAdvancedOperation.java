package com.anhtester.Bai7_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntry;

import java.time.Duration;

public class DemoAdvancedOperation {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Đặt thời gian chời ngầm định cho tất cả các element (đơn vị Giây)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Thiết lập thời gian chờ Load page xong mới thao tác (tối đa 30s)
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));

        // Navigate to a page
        driver.navigate().to("https://anhtester.com");
        System.out.println(driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://google.com");
        System.out.println(driver.getWindowHandle());
        Thread.sleep(1000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getWindowHandle());

        Thread.sleep(2000);
        driver.quit();

    }
}
