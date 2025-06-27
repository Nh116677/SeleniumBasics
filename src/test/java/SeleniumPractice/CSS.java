package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {

        //Declare the instance
        WebDriver driver = new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //go to https://syntaxprojects.com/cssSelector.php
        driver.get("https://syntaxprojects.com/cssSelector.php");

        //Find the profile id

        WebElement profileID = driver.findElement(By.cssSelector("input[id='profileID']"));
        profileID.sendKeys("Nhu");

        //Find the Profile
        WebElement profile = driver.findElement(By.cssSelector("input#profileBox"));
        profile.sendKeys("Amazon");

        //Find the feedback from Jenny
        WebElement feedbackByJenny = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedbackByJenny.sendKeys("This website is really cool!!!");

        //Find the feedback from Raj
        WebElement feedbackByRaj = driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackByRaj.sendKeys("This website is user friendly.");

        //Find email

        WebElement email = driver.findElement(By.cssSelector(".form-group input[name=\"email\"]\n"));
        email.sendKeys("jenny@gmail.com");

        //Find Course Topic
        WebElement courseTopic = driver.findElement(By.cssSelector("input[name*='23contentInput67']"));
        courseTopic.sendKeys("Selenium");

        //Find Intro to Advance CSS
        WebElement advanceCSS = driver.findElement(By.cssSelector("input[name^='IntroInput556']"));
        advanceCSS.sendKeys("Shortcuts to CSS Selector");

        //Find Conclusion of CSS Module
        WebElement cssModule = driver.findElement(By.cssSelector("input[name$='345Input']"));
        cssModule.sendKeys("CSS");






    }
}
