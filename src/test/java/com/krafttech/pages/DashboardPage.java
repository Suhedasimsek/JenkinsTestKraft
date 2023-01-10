package com.krafttech.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//h1[.='Dashboard']")
    public WebElement dashboardPageTitle_loc;

    @FindBy(xpath = "(//span[.='</aFm>'])[1]")
    public WebElement aFMTitle_loc;

    @FindBy(xpath = "//span[@class='d-none d-md-block dropdown-toggle ps-2']")
    public WebElement userPopUp_loc;

    @FindBy(xpath = "(//span[.='My Profile'])[2]")
    public WebElement myProfile_loc;

    @FindBy(xpath = "//a[.='Home'")
    public WebElement homeLink_loc;

    @FindBy(xpath = "//span[.='Sign Out']")
    public WebElement signOut_loc;

    @FindBy (xpath = "//div[@class='copyright']")
    public WebElement copyright_loc;

    @FindBy(xpath = "//h3[.='isa akyuz']")
    public WebElement isaUser_loc;

    @FindBy(xpath = "//span[.='JavaScript']")
    public WebElement tabLocator_loc;

    @FindBy(xpath = "//span[.='Modal']")
    public WebElement moduleLocator_loc;

    @FindBy(xpath = "//a[@class='nav-link nav-profile d-flex align-items-center pe-0']")
    public WebElement getUserName_loc;



    public String dashboardPageTitle(String title){
        String Title=dashboardPageTitle_loc.getText();
        return Title;
    }


}
