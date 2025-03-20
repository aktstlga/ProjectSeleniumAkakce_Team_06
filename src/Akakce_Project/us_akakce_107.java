package Akakce_Project;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class us_akakce_107 extends BaseDriver {
    @Test
    public void deleteAccountFailed() throws InterruptedException {
        driver.get("https://www.akakce.com");

        WebElement loginButton = driver.findElement(By.cssSelector("a[href='/akakcem/giris/']"));
        loginButton.click();

        WebElement emailPlaceholder = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(4) input"));
        emailPlaceholder.sendKeys("team006test@gmail.com");
        Thread.sleep(3000);

        WebElement passwordPlaceholder = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(6) input"));
        passwordPlaceholder.sendKeys("Password123");
        Thread.sleep(3000);

        WebElement girisYapButton = driver.findElement(By.cssSelector("input.s[value='Giriş yap']"));
        girisYapButton.click();
        Thread.sleep(3000);

        WebElement myAccountAccess = driver.findElement(By.cssSelector("a[rel='nofollow'][href='/akakcem/']"));
        myAccountAccess.click();

        Thread.sleep(3000);

        WebElement accessDeletePageButton = driver.findElement(By.cssSelector("a[href='/akakcem/kullanici-bilgilerim/uyelik-iptali/']"));
        accessDeletePageButton.click();
        Thread.sleep(3000);

        WebElement passwordForDelete = driver.findElement(By.cssSelector("input.t[type='password']"));
        passwordForDelete.sendKeys("test123"); //InvalidPassword
        Thread.sleep(3000);

        WebElement deleteButton = driver.findElement(By.cssSelector("input[value='Hesabımı sil']"));
        deleteButton.click();
        Thread.sleep(3000);

        WebElement warningOnFalsePassword = driver.findElement(By.cssSelector("div.alertX.t2 p"));
        Assert.assertTrue("Şifre girişi hatalı.", warningOnFalsePassword.getText().contains("Mevcut şifrenizi doğru girdiğinizden emin olun."));
        driver.quit();
    }
    @Test
    public void deleteAccount() throws InterruptedException {
        Driver();
        driver.get("https://www.akakce.com");

        WebElement loginButton = driver.findElement(By.cssSelector("a[href='/akakcem/giris/']"));
        loginButton.click();

        WebElement emailPlaceholder = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(4) input"));
        emailPlaceholder.sendKeys("team006test@gmail.com");
        Thread.sleep(3000);

        WebElement passwordPlaceholder = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(6) input"));
        passwordPlaceholder.sendKeys("Password123");
        Thread.sleep(3000);

        WebElement girisYapButton = driver.findElement(By.cssSelector("input.s[value='Giriş yap']"));
        girisYapButton.click();
        Thread.sleep(3000);

        WebElement myAccountAccess = driver.findElement(By.cssSelector("a[rel='nofollow'][href='/akakcem/']"));
        myAccountAccess.click();
        Thread.sleep(3000);

        WebElement accessDeletePageButton = driver.findElement(By.cssSelector("a[href='/akakcem/kullanici-bilgilerim/uyelik-iptali/']"));
        accessDeletePageButton.click();
        Thread.sleep(3000);

        WebElement passwordForDelete = driver.findElement(By.cssSelector("input.t[type='password']"));
        passwordForDelete.sendKeys("Password123"); //Valid
        Thread.sleep(3000);

        WebElement deleteButton = driver.findElement(By.cssSelector("input[value='Hesabımı sil']"));
        deleteButton.click();
        Thread.sleep(3000);

        driver.quit();
    }
}
