package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationCommands {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        driver.navigate().back(); // go back
        Thread.sleep(2000);

        driver.navigate().forward();//go forward
        Thread.sleep(2000);

        driver.navigate().refresh();

        driver.close(); // this method close the website and quit() close the hole browser
       // driver.quit(); we can also use this to close the browser

    }
}
