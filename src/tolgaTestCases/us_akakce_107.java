package tolgaTestCases;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class us_akakce_107 extends BaseDriver {
   @Test
    public void deletingAccountOnAkakce(){
       driver.get("https://www.akakce.com");

       WebElement loginButton = driver.findElement(By.cssSelector("a[href='/akakcem/giris/']"));
       loginButton.click();
   }
}
