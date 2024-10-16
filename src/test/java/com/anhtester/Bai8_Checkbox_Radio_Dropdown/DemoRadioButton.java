package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.Bai5_LocatorElement.LocatorsCRM;
import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class DemoRadioButton extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();

        loginCRM();

        driver.findElement(By.xpath(LocatorsCRM.menuSales)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.menuProposals)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.buttonNewProposal)).click();
        Thread.sleep(2000);

        //Scroll đến element
        WebElement element = driver.findElement(By.xpath("//input[@id='2']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);

        //Tích chọn Radio Button
        //driver.findElement(By.xpath("//input[@id='2']")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Hours']")).click();

        Thread.sleep(1000);
        //Kiểm tra radio button đã được check hay chưa
        boolean isSelected = driver.findElement(By.xpath("//input[@id='2']")).isSelected();
        System.out.println("isSelected (Hours): " + isSelected);

        System.out.println("isSelected (Qty): " + driver.findElement(By.xpath("//input[@id='1']")).isSelected());
        System.out.println("isSelected (Qty/Hours): " + driver.findElement(By.xpath("//input[@id='3']")).isSelected());

        //Nếu chưa được check thì click vào nút radio button đó
//        if (isSelected == false) {
//            driver.findElement(By.xpath("//input[@id='1']")).click();
//        }

        Thread.sleep(2000);
        closeDriver();
    }
}
