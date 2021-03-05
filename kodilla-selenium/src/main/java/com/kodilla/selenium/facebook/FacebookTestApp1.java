package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestApp1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

//        driver.navigate().to("https://www.facebook.com");
//        driver.switchTo().frame(0);

        WebElement accept = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]"));
        accept.click();

        //kliknięcie przycisku utworzenia nowego konta
        WebElement newAccount = driver.findElement(By.xpath("//html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
        newAccount.click();

        //zaczekanie ??
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[3]")));

        WebElement yearCombo1= driver.findElement(By.xpath("//select[3]"));
        Select yearSelect1 = new Select(yearCombo1);
        yearSelect1.selectByIndex(5);
    }
}