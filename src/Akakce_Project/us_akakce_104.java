package Akakce_Project;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class us_akakce_104 extends BaseDriver {

    @Test
    public void AccountSuccesfullyOpened(){
        driver.navigate().to("https://www.akakce.com/");

        WebElement button = driver.findElement(By.cssSelector("[id='H_rl_v8']> :nth-child(2)"));
        button.click();

        WebElement email= driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(4) input"));
        email.sendKeys("team006test@gmail.com");
        Myfunc.wait(1);

        WebElement password= driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(6) input"));
        password.sendKeys("Password123");
        Myfunc.wait(1);

        WebElement submitButton= driver.findElement(By.cssSelector("[class='checkbox-wrapper']+label +a+input"));
        submitButton.click();
        Myfunc.wait(1);

        WebElement akakceAnasayfa=driver.findElement(By.cssSelector("div[id='H_v8']"));

        Assert.assertTrue("Aranan mesaj bulunamadı", akakceAnasayfa.getText().contains("Kategoriler"));

        driver.quit();
        Myfunc.wait(2);
    }

    @Test
    public void falseEmail() {
        Driver();

        driver.get("https://www.akakce.com/");

        WebElement button = driver.findElement(By.cssSelector("[id='H_rl_v8']> :nth-child(2)"));
        button.click();

        WebElement email2 = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(4) input"));
        email2.sendKeys("team006test@gmail.com");
        Myfunc.wait(1);

        WebElement password2 = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(6) input"));
        password2.sendKeys("123456");
        Myfunc.wait(1);

        WebElement submitButton2 = driver.findElement(By.cssSelector("[class='checkbox-wrapper']+label +a+input"));
        submitButton2.click();
        Myfunc.wait(1);

        WebElement akakceAnasayfa=driver.findElement(By.cssSelector("div[id='H_m_l_v8']"));
        Assert.assertTrue("Aranan mesaj bulunamadı", akakceAnasayfa.getText().contains("akakçe"));
    }

        @Test
        public void falsePassword () {

            driver.get("https://www.akakce.com/");

            WebElement button = driver.findElement(By.cssSelector("[id='H_rl_v8']> :nth-child(2)"));
            button.click();

            WebElement email3 = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(4) input"));
            email3.sendKeys("team006test@gmail");
            Myfunc.wait(1);

            WebElement password3 = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(6) input"));
            password3.sendKeys("Password123");
            Myfunc.wait(1);

            WebElement submitButton3 = driver.findElement(By.cssSelector("[class='checkbox-wrapper']+label +a+input"));
            submitButton3.click();
            Myfunc.wait(1);

            WebElement akakceAnasayfa=driver.findElement(By.cssSelector("div[id='H_m_l_v8']"));
            Assert.assertTrue("Aranan mesaj bulunamadı", akakceAnasayfa.getText().contains("akakçe"));
        }


    @Test
    public void PleaseFillTheMissingField(){
        driver.get("https://www.akakce.com/");

        WebElement button = driver.findElement(By.cssSelector("[id='H_rl_v8']> :nth-child(2)"));
        button.click();

        WebElement email4= driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(4) input"));
        email4.sendKeys("");
        Myfunc.wait(1);

        WebElement password4= driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(6) input"));
        password4.sendKeys("");
        Myfunc.wait(1);

        WebElement submitButton4= driver.findElement(By.cssSelector("[class='checkbox-wrapper']+label +a+input"));
        submitButton4.click();
        Myfunc.wait(1);

        WebElement akakceAnasayfa=driver.findElement(By.cssSelector("div[id='H_m_l_v8']"));
        Assert.assertTrue("Aranan mesaj bulunamadı", akakceAnasayfa.getText().contains("akakçe"));
    }
}


