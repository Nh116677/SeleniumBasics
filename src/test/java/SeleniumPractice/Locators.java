package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        //Steps:
        //1. Open the Chrome Browser
        //2. Navigate to the website
        //3. Find element with the id " first_name" and sendtext "John"
        //4. Find element with name " last_name" and send text "Doe"
        //5. Find element with classname " btn btn=primary"  and click on it

        //declare the instance
        WebDriver driver = new ChromeDriver();

        //maximize the screen
        driver.manage().window().maximize();

        //navigate to syntax products
        driver.get("https://syntaxprojects.com/input-form-locator.php");

        //send the firstname to the text box
        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.sendKeys("John");

        //send the lastname

        WebElement lastName = driver.findElement((By.name("last_name")));
        lastName.sendKeys("Smith");

        //send by email

        WebElement email = driver.findElement(By.className("form-control-01"));
        email.sendKeys("nhu116677@gmail.com");

        //press the button submit
        WebElement submitBtn = driver.findElement(By.tagName("button"));
        submitBtn.click();

        //click on the first link
        WebElement link1=driver.findElement(By.linkText("Click Here."));
        link1.click();

        // click on second link
        WebElement link2= driver.findElement(By.partialLinkText("Link"));
        link2.click();

    }
}
