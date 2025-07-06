package SeleniumPractice;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {
    public static void main(String[] args) {
        //Declare instance
        WebDriver driver = new ChromeDriver();
        //Maximize window
        driver.manage().window().maximize();
        //Open browser
        driver.get("https://syntaxprojects.com/simple_context_menu.php");
        WebElement button = driver.findElement(By.xpath("//button[text]()='Hover me!']"));
        //JS Executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments(0).style.border='3px solid red'", button);
        //Scroll down
        js.executeScript("window.scrollBy(0,1000");
        //scroll up
        js.executeScript("window.scrollBy(0,-1000");

    }
}

