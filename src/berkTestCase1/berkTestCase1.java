package berkTestCase1;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class berkTestCase1 extends BaseDriver {
    @Test
    public void US_102() {
        driver.get("https://www.akakce.com/");
        Myfunc.wait(1);
        WebElement gbutton = driver.findElement(By.cssSelector("[id='H_rl_v8']> :nth-child(2)"));
        gbutton.click();
        Myfunc.wait(1);
        WebElement email = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(4) input"));
        email.sendKeys("team006test@gmail.com");
        Myfunc.wait(1);
        WebElement password = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(6) input"));
        password.sendKeys("Password123");
        Myfunc.wait(1);
        WebElement button = driver.findElement(By.cssSelector("[class='checkbox-wrapper']+label+a+input"));
        button.click();
        Myfunc.wait(1);
        WebElement message = driver.findElement(By.cssSelector("[id='HM_v8']>i>a"));
        Assert.assertTrue("Aranan mesaj bulunamadı.", message.getText().contains("Testing"));
        WaitClose();
    }
    @Test
    public void US_103() {
        Driver();
        driver.get("https://www.akakce.com/");
        Myfunc.wait(1);
        WebElement gbutton = driver.findElement(By.cssSelector("[id='H_rl_v8']> :nth-child(2)"));
        gbutton.click();
        Myfunc.wait(1);
        WebElement email = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(4) input"));
        email.sendKeys("team006test@gmail.com");
        Myfunc.wait(1);
        WebElement password = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(6) input"));
        password.sendKeys("Password123");
        Myfunc.wait(1);
        WebElement button = driver.findElement(By.cssSelector("[class='checkbox-wrapper']+label+a+input"));
        button.click();
        Myfunc.wait(1);
        WebElement message = driver.findElement(By.cssSelector("[id='HM_v8']>i>a"));
        Assert.assertTrue("Aranan mesaj bulunamadı.", message.getText().contains("TestName"));
        WebElement account = driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        account.click();
        Myfunc.wait(1);
        WebElement exit = driver.findElement(By.cssSelector("[id='HM_p_v8']+li+li+li+li+li a"));
        exit.click();
        WaitClose();
    }
}
