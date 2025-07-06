package SeleniumPractice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;


public class ScreenShot {
    public static void main(String[] args) throws IOException {

        //Declare instance
        WebDriver driver = new ChromeDriver();
        //Maximize window
        driver.manage().window().maximize();
        //Open browser
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        // cast the driver to take screenshot
        TakesScreenshot ss = (TakesScreenshot) driver;
        //Take screenshot
        File screenshot = ss.getScreenshotAs(OutputType.FILE);
        //save the ss to a place in your project
        FileUtils.copyFile(screenshot, new File("screenshot/image.png"));
    }
}