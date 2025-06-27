package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverCommands {
    public static void main(String[] args) throws InterruptedException {
        //Declare the instance
        WebDriver driver = new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //go to Facebook.com
        driver.get("https://facebook.com");

        //slow down the code just for the purpose of observation
        Thread.sleep(2000);

        //navigate to syntax projects website
        driver.navigate().to("https://syntaxprojects.com/");

        //slow down the code just for the purpose of observation
        Thread.sleep(2000);

        //go back to facebook.com
        driver.navigate().back();

        //go forward to syntaxprojects.com
        driver.navigate().forward();

        //slow down the code just for the purpose of observation
        Thread.sleep(2000);

        //refresh
        driver.navigate().refresh();

        //closing the browser
        driver.close();

    }
}
