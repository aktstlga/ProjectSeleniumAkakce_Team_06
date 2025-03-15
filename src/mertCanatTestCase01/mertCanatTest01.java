package mertCanatTestCase01;

import Utlity.BaseDriver;
import Utlity.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class mertCanatTest01 extends BaseDriver {

    @Test
    public void Test1(){
        driver.navigate().to("https://www.akakce.com/akakcem/giris/");

        WebElement email= driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(4) input"));
        email.sendKeys("team006test@gmail.com");
        Myfunc.Bekle(2);

        WebElement password= driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(6) input"));
        password.sendKeys("Password123");
        Myfunc.Bekle(2);

        WebElement submitButton= driver.findElement(By.cssSelector("[class='checkbox-wrapper']+label +a+input"));
        submitButton.click();
        Myfunc.Bekle(2);


    }
}
