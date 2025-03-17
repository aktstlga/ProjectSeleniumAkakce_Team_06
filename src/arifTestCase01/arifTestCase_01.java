package arifTestCase01;

import Utlity.BaseDriver;
import Utlity.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class arifTestCase_01 extends BaseDriver {
    @Test

    public void Test1(){
        driver.get("https://www.akakce.com/");
        Myfunc.Bekle(3);

        WebElement haButton = driver.findElement(By.cssSelector("div[id='H_rl_v8']> :nth-child(1)"));
        haButton.click();

        Myfunc.Bekle(2);
        WebElement ad = driver.findElement(By.cssSelector("label[for='rnufn']+span input"));
        ad.sendKeys("arif");

        Myfunc.Bekle(1);
        WebElement soyad = driver.findElement(By.cssSelector("label[for='rnufs']+span input"));
        soyad.sendKeys("etili");

        Myfunc.Bekle(1);
        WebElement ePosta = driver.findElement(By.cssSelector("label[for='rnufe1']+span input"));
        ePosta.sendKeys("arif@example.com");

        Myfunc.Bekle(1);
        WebElement ePostaTekrar = driver.findElement(By.cssSelector("label[for='rnufe2']+span input"));
        ePostaTekrar.sendKeys("arif@example.com");





    }

}
