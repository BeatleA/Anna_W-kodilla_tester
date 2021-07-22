package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        driver.findElement(By.xpath("//*[@data-role=\"accept-consent\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-role=\"search-button\"]")));

        WebElement categoryCombo = driver.findElement(By.xpath("//select[@data-role=\"filters-dropdown-toggle\"]"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByVisibleText("Elektronika");

        WebElement inputField = driver.findElement(By.xpath("//input[@data-role=\"search-input\"]"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();
    }
}
