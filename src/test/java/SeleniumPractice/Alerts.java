package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws  InterruptedException{
        //Declare instance
        WebDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Go to the browser
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        //click on the button to display the alert
        WebElement Alert1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        Alert1.click();
        Thread.sleep(2000);

        //Accept the Alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        // click on the button to display the alert2
        WebElement Alert2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        Alert2.click();
        Thread.sleep(2000);
        alert.dismiss();

        //click on the button to display the alert3
        WebElement Alert3 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        Alert3.click();
        alert.sendKeys("Hello my name is Nhu");
        Thread.sleep(2000);
        alert.accept();







    }
}
