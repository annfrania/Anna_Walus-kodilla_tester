package com.kodilla.selenium.kodilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaTestingApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/sign-in");

        WebElement inputField = driver.findElement(By.xpath("//html/body/div/div/form/fieldset/input")); // [4]
        inputField.sendKeys("tester@gmail.com");

        inputField = driver.findElement(By.xpath("//html/body/div/div/form/fieldset[2]/input"));
        inputField.sendKeys("Haslo");

        WebElement submit = driver.findElement(By.xpath("//html/body/div[1]/div/form/div[2]/button")); // [4]
        submit.click();

    }
}
