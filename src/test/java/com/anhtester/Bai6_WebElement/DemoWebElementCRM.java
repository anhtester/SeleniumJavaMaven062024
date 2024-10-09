package com.anhtester.Bai6_WebElement;

import com.anhtester.Bai5_LocatorElement.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebElementCRM {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin123@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        //driver.findElement(By.xpath(LocatorsCRM.inputPassword)).submit();

        //Get css
        System.out.println("Css background-color (Login button): " + driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("background-color"));
        System.out.println("Css color (Login button): " + driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("color"));
        System.out.println("Css font-size (Login button): " + driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("font-size"));
        System.out.println("Css height (Login button): " + driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("height"));
        System.out.println("Css width (Login button): " + driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("width"));
        System.out.println("Css font-family (Login button): " + driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("font-family"));

        //Get Attribute
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.inputEmail)).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.inputPassword)).getAttribute("value"));

        //Get size
        System.out.println("Height (Login button): " + driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getSize().height);
        System.out.println("Width (Login button): " + driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getSize().width);

        //Get Location
        System.out.println("X (Login button): " + driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getLocation().x);
        System.out.println("Y (Login button): " + driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getLocation().y);


        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        System.out.println("Tag Name Header: " + driver.findElement(By.xpath(LocatorsCRM.headerLogin)).getTagName());

        System.out.println("headerLogin: " + driver.findElement(By.xpath(LocatorsCRM.headerLogin)).getText());

        //isDisplayed
        System.out.println("alertErrorMassage: " + driver.findElement(By.xpath(LocatorsCRM.alertErrorMassage)).isDisplayed());

        driver.get("https://anhtester.com/");
        System.out.println("isDisplayed (header page display:none): " + driver.findElement(By.xpath("//h1[normalize-space()='Anh Tester Automation Testing']")).isDisplayed());
        System.out.println("isDisplayed (Login button): " + driver.findElement(By.xpath("//a[@id='btn-login']")).isDisplayed());

        driver.quit();
    }
}
