package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroAnotherTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        driver.findElement(By.cssSelector("div > button[data-role=\"accept-consent\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-role=\"search-button\"]")));

        WebElement categoryCombo = driver.findElement(By.cssSelector("select[data-role=\"filters-dropdown-toggle\"]"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByVisibleText("Elektronika");

        WebElement inputField = driver.findElement(By.cssSelector("input[data-role=\"search-input\"]"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section>article")));

        List<WebElement> elements = driver.findElements(By.cssSelector("section>article"));
        System.out.println(elements.get(0).getText());
    }
}
