package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement username = driver.findElement(By.name("username"));

        username.sendKeys(Keys.CONTROL+"abc");
        username.sendKeys(Keys.DELETE);
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        Thread.sleep(2000);

        WebElement login=driver.findElement(By.tagName("button"));
       String logiin=login.getText();
        System.out.println("the text from login button is : "+logiin);

        login.click();




    }
}
