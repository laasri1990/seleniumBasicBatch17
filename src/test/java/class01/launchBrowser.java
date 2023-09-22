package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");// navigate to the website

        driver.manage().window().maximize();// maximas the window make it take all the screen

        String currenturl=driver.getCurrentUrl(); // get the url of the website
        System.out.println("the current url is : "+currenturl);

        String title=driver.getTitle(); //get the title
        System.out.println("the title of the page is : "+title);

        Thread.sleep(2000);// waiting for 2 seconds before  closing the browser

        driver.quit();

    }
}
