package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

//        Alert alert = driver.switchTo().alert();
//        alert.accept();

        WebElement inputField = driver.findElement(By.xpath(
                "*//form[starts-with(@class,\"mp7g_oh\")]/input")); // [4]
        inputField.sendKeys("Mavic mini");

        WebElement category = driver.findElement(
                By.xpath("*//form[starts-with(@class,\"mp7g_oh\")]/div/div/select"));

        Select categorySelection;
        categorySelection = new Select(category);
        categorySelection.selectByIndex(2);

        WebElement search = driver.findElement(By.xpath("*//form[starts-with(@class,\"mp7g_oh\")]/button"));
        search.click();
    }

}
