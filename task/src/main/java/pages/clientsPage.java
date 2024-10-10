package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class clientsPage {
    WebDriver driver;

public clientsPage(WebDriver driver){
    this.driver=driver;
}



    public void searchClient(String clientName){
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/main/div[3]/div[2]/div[2]/div/div[1]/div/div/label")).sendKeys(clientName);
    }



}
