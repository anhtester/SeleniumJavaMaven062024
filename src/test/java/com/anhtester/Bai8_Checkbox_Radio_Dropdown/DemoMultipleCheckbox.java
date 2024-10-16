package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.Bai5_LocatorElement.LocatorsCRM;
import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DemoMultipleCheckbox extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();

        loginCRM();

        driver.findElement(By.xpath("//div[@class='screen-options-btn']")).click();

        Thread.sleep(2000);
        //Danh sách các checkbox
        List<WebElement> listCheckbox = driver.findElements(By.xpath("//div[@id='dashboard-options']//input[@type='checkbox']"));
        System.out.println("Tổng số checkbox: " + listCheckbox.size());

        //Duyệt từng checkbox trong list element
        for (int i = 0; i < listCheckbox.size(); i++) {
            System.out.println("Checkbox thứ " + (i + 1) + ": " + listCheckbox.get(i).isSelected());
        }

        //CÁCH XỬ LÝ THỨ HAI DÙNG XPATH INDEX
        System.out.println("==============================");
        for (int i = 1; i <= listCheckbox.size(); i++) {
            WebElement checkbox = driver.findElement(By.xpath("(//div[@id='dashboard-options']//input[@type='checkbox'])[" + i + "]"));
            System.out.println("Checkbox thứ " + i + ": " + checkbox.isSelected());
        }

        Thread.sleep(1000);
        closeDriver();
    }
}