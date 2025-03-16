package berkTestCase1;

import Utlity.BaseDriver;
import Utlity.Myfunc;
import com.google.common.annotations.VisibleForTesting;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class berkTestCase1 extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.akakce.com/");
        Myfunc.Bekle(1);
        WebElement gbutton = driver.findElement(By.cssSelector("[id='H_rl_v8']> :nth-child(2)"));
        gbutton.click();
        Myfunc.Bekle(1);
        WebElement email = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(4) input"));
        email.sendKeys("team006test@gmail.com");
        Myfunc.Bekle(1);
        WebElement password = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(6) input"));
        password.sendKeys("Password123");
        Myfunc.Bekle(1);
        WebElement button = driver.findElement(By.cssSelector("[class='checkbox-wrapper']+label+a+input"));
        button.click();
        Myfunc.Bekle(1);
        WebElement message = driver.findElement(By.cssSelector("[id='HM_v8']>i>a"));
        Assert.assertTrue("Aranan mesaj bulunamadı.", message.getText().contains("Testing"));
        WaitClose();
    }
    @Test
    public void Test2() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.akakce.com/");
        Myfunc.Bekle(1);
        WebElement gbutton = driver.findElement(By.cssSelector("[id='H_rl_v8']> :nth-child(2)"));
        gbutton.click();
        Myfunc.Bekle(1);
        WebElement email = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(4) input"));
        email.sendKeys("team006test@gmail.com");
        Myfunc.Bekle(1);
        WebElement password = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(6) input"));
        password.sendKeys("Password123");
        Myfunc.Bekle(1);
        WebElement button = driver.findElement(By.cssSelector("[class='checkbox-wrapper']+label+a+input"));
        button.click();
        Myfunc.Bekle(1);
        WebElement message = driver.findElement(By.cssSelector("[id='HM_v8']>i>a"));
        Assert.assertTrue("Aranan mesaj bulunamadı.", message.getText().contains("Testing"));
        WebElement account = driver.findElement(By.cssSelector("[class='rw_v8']>div+div i+a"));
        account.click();
        Myfunc.Bekle(1);
        WebElement exit = driver.findElement(By.cssSelector("[id='HM_p_v8']+li+li+li+li+li a"));
        exit.click();
        WaitClose();
    }
}
