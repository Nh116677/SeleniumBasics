package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ActionsClass {
    public static void main(String[] args) throws InterruptedException {
        //Declare instance
        WebDriver driver = new ChromeDriver();
        //Maximize window
        driver.manage().window().maximize();
        //Open browser
        driver.get("https://syntaxprojects.com/simple_context_menu.php");
        //Hover the Button
        WebElement hoverbButton = driver.findElement(By.xpath("//button[text()='Hover me!']"));

        Actions action = new Actions(driver);
        action.moveToElement(hoverbButton).perform();

    }

}