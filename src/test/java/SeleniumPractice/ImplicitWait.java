package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) {
        //Declare instance
        WebDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open browser
        driver.get("https://www.syntaxprojects.com/synchronization-waits.php");

        //Global wait implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Click on the button to show text
        WebElement B1 = driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
        B1.click();
        WebElement textMsg = driver.findElement(By.xpath("//p[contains(text(),'Hello, this message appeared after you clicked the button')]"));
        System.out.println(textMsg.getText());

        //Click on the button to show checkbox
        WebElement B2 = driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']"));
        B2.click();
        WebElement RadioButton = driver.findElement(By.xpath("//input[@value='Male']"));
        RadioButton.click();

        //Click on the button to show checkbox
        WebElement B3 = driver.findElement(By.xpath("//button[@id='show_text_synchronize_03']"));
        B3.click();
        WebElement RadioButton2 = driver.findElement(By.xpath("//input[@value='Option-1']"));
        RadioButton2.click();





    }
}
