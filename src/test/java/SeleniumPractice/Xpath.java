package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        //Declare the instance
        WebDriver driver = new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //go to https://syntaxprojects.com/Xpath.php
        driver.get("https://syntaxprojects.com/Xpath.php");

        //find the username and send text to it
        WebElement username = driver.findElement(By.xpath("//input[@id='title']"));
        username.sendKeys("Nhu");

        //Find the button and click on it
        WebElement button = driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();

        //Find the security textbox
        WebElement securityQuestion = driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        securityQuestion.sendKeys("What is your school name?");

        //Find Text
        WebElement text = driver.findElement(By.xpath("//label[contains(text(),'amet consectetur adipisicing elit')]"));
        String textOfString = text.getText();
        System.out.println(textOfString);

        //Enter api Setting
        WebElement apiSetting = driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings0')]"));
        apiSetting.sendKeys("Hello");

        //Find the field1
        WebElement field1= driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        field1.sendKeys("Hello I am field 1");

        //Find email2
        WebElement email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("nhu116677@gmail.com");


    }
}
