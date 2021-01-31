package com.qa.pages;

import com.qa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WidgetsPage extends BasePage {

    String frmDiv = "//div[text()='Forms']";
    String prtceFrm = "//span[text()='Practice Form']";
    String stuRegFrm = "//h5[text()='Student Registration Form']";
    String fname = "firstName";
    String stFname = "Test1";
    String lname = "lastName";
    String lstName = "LastTest";
    String email = "userEmail";
    String emilAdrs = "testemail@test.com";
    String gender = "//div[@class='col-md-9 col-sm-12']//div";
    String mobNum= "userNumber";
    String bithDy = "dateOfBirthInput";
    String sprts = "//div[contains(@class,'custom-control custom-checkbox')][1]";
    String chseImge = "uploadPicture";
    String frmheadr = "example-modal-sizes-title-lg";
    String closeBtn = "closeLargeModal";
    String submitBtn = "submit";

    public WidgetsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isFormClicked(){
        return isClick(By.xpath(frmDiv));
    }

    public  boolean isPracticeFormClicked(){
        return isClick(By.xpath(prtceFrm));
    }

    public boolean isStudentForm(){
        return isAvailable(By.xpath(stuRegFrm));
    }

    public boolean addNames(){
        return type(By.id(fname), stFname) && type(By.id(lname), lstName);
    }

    public boolean addEmail(){
        return type(By.id(email), emilAdrs);
    }

    public boolean selectGender(){
        return isClick(By.xpath(gender));
    }

    public boolean isMobNum (){
        return type(By.id(mobNum), "0232446223");
    }

    public boolean addBDay(){
        isClick(By.id(bithDy));
        selectFromList(By.className("react-datepicker__year-select"), "1989");
        return isClick(By.xpath("//div[@class='react-datepicker__week'][2]/div[3]"));
    }

    public boolean addHobbies(){
        return isClick(By.xpath(sprts));
    }

    public boolean addImage(){
        try {
            WebElement el = getElement(By.id(chseImge));
            el.sendKeys("/Users/rkariyawas/Downloads/propic.jpg");
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }

    }


    public boolean isFrmSubmit() {
        scrollDown();
        return isClick(By.id(submitBtn));
    }

    public boolean isFormsent(){
        return isAvailable(By.id(frmheadr));
    }

    public boolean isClosePopup(){
        return isClick(By.id(closeBtn));
    }

}
