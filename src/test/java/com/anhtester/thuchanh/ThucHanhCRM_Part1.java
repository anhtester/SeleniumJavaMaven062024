package com.anhtester.thuchanh;

import com.anhtester.LocatorsCRM;
import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;

public class ThucHanhCRM_Part1 extends BaseTest {
    public static void main(String[] args) throws InterruptedException {

        createDriver();

        loginCRM();

        driver.findElement(By.xpath(LocatorsCRM.menuCustomers)).click();

        System.out.println(driver.findElement(By.xpath(LocatorsCRM.headerCustomerPage)).getText());

        driver.findElement(By.xpath(LocatorsCRM.buttonAddNewCustomer)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorsCRM.inputCompany)).sendKeys("VNPT IT Ha Noi 03");
        driver.findElement(By.xpath(LocatorsCRM.inputVat)).sendKeys("10");
        driver.findElement(By.xpath(LocatorsCRM.inputPhoneNumber)).sendKeys("0123456789");
        driver.findElement(By.xpath(LocatorsCRM.inputWebsite)).sendKeys("https://vnptit.vn/");
        driver.findElement(By.xpath(LocatorsCRM.dropdownGroup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputSearchGroup)).sendKeys("VIP");
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.itemVIP)).click();
        driver.findElement(By.xpath(LocatorsCRM.dropdownGroup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.dropdownLanguage)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.itemVietnamese)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputAddress)).sendKeys("Ha Noi");
        driver.findElement(By.xpath(LocatorsCRM.inputCity)).sendKeys("Ha Noi");
        driver.findElement(By.xpath(LocatorsCRM.inputState)).sendKeys("Hoan Kiem");
        driver.findElement(By.xpath(LocatorsCRM.inputZipCode)).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.dropdownCountry)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCountry)).sendKeys("Vietnam");
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.itemVietnamCountry)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.buttonSave)).click();
        //Check alert message nếu có
        //Tiếp theo check item customer hiển thị tại trang Cutsomer list
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.menuCustomers)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCustomer)).sendKeys("VNPT IT Ha Noi 03");
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.itemCustomerFirst)).isDisplayed());
        System.out.println("Customer in List: " + driver.findElement(By.xpath(LocatorsCRM.itemCustomerFirst)).getText());
        //Tiếp theo check Customer đúng hết data sau khi add
        driver.findElement(By.xpath(LocatorsCRM.itemCustomerFirst)).click();
        Thread.sleep(2000);
        System.out.println("Company Detail: " + driver.findElement(By.xpath(LocatorsCRM.inputCompany)).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.inputVat)).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.inputPhoneNumber)).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.inputWebsite)).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.dropdownGroup)).getAttribute("title"));
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.dropdownLanguage)).getAttribute("title"));

        //Cuối cùng phải check dạng Integration (liên kết với module khác)
        //Ví dụ customer sẽ được hiển thị bên trang project (nằm trong dropdown)
        Thread.sleep(2000);
        closeDriver();

    }
}
