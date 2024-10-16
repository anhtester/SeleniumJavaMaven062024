package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class DemoDropdownListDynamic extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();

        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        Thread.sleep(3000);

        //Click vào dropdown Category
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();
        //Search giá trị cần chọn
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']/parent::a/following-sibling::div//input")).sendKeys("Travel");
        //Click chọn Text đã search (cần chọn)
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@class='active-result highlighted']")).click();

        //Cách ENTER dùng cho trường hợp chỉ hiển thị 1 giá trị lựa chọn
//        Actions action = new Actions(driver);
//        action.sendKeys(Keys.ENTER).perform();

        Thread.sleep(2000);
        closeDriver();
    }
}
