package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DemoDropdownListStatic extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();

        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(2000);
        //Scroll đến element
        WebElement element = driver.findElement(By.xpath("//h1[normalize-space()='Select Menu']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        //Tạo class Select từ Selenium
        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));

        Thread.sleep(2000);
        //Select option theo text hiển thị
        select.selectByVisibleText("Purple");

        Thread.sleep(1000);
        //Get giá trị sau khi đã chọn
        System.out.println(select.getFirstSelectedOption().getText());

        Thread.sleep(1000);
        select.selectByValue("7");
        Thread.sleep(1000);
        select.selectByIndex(3);

        Thread.sleep(1000);
        closeDriver();
    }
}