package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverCommands {
    public static void main(String[] args) {
        //Declare the instance
        WebDriver driver = new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //got to Facebook.com
        driver.get("https://facebook.com");

        //navigate to syntax projects website
        driver.navigate().to("https://syntaxprojects.com/");

        //go back to facebook.com
        driver.navigate().back();

        //go forward to syntaxprojects.com
        driver.navigate().forward();

        //refresh
        driver.navigate().refresh();

        //closing the browser
        driver.close();

    }
}
