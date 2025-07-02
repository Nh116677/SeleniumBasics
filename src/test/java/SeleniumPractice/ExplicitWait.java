package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ExplicitWait {
    public static void main(String[] args) {
        //Declare instance
        WebDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        driver.get("https://www.syntaxprojects.com/synchronization-explicit-wait.php");

        //click on the button to show the alert
        WebElement alertButton = driver.findElement(By.xpath("//button[@id='show_alert']"));
        alertButton.click();

        //wait until the alert appears
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        //Handle the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //Click on the button to change the text and bring the changed text on console
        WebElement button2 = driver.findElement(By.xpath("//button[@id='changetext_button']"));
        button2.click();
        //Wait until the text is changed
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));
        WebElement textMsg = driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(textMsg.getText());

        //Click on the button to display button
        //WebElement button3 = driver.findElement(By.xpath("//button[@id='display_button']"));
       // button3.click();
        //Wait until button display
        //wait.until(ExpectedConditions.invisibilityOf(By.xpath("//span[@id='displaybutton']"));


    }

}
