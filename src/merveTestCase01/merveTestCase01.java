package merveTestCase01;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class merveTestCase01 extends BaseDriver {
        @Test
        public void Test() throws InterruptedException {
                driver.get("https://www.akakce.com/");

                WebElement loginButton = driver.findElement(By.cssSelector("a[href*='giris']"));
                loginButton.click();
                Thread.sleep(3000);

                WebElement emailField = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(4) input (email)]"));
                WebElement passwordField = driver.findElement(By.cssSelector("[id='FrmLi']> :nth-child(6) input (password)]"));
                WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));

                emailField.sendKeys("team006test @gmail.com");
                passwordField.sendKeys("Password123");
                submitButton.click();
                Thread.sleep(3000);

                WebElement accountMenu = driver.findElement(By.cssSelector("div[class*='user-menu']"));
                Assert.assertTrue("Giriş başarısız!", accountMenu.isDisplayed());

                WebElement myAccountLink = driver.findElement(By.cssSelector("a[href*='hesabim']"));
                myAccountLink.click();
                Thread.sleep(3000);

                WebElement orderListLink = driver.findElement(By.cssSelector("a[href*='siparislerim']"));
                orderListLink.click();
                Thread.sleep(3000);

                WebElement emptyMessage = driver.findElement(By.cssSelector("div.order-empty-message"));

                String expectedMessage = "Henüz siparişiniz bulunmamaktadır.";
                Assert.assertEquals(emptyMessage.getText().trim(), expectedMessage, "Boş sipariş listesi mesajı hatalı!");

                driver.quit();
        }
}
