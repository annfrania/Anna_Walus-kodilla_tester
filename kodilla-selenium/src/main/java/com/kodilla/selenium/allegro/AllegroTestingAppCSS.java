package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingAppCSS {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement inputField = driver.findElement(By.cssSelector(
                "div > div > form > input"));
        inputField.sendKeys("Mavic mini");

        WebElement category = driver.findElement(
                By.cssSelector("div > form > div > div > select"));

        Select categorySelection;
        categorySelection = new Select(category);
        categorySelection.selectByIndex(2);

        WebElement search = driver.findElement(By.cssSelector("form > button > svg > image"));
        search.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("article[data-analytics-view-custom-analytics-id='429c2868-7198-497a-b351-b6aa3440e691']")));

        List<WebElement> elements = driver.findElements(By.cssSelector("section > article"));
        elements.get(0).getText();
}
}
