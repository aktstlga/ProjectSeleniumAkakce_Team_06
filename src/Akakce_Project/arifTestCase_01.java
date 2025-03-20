package Akakce_Project;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class arifTestCase_01 extends BaseDriver {
    @Test

    public void TestOpenAccount(){
        driver.get("https://www.akakce.com/");
        Myfunc.wait(3);

        WebElement oaButton = driver.findElement(By.cssSelector("div[id='H_rl_v8']> :nth-child(1)"));
        oaButton.click();

        Myfunc.wait(2);
        WebElement name = driver.findElement(By.cssSelector("label[for='rnufn']+span input"));
        name.sendKeys("TestName");

        Myfunc.wait(1);
        WebElement surname = driver.findElement(By.cssSelector("label[for='rnufs']+span input"));
        surname.sendKeys("TestSurname");

        Myfunc.wait(1);
        WebElement email = driver.findElement(By.cssSelector("label[for='rnufe1']+span input"));
        email.sendKeys("team006test@gmail.com");

        Myfunc.wait(1);
        WebElement emailRepeat = driver.findElement(By.cssSelector("label[for='rnufe2']+span input"));
        emailRepeat.sendKeys("team006test@gmail.com");

        Myfunc.wait(1);
        WebElement password = driver.findElement(By.cssSelector("label[for='rnufp1']+span input"));
        password.sendKeys("Password123");

        Myfunc.wait(1);
        WebElement repeatpassword = driver.findElement(By.cssSelector("label[for='rnufp2']+span input"));
        repeatpassword.sendKeys("Password123");

        Myfunc.wait(1);
        WebElement female = driver.findElement(By.cssSelector("form[id='FrmRnuS']> :nth-child(17) > :nth-child(1) input"));
        female.click();

        // Myfunc.Bekle(1);
        // WebElement male = driver.findElement(By.cssSelector("form[id='FrmRnuS']> :nth-child(17) > :nth-child(2) input"));
        // male.click();

        Myfunc.wait(1);
        WebElement city = driver.findElement(By.cssSelector("form[id='FrmRnuS']> :nth-child(18) > :nth-child(2)> :nth-child(4)"));
        city.click();

        Myfunc.wait(1);
        WebElement town = driver.findElement(By.cssSelector("form[id='FrmRnuS']> :nth-child(19) >:nth-child(2)> :nth-child(6)"));
        town.click();

        Myfunc.wait(1);
        WebElement dayofBirthday = driver.findElement(By.cssSelector("form[id='FrmRnuS']> :nth-child(23) > :nth-child(1) > :nth-child(1)> :nth-child(2)"));
        dayofBirthday.click();

        Myfunc.wait(1);
        WebElement mouthofBirthday = driver.findElement(By.cssSelector(" form[id='FrmRnuS']> :nth-child(23) > :nth-child(2) > :nth-child(1) > :nth-child(2)"));
        mouthofBirthday.click();


        Myfunc.wait(1);
        WebElement yearofBirthday = driver.findElement(By.cssSelector(" form[id='FrmRnuS']> :nth-child(23) > :nth-child(3) > :nth-child(1)> :nth-child(24)"));
        yearofBirthday.click();

        Myfunc.wait(1);
        WebElement TermsOfUse = driver.findElement(By.cssSelector(" form[id='FrmRnuS']> :nth-child(24)> :nth-child(1) input"));
        TermsOfUse.click();

        Myfunc.wait(1);
        WebElement OpenAccount = driver.findElement(By.cssSelector(" input[id='rnufced']+input"));
        OpenAccount.click();

        WebElement userName=driver.findElement(By.cssSelector("div[id='HM_v8']>i>a"));
        System.out.println("AccountName = " + userName.getText());
        Myfunc.wait(1);

        Assert.assertTrue("aranılan mesaj bulunamadı",userName.getText().contains("TestName"));

        WaitClose();

    }

}
