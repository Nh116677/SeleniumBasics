package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Keys {


    public static void main(String[] args) throws InterruptedException {
        //Declare instance
        WebDriver driver = new ChromeDriver();
        //Maximize window
        driver.manage().window().maximize();
        //Open browser
        driver.get("https://syntaxprojects.com/keypress.php");
        //find the text box
        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
        //inputBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        //inputBox.sendKeys(Keys.TAB);
        

    }
}
