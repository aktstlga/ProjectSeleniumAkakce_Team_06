package tolgaTestCases;

import Utlity.BaseDriver;
import Utlity.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class us_akakce_107 extends BaseDriver {
    @Test
    public void deletingAccountOnAkakce() throws InterruptedException {
        driver.get("https://www.akakce.com");

        WebElement loginButton = driver.findElement(By.cssSelector("a[href='/akakcem/giris/']"));
        loginButton.click();

        WebElement emailPlaceholder = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(4) input"));
        emailPlaceholder.sendKeys("team006test@gmail.com");
        Thread.sleep(3000);

        WebElement passwordPlaceholder = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(6) input"));
        passwordPlaceholder.sendKeys("Password123");

        WebElement girisYapButton = driver.findElement(By.cssSelector("input.s[value='Giriş yap']"));
        girisYapButton.click();


    }
}
