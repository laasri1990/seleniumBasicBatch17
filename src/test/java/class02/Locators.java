package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver(); // instance

        driver.get("http://35.175.58.98/input-form-locator.php");
        driver.manage().window().maximize();

       WebElement firstname=driver.findElement(By.id("first_name")); // creat variable
       firstname.sendKeys("youssef");

       WebElement lastName=driver.findElement(By.name("last_name"));
       lastName.sendKeys("laasri");

       WebElement email=driver.findElement(By.className("form-control-01"));
       email.sendKeys("lasri35492@gmail.com");

       WebElement submit=driver.findElement(By.tagName("button"));
       submit.click();

       WebElement link=driver.findElement(By.linkText("Link"));
       link.click();

       WebElement clickhere=driver.findElement(By.partialLinkText("Here."));
       clickhere.click();



    }
}
