package com.anhtester.Bai5_LocatorElement;

public class LocatorsCRM {

    //Login page
    public static String headerLogin = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String buttonLogin = "//button[normalize-space()='Login']";
    public static String checkboxRememberMe = "//input[@id='remember']";
    public static String linkForgotPassword = "//a[normalize-space()='Forgot Password?']";
    public static String alertErrorMassage = "//div[@id='alerts']/div";

    //Dashboard page
    public static String menuDashboard = "//span[normalize-space()='Dashboard']";
    public static String menuCustomers = "//span[normalize-space()='Customers']";
    public static String iconProfile = "//li[contains(@class,'header-user-profile')]";

    public static String totalInvoicesAwaitingPayment = "(//span[normalize-space()='Invoices Awaiting Payment']/parent::div)/following-sibling::span";
    public static String totalConvertedLeads = "(//span[normalize-space()='Converted Leads']/parent::div)/following-sibling::span";
    public static String totalProjectsInProgress = "(//span[normalize-space()='Projects In Progress']/parent::div)/following-sibling::span";
    public static String totalTasksNotFinished = "(//span[normalize-space()='Tasks Not Finished']/parent::div)/following-sibling::span";

    //Customer page

}
