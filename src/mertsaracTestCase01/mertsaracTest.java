package mertsaracTestCase01;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class mertsaracTest extends BaseDriver {
    @Test
    public void messageBoxCheck() {
        driver.get("https://www.akakce.com/");

        WebElement loginButton = driver.findElement(By.cssSelector("[id='H_rl_v8'] > :nth-child(2)"));
        loginButton.click();
        Myfunc.wait(1);

        WebElement emailPlaceholder = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(4) input"));
        emailPlaceholder.sendKeys("team006test@gmail.com");
        Myfunc.wait(1);

        WebElement passwordPlaceholder = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(6) input"));
        passwordPlaceholder.sendKeys("Password123");
        Myfunc.wait(1);

        WebElement button = driver.findElement(By.cssSelector("[class='checkbox-wrapper']+label+a+input"));
        button.click();
        Myfunc.wait(1);

        //  WebElement accessAccount = driver.findElement(By.cssSelector("[id='HM_p_v8']+li+li+li+li"));
        WebElement accessAccount = driver.findElement(By.cssSelector("[id='HM_v8']> :nth-child(1)> :nth-child(1)"));
        accessAccount.click();
        Myfunc.wait(1);

        WebElement messagesButton = driver.findElement(By.cssSelector("[class='order first']> :nth-child(3)"));
        messagesButton.click();

        WebElement messagesBox = driver.findElement(By.cssSelector("div[class='wbb_v8'] p"));

        Assert.assertTrue("Listelenecek mesaj bulunamadı", messagesBox.getText().contains("Listelenecek mesaj bulunamadı."));

        WaitClose();
    }
}

