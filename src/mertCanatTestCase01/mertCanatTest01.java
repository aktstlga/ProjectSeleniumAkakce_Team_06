package mertCanatTestCase01;

import Utlity.BaseDriver;
import Utlity.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class mertCanatTest01 extends BaseDriver {

    @Test
    public void Test1(){
        driver.navigate().to("https://www.akakce.com/");

        WebElement gbutton = driver.findElement(By.cssSelector("[id='H_rl_v8']> :nth-child(2)"));
        gbutton.click();

        WebElement email= driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(4) input"));
        email.sendKeys("team006test@gmail.com");
        Myfunc.Bekle(1);

        WebElement password= driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(6) input"));
        password.sendKeys("Password123");
        Myfunc.Bekle(1);

        WebElement submitButton= driver.findElement(By.cssSelector("[class='checkbox-wrapper']+label +a+input"));
        submitButton.click();
        Myfunc.Bekle(1);

        WebElement akakçeAnasayfa=driver.findElement(By.cssSelector("div[id='H_v8']"));

        Assert.assertTrue("Aranan mesaj bulunamadı", akakçeAnasayfa.getText().contains("Kategoriler"));


        driver.quit();
        Myfunc.Bekle(2);

    }
    @Test
    public void Test2(){
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.akakce.com/");

        WebElement gbutton = driver.findElement(By.cssSelector("[id='H_rl_v8']> :nth-child(2)"));
        gbutton.click();

        WebElement email2= driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(4) input"));
        email2.sendKeys("team006test@gmail.com");
        Myfunc.Bekle(1);

        WebElement password2= driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(6) input"));
        password2.sendKeys("123456");
        Myfunc.Bekle(1);

        WebElement submitButton2= driver.findElement(By.cssSelector("[class='checkbox-wrapper']+label +a+input"));
        submitButton2.click();
        Myfunc.Bekle(1);


    }
    @Test
    public void Test3(){
        driver.get("https://www.akakce.com/");

        WebElement gbutton = driver.findElement(By.cssSelector("[id='H_rl_v8']> :nth-child(2)"));
        gbutton.click();

        WebElement email3= driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(4) input"));
        email3.sendKeys("team006test@gmail");
        Myfunc.Bekle(1);

        WebElement password3= driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(6) input"));
        password3.sendKeys("Password123");
        Myfunc.Bekle(1);

        WebElement submitButton3= driver.findElement(By.cssSelector("[class='checkbox-wrapper']+label +a+input"));
        submitButton3.click();
        Myfunc.Bekle(1);

    }
    @Test
    public void Test4(){
        driver.get("https://www.akakce.com/");

        WebElement gbutton = driver.findElement(By.cssSelector("[id='H_rl_v8']> :nth-child(2)"));
        gbutton.click();

        WebElement email4= driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(4) input"));
        email4.sendKeys("");
        Myfunc.Bekle(1);

        WebElement password4= driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(6) input"));
        password4.sendKeys("");
        Myfunc.Bekle(1);

        WebElement submitButton4= driver.findElement(By.cssSelector("[class='checkbox-wrapper']+label +a+input"));
        submitButton4.click();
        Myfunc.Bekle(1);

    }

}


