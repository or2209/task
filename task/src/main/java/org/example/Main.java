package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.clientsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "C:\\driver\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        clientsPage clientsPage = new clientsPage(driver);

        driver.get("https://homeassessment.tests.workiz.com/");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("MobileTesting@workiz.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("MobileTesting");
        driver.findElement(By.xpath("//*[@id=\"form-login\"]/div/div[1]/a/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[4]/a/p")).click();
        Thread.sleep(10000);
        clientsPage.searchClient("Timothy Clarke");
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/main/div[3]/div[2]/div[3]/div/div[1]/div[2]/div[1]/div/div[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/main/div[3]/div/div[1]/div/div[2]/div/span/button")).click();
        driver.findElement(By.xpath("//*[@id=\"create_lead\"]/a")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // מציאת גוף העמוד ולחיצה על חץ למטה 10 פעמים
        for (int i = 0; i < 35; i++) {
            driver.findElement(By.tagName("body")).sendKeys(Keys.ARROW_DOWN);
            try {
                Thread.sleep(500); // המתנה של חצי שניה בין כל לחיצה
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        driver.findElement(By.xpath("//*[@id=\"schedule\"]/div[1]/div/div/div[1]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"schedule\"]/div[1]/div/div/div[1]/div/span[1]/div/div[2]/div/div[2]/div[2]/div[2]/div[6]")).click();
        driver.findElement(By.xpath("//*[@id=\"newJobWrap\"]/div[2]/div[2]/button")).click();







    }
}